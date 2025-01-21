package com.zmglove;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.zmglove.*")
@ComponentScan(basePackages = {"com.zmglove.*"})
@EnableDiscoveryClient
@EnableHystrix
public class MicrocloudDeptProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicrocloudDeptProviderApplication.class, args);
    }
}