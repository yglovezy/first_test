package com.les.ch03mybatis.dao;

import com.les.ch03mybatis.bo.TZtkMappingBo;

import java.util.List;

public interface TZtkMappingMapper {
    int deleteByPrimaryKey(String mappingid);

    int insert(TZtkMappingBo record);

    int insertSelective(TZtkMappingBo record);

    TZtkMappingBo selectByPrimaryKey(String mappingid);

    int updateByPrimaryKeySelective(TZtkMappingBo record);

    int updateByPrimaryKeyWithBLOBs(TZtkMappingBo record);

    int updateByPrimaryKey(TZtkMappingBo record);

    List<TZtkMappingBo> selectAll();

}