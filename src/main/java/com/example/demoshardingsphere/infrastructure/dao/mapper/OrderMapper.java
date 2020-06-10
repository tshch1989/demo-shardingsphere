package com.example.demoshardingsphere.infrastructure.dao.mapper;

import com.example.demoshardingsphere.infrastructure.dao.entity.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}