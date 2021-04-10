package com.cloudwalk.springcloud.service;

import com.cloudwalk.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Author xsshuai
 * @Date 2021/4/9 11:54 上午
 **/
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
