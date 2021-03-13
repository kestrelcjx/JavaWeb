package com.kestrelcjx.system.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kestrelcjx.common.common.BaseQuery;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.common.BaseServiceImpl;
import com.kestrelcjx.system.entity.AdminRole;
import com.kestrelcjx.system.mapper.AdminRoleMapper;
import com.kestrelcjx.system.query.AdminRoleQuery;
import com.kestrelcjx.system.service.IAdminRoleService;
import com.kestrelcjx.system.utils.AdminUtils;
import com.kestrelcjx.system.vo.AdminRoleListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 人员角色关系服务实现类
 */
@Service
public class AdminRoleServiceImpl extends BaseServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {
    @Autowired
    private AdminRoleMapper adminRoleMapper;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        AdminRoleQuery adminRoleQuery = (AdminRoleQuery) query;
        // 查询条件
        QueryWrapper<AdminRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");
        // 查询数据
        IPage<AdminRole> page = new Page<>(adminRoleQuery.getPage(), adminRoleQuery.getLimit());
        IPage<AdminRole> data = adminRoleMapper.selectPage(page, queryWrapper);
        List<AdminRole> adminRoleList = data.getRecords();
        List<AdminRoleListVo> adminRoleListVoList = new ArrayList<>();
        if (!adminRoleList.isEmpty()) {
            adminRoleList.forEach(item -> {
                AdminRoleListVo adminRoleListVo = new AdminRoleListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, adminRoleListVo);
                // 添加人名称
                if (adminRoleListVo.getCreateUser() > 0) {
                    adminRoleListVo.setCreateUserName(AdminUtils.getName(adminRoleListVo.getCreateUser()));
                }
                // 更新人名称
                if (adminRoleListVo.getUpdateUser() > 0) {
                    adminRoleListVo.setUpdateUserName(AdminUtils.getName(adminRoleListVo.getUpdateUser()));
                }
                adminRoleListVoList.add(adminRoleListVo);
            });
        }
        return JsonResult.success("操作成功", adminRoleListVoList, data.getTotal());
    }

    /**
     * 获取记录详情
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public Object getInfo(Serializable id) {
        AdminRole entity = (AdminRole) super.getInfo(id);
        return entity;
    }

    /**
     * 添加或编辑记录
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    public JsonResult edit(AdminRole entity) {
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
        if (null == id || 0 == id) {
            return JsonResult.error("记录不能为空");
        }
        AdminRole entity = this.getById(id);
        if (null == entity) {
            return JsonResult.error("记录不存在");
        }
        return super.delete(entity);
    }
}
