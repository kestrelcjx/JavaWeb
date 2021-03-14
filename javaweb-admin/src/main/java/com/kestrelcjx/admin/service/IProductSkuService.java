package com.kestrelcjx.admin.service;

import com.kestrelcjx.admin.entity.ProductSku;
import com.kestrelcjx.common.common.IBaseService;

import java.util.List;

/**
 * 商品SKU 服务类
 */
public interface IProductSkuService extends IBaseService<ProductSku> {
    /**
     * 根据商品ID获取SKU列表
     *
     * @param productId 商品ID
     * @return
     */
    List<ProductSku> getProductSkuList(Integer productId);

    /**
     * 根据商品ID删除SKU列表
     *
     * @param productId 商品ID
     */
    void deleteProductSkuByProductId(Integer productId);
}