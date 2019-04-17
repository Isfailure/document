package com.qfedu.document.service.impl;

import com.qfedu.document.dao.SysTypeMapper;
import com.qfedu.document.entity.SysType;
import com.qfedu.document.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/8 14:17
 * @Version 1.0
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private SysTypeMapper typeMapper;
    @Override
    public List<SysType> findAll() {
        return typeMapper.queryAll();
    }
}
