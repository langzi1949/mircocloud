package com.zmglove.configs;

import com.zmglove.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microcloud-dept-provider")
public interface MyFeignClient {


    @GetMapping("/dept/get/{id}")
    Dept getById(@PathVariable(value = "id") long id);

    @GetMapping("/dept/hello")
    String hello();
}
