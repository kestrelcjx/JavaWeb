package com.kestrelcjx.system.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kestrelcjx.common.common.BaseQuery;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.common.BaseServiceImpl;
import com.kestrelcjx.system.entity.RoleDept;
import com.kestrelcjx.system.mapper.RoleDeptMapper;
import com.kestrelcjx.system.query.RoleDeptQuery;
import com.kestrelcjx.system.service.IRoleDeptService;
import com.kestrelcjx.system.utils.AdminUtils;
import com.kestrelcjx.system.vo.RoleDeptListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 部门角色服务实现类
 */
@Service
public class RoleDeptServiceImpl extends BaseServiceImpl<RoleDeptMapper, RoleDept> implements IRoleDeptService {
    @Autowired
    private RoleDeptMapper roleDeptMapper;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        RoleDeptQuery roleDeptQuery = (RoleDeptQuery) query;
        // 查询条件
        QueryWrapper<RoleDept> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");
        // 查询数据
        IPage<RoleDept> page = new Page<>(roleDeptQuery.getPage(), roleDeptQuery.getLimit());
        IPage<RoleDept> data = roleDeptMapper.selectPage(page, queryWrapper);
        List<RoleDept> roleDeptList = data.getRecords();
        List<RoleDeptListVo> roleDeptListVoList = new ArrayList<>();
        if (!roleDeptList.isEmpty()) {
            roleDeptList.forEach(item -> {
                RoleDeptListVo roleDeptListVo = new RoleDeptListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, roleDeptListVo);
                // 添加人名称
                if (roleDeptListVo.getCreateUser() > 0) {
                    roleDeptListVo.setCreateUserName(AdminUtils.getName((roleDeptListVo.getCreateUser())));
                }
                // 更新人名称
                if (roleDeptListVo.getUpdateUser() > 0) {
                    roleDeptListVo.setUpdateUserName(AdminUtils.getName((roleDeptListVo.getUpdateUser())));
                }
                roleDeptListVoList.add(roleDeptListVo);
            });
        }
        return JsonResult.success("操作成功", roleDeptListVoList, data.getTotal());
    }

    /**
     * 获取记录详情
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public Object getInfo(Serializable id) {
        RoleDept entity = (RoleDept) super.getInfo(id);
        return entity;
    }

    /**
     * 添加或编辑记录
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    public JsonResult edit(RoleDept entity) {
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
        RoleDept entity = this.getById(id);
        if (entity == null) {
            return JsonResult.error("记录不存在");
        }
        return super.delete(entity);
    }
}
