package com.wms.service.impl;

import com.wms.dao.UnipayTransInfoDAO;
import com.wms.po.UnionpayTransInfoPO;
import com.wms.service.IUnionTransService;
import com.wms.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UnionTransServiceImpl
 * @Description TODO
 * @Date 2020/3/9 15:18
 * @Created by ZF-JS
 */
@Service
public class UnionTransServiceImpl implements IUnionTransService{

    @Autowired
    UnipayTransInfoDAO unipayTransInfoDAO;

    @Autowired
    RedisUtil redisUtil;

    @Override
    public UnionpayTransInfoPO getTransById(int id) {
        String key  = "unionTrans_"+id;
        Object o = redisUtil.get(key);
        UnionpayTransInfoPO po = null;
        if(o == null){
            System.out.println("查询数据库");
            long startTime=System.currentTimeMillis();   //获取开始时间
            po = unipayTransInfoDAO.getTransById(id);
            long endTime=System.currentTimeMillis(); //获取结束时间
            System.out.println("查询数据库程序运行时间: "+(endTime-startTime)+"ms");
            boolean set = redisUtil.set(key, po, -1);
            System.out.println("缓存结果: "+set);
            return po;
        }else{
            System.out.println("查询缓存");
            long startTime=System.currentTimeMillis();   //获取开始时间
            UnionpayTransInfoPO o1 = (UnionpayTransInfoPO)redisUtil.get(key);
            long endTime=System.currentTimeMillis(); //获取结束时间
            System.out.println("查询缓存程序运行时间: "+(endTime-startTime)+"ms");
            return  o1;
        }
    }
}
