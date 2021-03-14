package com.kestrelcjx.system.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kestrelcjx.common.common.BaseQuery;
import com.kestrelcjx.common.config.CommonConfig;
import com.kestrelcjx.common.utils.CommonUtils;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.common.utils.StringUtils;
import com.kestrelcjx.system.common.BaseServiceImpl;
import com.kestrelcjx.system.constant.LayoutConstant;
import com.kestrelcjx.system.entity.Item;
import com.kestrelcjx.system.entity.Layout;
import com.kestrelcjx.system.entity.LayoutDesc;
import com.kestrelcjx.system.mapper.ItemMapper;
import com.kestrelcjx.system.mapper.LayoutMapper;
import com.kestrelcjx.system.query.LayoutQuery;
import com.kestrelcjx.system.service.ILayoutDescService;
import com.kestrelcjx.system.service.ILayoutService;
import com.kestrelcjx.system.utils.AdminUtils;
import com.kestrelcjx.system.vo.LayoutListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 布局服务实现类
 */
@Service
public class LayoutServiceImpl extends BaseServiceImpl<LayoutMapper, Layout> implements ILayoutService {
    @Autowired
    private LayoutMapper layoutMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ILayoutDescService layoutDescService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        LayoutQuery layoutQuery = (LayoutQuery) query;
        // 查询条件
        QueryWrapper<Layout> queryWrapper = new QueryWrapper<>();
        // 类型：1新闻资讯 2其他
        if (layoutQuery.getType() != null && layoutQuery.getType() > 0) {
            queryWrapper.eq("type", layoutQuery.getType());
        }
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");
        // 查询数据
        IPage<Layout> page = new Page<>(layoutQuery.getPage(), layoutQuery.getLimit());
        IPage<Layout> data = layoutMapper.selectPage(page, queryWrapper);
        List<Layout> layoutList = data.getRecords();
        List<LayoutListVo> layoutListVoList = new ArrayList<>();
        if (!layoutList.isEmpty()) {
            layoutList.forEach(item -> {
                LayoutListVo layoutListVo = new LayoutListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, layoutListVo);
                // 类型描述
                if (layoutListVo.getType() != null && layoutListVo.getType() > 0) {
                    layoutListVo.setTypeName(LayoutConstant.LAYOUT_TYPE_LIST.get(layoutListVo.getType()));
                }
                // 图片路径地址
                if (!StringUtils.isEmpty(layoutListVo.getImage())) {
                    layoutListVo.setImageUrl(CommonUtils.getImageURL(layoutListVo.getImage()));
                }
                // 页面编号
                if (layoutListVo.getItemId() != null && layoutListVo.getItemId() > 0) {
                    Item itemInfo = itemMapper.selectById(layoutListVo.getItemId());
                    if (itemInfo != null) {
                        layoutListVo.setItemName(itemInfo.getName());
                    }
                }
                // 获取页面位置描述
                LayoutDesc layoutDescInfo = layoutDescService.getLocDescById(layoutListVo.getItemId(), layoutListVo.getLocId());
                if (layoutDescInfo != null) {
                    layoutListVo.setLocDesc(String.format("%s=>%s", layoutDescInfo.getLocDesc(), layoutDescInfo.getLocId()));
                }
                // 添加人名称
                if (layoutListVo.getCreateUser() > 0) {
                    layoutListVo.setCreateUserName(AdminUtils.getName((layoutListVo.getCreateUser())));
                }
                // 更新人名称
                if (layoutListVo.getUpdateUser() > 0) {
                    layoutListVo.setUpdateUserName(AdminUtils.getName((layoutListVo.getUpdateUser())));
                }
                layoutListVoList.add(layoutListVo);
            });
        }
        return JsonResult.success("操作成功", layoutListVoList, data.getTotal());
    }

    /**
     * 获取记录详情
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public Object getInfo(Serializable id) {
        Layout entity = (Layout) super.getInfo(id);
        // 图片路径解析
        if (!StringUtils.isEmpty(entity.getImage())) {
            entity.setImage(CommonUtils.getImageURL(entity.getImage()));
        }
        return entity;
    }

    /**
     * 添加或编辑记录
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    public JsonResult edit(Layout entity) {
        // 图片路径
        if (entity.getImage().contains(CommonConfig.imageURL)) {
            entity.setImage(entity.getImage().replaceAll(CommonConfig.imageURL, ""));
        }
        return super.edit(entity);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public JsonResult deleteById(Integer id) {
        if (id == null || id == 0) {
            return JsonResult.error("记录ID不能为空");
        }
        Layout entity = this.getById(id);
        if (entity == null) {
            return JsonResult.error("记录不存在");
        }
        return super.delete(entity);
    }
}
