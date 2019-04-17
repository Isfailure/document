package com.qfedu.document.dao;

import com.qfedu.document.entity.SysDocument;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.validation.constraints.Max;
import java.util.List;

public interface SysDocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDocument record);

    int insertSelective(SysDocument record);

    SysDocument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDocument record);

    int updateByPrimaryKey(SysDocument record);
    @Select("select * from sys_document limit #{star}, #{size}")
    List<SysDocument> findAll(@Param("star") int star, @Param("size") int size);

    List<SysDocument> findByType(int tid);
    @Select("select * from sys_document")
    List<SysDocument> qurryAll();

    int add(SysDocument document);
}