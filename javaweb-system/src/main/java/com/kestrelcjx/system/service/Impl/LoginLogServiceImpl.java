package com.kestrelcjx.system.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kestrelcjx.common.common.BaseQuery;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.common.utils.StringUtils;
import com.kestrelcjx.system.common.BaseServiceImpl;
import com.kestrelcjx.system.constant.LoginLogConstant;
import com.kestrelcjx.system.entity.LoginLog;
import com.kestrelcjx.system.mapper.LoginLogMapper;
import com.kestrelcjx.system.query.LoginLogQuery;
import com.kestrelcjx.system.service.ILoginLogService;
import com.kestrelcjx.system.utils.AdminUtils;
import com.kestrelcjx.system.vo.LoginLogListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 登录日志 服务实现类
 */
@Service
public class LoginLogServiceImpl extends BaseServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {
    @Autowired
    private LoginLogMapper loginLogMapper;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        LoginLogQuery loginLogQuery = (LoginLogQuery) query;
        // 查询条件
        QueryWrapper<LoginLog> queryWrapper = new QueryWrapper<>();
        // 日志标题
        if (!StringUtils.isEmpty(loginLogQuery.getTitle())) {
            queryWrapper.like("title", loginLogQuery.getTitle());
        }
        // 登录状态：1成功 2失败
        if (loginLogQuery.getStatus() != null && loginLogQuery.getStatus() > 0) {
            queryWrapper.eq("status", loginLogQuery.getStatus());
        }
        // 类型：1登录系统 2退出系统
        if (loginLogQuery.getType() != null && loginLogQuery.getType() > 0) {
            queryWrapper.eq("type", loginLogQuery.getType());
        }
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");
        // 查询数据
        IPage<LoginLog> page = new Page<>(loginLogQuery.getPage(), loginLogQuery.getLimit());
        IPage<LoginLog> data = loginLogMapper.selectPage(page, queryWrapper);
        List<LoginLog> loginLogList = data.getRecords();
        List<LoginLogListVo> loginLogListVoList = new ArrayList<>();
        if (!loginLogList.isEmpty()) {
            loginLogList.forEach(item -> {
                LoginLogListVo loginLogListVo = new LoginLogListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, loginLogListVo);
                // 登录状态描述
                if (loginLogListVo.getStatus() != null && loginLogListVo.getStatus() > 0) {
                    loginLogListVo.setStatusName(LoginLogConstant.LOGINLOG_STATUS_LIST.get(loginLogListVo.getStatus()));
                }
                // 类型描述
                if (loginLogListVo.getType() != null && loginLogListVo.getType() > 0) {
                    loginLogListVo.setTypeName(LoginLogConstant.LOGINLOG_TYPE_LIST.get(loginLogListVo.getType()));
                }
                // 添加人名称
                if (loginLogListVo.getCreateUser() > 0) {
                    loginLogListVo.setCreateUserName(AdminUtils.getName((loginLogListVo.getCreateUser())));
                }
                // 更新人名称
                if (loginLogListVo.getUpdateUser() > 0) {
                    loginLogListVo.setUpdateUserName(AdminUtils.getName((loginLogListVo.getUpdateUser())));
                }
                loginLogListVoList.add(loginLogListVo);
            });
        }
        return JsonResult.success("操作成功", loginLogListVoList, data.getTotal());
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
        LoginLog entity = this.getById(id);
        if (entity == null) {
            return JsonResult.error("记录不存在");
        }
        return super.delete(entity);
    }

    /**
     * 设置状态
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    public JsonResult setStatus(LoginLog entity) {
        if (entity.getId() == null || entity.getId() <= 0) {
            return JsonResult.error("记录ID不能为空");
        }
        if (entity.getStatus() == null) {
            return JsonResult.error("记录状态不能为空");
        }
        return super.setStatus(entity);
    }

    /**
     * 创建系统登录日志
     *
     * @param loginLog 访问日志对象
     */
    @Override
    public void insertLoginLog(LoginLog loginLog) {
        loginLogMapper.insertLoginLog(loginLog);
    }
}
