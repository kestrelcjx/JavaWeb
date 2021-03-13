package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.ItemCate;

import java.util.List;
import java.util.Map;

/**
 * 栏目服务类
 */
public interface IItemCateService extends IBaseService<ItemCate> {
    /**
     * 根据栏目ID获取栏目名称
     *
     * @param cateId    栏目ID
     * @param delimiter 拼接字符
     * @return
     */
    String getCateNameByCateId(Integer cateId, String delimiter);

    /**
     * 根据站点ID获取栏目
     *
     * @param itemId 站点ID
     * @param pid    栏目ID
     * @return
     */
    List<Map<String, Object>> getItemCateListByItemId(Integer itemId, Integer pid);
}
