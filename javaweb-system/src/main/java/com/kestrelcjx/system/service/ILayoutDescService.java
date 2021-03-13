package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.LayoutDesc;

/**
 * 布局描述服务类
 */
public interface ILayoutDescService extends IBaseService<LayoutDesc> {
    /**
     * 根据ID获取位置描述
     *
     * @param itemId 页面位置ID
     * @param locId  位置ID
     * @return
     */
    LayoutDesc getLocDescById(Integer itemId, Integer locId);
}
