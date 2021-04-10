package com.cloudwalk.springcloud.controller;

import com.cloudwalk.springcloud.entities.CommonResult;
import com.cloudwalk.springcloud.entities.Payment;
import com.cloudwalk.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Author xsshuai
 * @Date 2021/4/9 12:03 下午
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);

        if(result > 0){
            return new CommonResult(200,"插入数据成功" + serverPort,result);
        }else{
            return new CommonResult(444,"插入数据失败" + serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment + "哈哈111");
        if(payment != null){
            return new CommonResult(200,"查询成功" + serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID："+id + serverPort,null);
        }
    }
}
