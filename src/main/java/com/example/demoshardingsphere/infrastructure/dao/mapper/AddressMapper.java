package com.example.demoshardingsphere.infrastructure.dao.mapper;

import com.example.demoshardingsphere.infrastructure.dao.entity.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Long addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Long addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}