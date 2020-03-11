package com.wms.service;

import com.wms.po.UnionpayTransInfoPO;

import java.util.List;

/**
 * @Classname IUnionTransService
 * @Description TODO
 * @Date 2020/3/9 15:18
 * @Created by ZF-JS
 */
public interface IUnionTransService  {

    UnionpayTransInfoPO getTransById(int id);
}
