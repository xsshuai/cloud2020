package com.cloudwalk.springcloud.service.impl;

import com.cloudwalk.springcloud.dao.PaymentDao;
import com.cloudwalk.springcloud.entities.Payment;
import com.cloudwalk.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Author xsshuai
 * @Date 2021/4/9 11:57 上午
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
