package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.entity.City;

/**
 * 城市服务类
 */
public interface ICityService extends IBaseService<City> {
    /**
     * 根据父级ID获取下级城市
     *
     * @param id 父级ID
     * @return
     */
    JsonResult getCityListByPid(Integer id);

    /**
     * 根据城市ID获取城市名称
     *
     * @param cityId    城市ID
     * @param delimiter 拼接字符
     * @return
     */
    String getCityNameByCityId(Integer cityId, String delimiter);
}
