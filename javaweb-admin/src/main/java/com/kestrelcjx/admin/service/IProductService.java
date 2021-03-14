package com.kestrelcjx.admin.service;

import com.kestrelcjx.admin.dto.DeleteSkuDto;
import com.kestrelcjx.admin.dto.GenerateSkuDto;
import com.kestrelcjx.admin.dto.UpdateSkuDto;
import com.kestrelcjx.admin.entity.Product;
import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.common.utils.JsonResult;

/**
 * 商品 服务类
 */
public interface IProductService extends IBaseService<Product> {
    /**
     * 生成SKU
     *
     * @param productSkuDto 参数
     * @return
     */
    JsonResult generateSku(GenerateSkuDto productSkuDto);

    /**
     * 更新SKU
     *
     * @param updateSkuDto 参数
     * @return
     */
    JsonResult updateSku(UpdateSkuDto updateSkuDto);

    /**
     * 删除SKU
     *
     * @param deleteSkuDto 参数
     * @return
     */
    JsonResult deleteSku(DeleteSkuDto deleteSkuDto);
}