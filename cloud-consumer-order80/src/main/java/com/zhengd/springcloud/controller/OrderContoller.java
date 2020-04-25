package com.zhengd.springcloud.controller;

import com.zhengd.springcloud.entities.CommonResult;
import com.zhengd.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: zhengd
 * @Description:
 * @Date: create in 2020/4/22 12:45
 */
@RestController
@Slf4j
public class OrderContoller {
//    单机固定的配置
//    public static final String PAYMNT_URL = "http://localhost:8001";

    //  集群的配置
    public static final String PAYMNT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMNT_URL + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMNT_URL + "/payment/get/"+ id ,CommonResult.class);
    }
}
