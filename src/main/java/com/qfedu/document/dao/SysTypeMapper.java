package com.qfedu.document.dao;

import com.qfedu.document.entity.SysType;

import java.util.List;

public interface SysTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysType record);

    int insertSelective(SysType record);

    SysType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysType record);

    int updateByPrimaryKey(SysType record);

    List<SysType> queryAll();
}