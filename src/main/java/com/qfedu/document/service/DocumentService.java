package com.qfedu.document.service;

import com.qfedu.document.entity.SysDocument;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/8 11:43
 * @Version 1.0
 */
public interface DocumentService {
    public List<SysDocument> findAll(int star, int size);

    public List<SysDocument> findByType(int tid);

    public void insert(SysDocument document);

    public SysDocument selectById(int id);

    public void update(SysDocument document);

    public void delete(int id);

}
