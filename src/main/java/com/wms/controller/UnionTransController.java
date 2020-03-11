package com.wms.controller;

import com.wms.po.UnionpayTransInfoPO;
import com.wms.service.IUnionTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname UnionTransController
 * @Description TODO
 * @Date 2020/3/9 15:15
 * @Created by ZF-JS
 */
@RestController
public class UnionTransController {

    @Autowired
    IUnionTransService iUnionTransService;

    @GetMapping(value = "/getTransById")
    UnionpayTransInfoPO getAllTrans(@RequestParam int id){
        return iUnionTransService.getTransById(id);
    }
}
