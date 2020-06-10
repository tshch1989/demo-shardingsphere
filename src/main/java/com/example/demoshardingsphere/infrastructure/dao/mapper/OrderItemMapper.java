package com.example.demoshardingsphere.infrastructure.dao.mapper;

import com.example.demoshardingsphere.infrastructure.dao.entity.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Long orderItemId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long orderItemId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}