package com.qfedu.document.service.impl;

import com.qfedu.document.dao.SysDocumentMapper;
import com.qfedu.document.entity.SysDocument;
import com.qfedu.document.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/8 11:44
 * @Version 1.0
 */
@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private SysDocumentMapper documentMapper;

    @Override
    public List<SysDocument> findAll(int star, int size) {
        List<SysDocument> list = null;
        try {
            list = documentMapper.findAll(star, size);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public List<SysDocument> findByType(int tid) {
        List<SysDocument> list = null;
        if (tid == 0){
            list = documentMapper.qurryAll();
        }else{
            list = documentMapper.findByType(tid);
        }
        return list;
    }

    @Override
    public void insert(SysDocument document) {
        documentMapper.add(document);
    }

    @Override
    public SysDocument selectById(int id) {
        return documentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(SysDocument document) {
        documentMapper.updateByPrimaryKeySelective(document);
    }

    @Override
    public void delete(int id) {
        documentMapper.deleteByPrimaryKey(id);
    }
}
