package com.qfedu.document.controller;

import com.qfedu.document.common.JsonBean;
import com.qfedu.document.entity.SysDocument;
import com.qfedu.document.service.DocumentService;
import com.qfedu.document.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/8 11:47
 * @Version 1.0
 */
@RestController
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @GetMapping("list.do")
    public JsonBean queryAll(int star,int limit){
        JsonBean bean = null;
        List<SysDocument> list = null;
        try {
            list = documentService.findAll(star,limit);
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @GetMapping("bytype.do")
    public JsonBean queryAll(int id){
        JsonBean bean = null;
        List<SysDocument> list = null;
        try {
            list = documentService.findByType(id);
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @PostMapping("add.do")
    public JsonBean add(SysDocument document){
        JsonBean bean = null;
        try {
            documentService.insert(document);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @GetMapping("document.do")
    public JsonBean queryById(int id){
        JsonBean bean = null;
        SysDocument document = null;
        try {
           document = documentService.selectById(id);
            bean = JsonUtils.createJsonBean(1,document);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @PostMapping("update.do")
    public JsonBean update(SysDocument document){
        JsonBean bean = null;
        try {
            documentService.update(document);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @GetMapping("delete.do")
    public JsonBean deleteById(int id){
        JsonBean bean = null;
        try {
            documentService.delete(id);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
}
