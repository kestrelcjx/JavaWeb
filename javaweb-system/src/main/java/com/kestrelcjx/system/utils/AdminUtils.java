package com.kestrelcjx.system.utils;

import com.kestrelcjx.common.utils.SpringUtils;
import com.kestrelcjx.system.entity.Admin;
import com.kestrelcjx.system.mapper.AdminMapper;

public class AdminUtils {
    /**
     * 根据ID获取人员名称
     *
     * @param id 人员ID
     * @return
     */
    public static String getName(Integer id) {
        AdminMapper adminMapper = SpringUtils.getBean(AdminMapper.class);
        Admin admin = adminMapper.selectById(id);
        return admin.getRealname();
    }
}
