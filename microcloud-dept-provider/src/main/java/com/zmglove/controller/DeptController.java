package com.zmglove.controller;

import com.zmglove.entity.Dept;
import com.zmglove.service.DeptService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Resource
    private DeptService deptService;

    @Value("${app.provider}")
    private String providerName;


    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable("id") long id) {
        return deptService.getById(id);
    }

    @GetMapping("/hello")
    @CircuitBreaker(name = "processResilience", fallbackMethod = "processResilience")
    public String hello() {
        if ("Node1".equals(providerName)) {
            throw new RuntimeException();
        }
        return "Hello Spring Cloud " + providerName;
    }

    public String processResilience(Throwable throwable) {
        return "Sorry, Current Service is down, please wait few minutes....";
    }
}
