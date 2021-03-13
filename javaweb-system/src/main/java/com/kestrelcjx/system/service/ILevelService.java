package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.dto.LevelDto;
import com.kestrelcjx.system.entity.Level;

/**
 * 职级服务类
 */
public interface ILevelService extends IBaseService<Level> {
    /**
     * 批量设置状态
     *
     * @param levelDto 状态Dto
     * @return
     */
    JsonResult batchStatus(LevelDto levelDto);
}
