package com.kestrelcjx.system.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kestrelcjx.common.common.BaseQuery;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.common.utils.StringUtils;
import com.kestrelcjx.system.common.BaseServiceImpl;
import com.kestrelcjx.system.constant.MessageConstant;
import com.kestrelcjx.system.entity.Message;
import com.kestrelcjx.system.mapper.MessageMapper;
import com.kestrelcjx.system.query.MessageQuery;
import com.kestrelcjx.system.service.IMessageService;
import com.kestrelcjx.system.utils.AdminUtils;
import com.kestrelcjx.system.vo.MessageListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 系统消息服务实现类
 */
@Service
public class MessageServiceImpl extends BaseServiceImpl<MessageMapper, Message> implements IMessageService {
    @Autowired
    private MessageMapper messageMapper;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        MessageQuery messageQuery = (MessageQuery) query;
        // 查询条件
        QueryWrapper<Message> queryWrapper = new QueryWrapper<>();
        // 消息标题
        if (!StringUtils.isEmpty(messageQuery.getTitle())) {
            queryWrapper.like("title", messageQuery.getTitle());
        }
        // 发送方式：1系统 2短信 3邮件 4微信 5推送
        if (messageQuery.getType() != null && messageQuery.getType() > 0) {
            queryWrapper.eq("type", messageQuery.getType());
        }
        // 发送状态：1已发送 2未发送
        if (messageQuery.getSendStatus() != null && messageQuery.getSendStatus() > 0) {
            queryWrapper.eq("send_status", messageQuery.getSendStatus());
        }
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");
        // 查询数据
        IPage<Message> page = new Page<>(messageQuery.getPage(), messageQuery.getLimit());
        IPage<Message> data = messageMapper.selectPage(page, queryWrapper);
        List<Message> messageList = data.getRecords();
        List<MessageListVo> messageListVoList = new ArrayList<>();
        if (!messageList.isEmpty()) {
            messageList.forEach(item -> {
                MessageListVo messageListVo = new MessageListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, messageListVo);
                // 发送方式描述
                if (messageListVo.getType() != null && messageListVo.getType() > 0) {
                    messageListVo.setTypeName(MessageConstant.MESSAGE_TYPE_LIST.get(messageListVo.getType()));
                }
                // 发送状态描述
                if (messageListVo.getSendStatus() != null && messageListVo.getSendStatus() > 0) {
                    messageListVo.setSendStatusName(MessageConstant.MESSAGE_SENDSTATUS_LIST.get(messageListVo.getSendStatus()));
                }
                // 添加人名称
                if (messageListVo.getCreateUser() > 0) {
                    messageListVo.setCreateUserName(AdminUtils.getName((messageListVo.getCreateUser())));
                }
                // 更新人名称
                if (messageListVo.getUpdateUser() > 0) {
                    messageListVo.setUpdateUserName(AdminUtils.getName((messageListVo.getUpdateUser())));
                }
                messageListVoList.add(messageListVo);
            });
        }
        return JsonResult.success("操作成功", messageListVoList, data.getTotal());
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
        Message entity = this.getById(id);
        if (entity == null) {
            return JsonResult.error("记录不存在");
        }
        return super.delete(entity);
    }
}
