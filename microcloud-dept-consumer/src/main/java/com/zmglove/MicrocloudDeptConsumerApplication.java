package com.zmglove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MicrocloudDeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudDeptConsumerApplication.class, args);
    }

}