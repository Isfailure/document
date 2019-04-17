package com.qfedu.document.controller;

import com.qfedu.document.common.JsonBean;
import com.qfedu.document.entity.SysType;
import com.qfedu.document.service.TypeService;
import com.qfedu.document.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/8 14:18
 * @Version 1.0
 */
@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;

    @GetMapping("alltype.do")
    public JsonBean queryAll(){
        JsonBean bean = null;
        List<SysType> list = null;
        try {
            list = typeService.findAll();
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
}
