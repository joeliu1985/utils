package com.kkl.dao;

import com.kkl.entity.CityPO;

public interface CityPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CityPO record);

    int insertSelective(CityPO record);

    CityPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CityPO record);

    int updateByPrimaryKey(CityPO record);
}