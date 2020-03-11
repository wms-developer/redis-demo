package com.wms.dao;

import com.wms.po.UnionpayTransInfoPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname UnipayTransInfoDAO
 * @Description TODO
 * @Date 2020/3/9 15:12
 * @Created by ZF-JS
 */
@Repository
public interface UnipayTransInfoDAO extends JpaRepository<UnionpayTransInfoPO,Integer> {

    @Query(value = "SELECT * FROM unionpay_trans_info WHERE id=?1",nativeQuery = true)
    UnionpayTransInfoPO getTransById(int id);

}
