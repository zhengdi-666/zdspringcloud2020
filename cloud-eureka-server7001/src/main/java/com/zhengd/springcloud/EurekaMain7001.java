package com.zhengd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zhengd
 * @Description:
 * @Date: create in 2020/4/22 19:52
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001
{
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
