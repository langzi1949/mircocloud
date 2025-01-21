package com.zmglove.controller;

import com.zmglove.configs.MyFeignClient;
import com.zmglove.entity.Dept;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Resource
    private MyFeignClient myFeignClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable("id") long id) {
        return myFeignClient.getById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Cloud Consumer";
    }

    @GetMapping("/hello-p")
    public String hello2() {
        return myFeignClient.hello();
    }


    @GetMapping("/hello-r")
    public String hello3() {
        return restTemplate.getForObject("http://microcloud-dept-provider/dept/hello", String.class);
    }

}
