package com.cloudwalk.springcloud.dao;

import com.cloudwalk.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Author xsshuai
 * @Date 2021/4/9 11:28 上午
 **/
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
