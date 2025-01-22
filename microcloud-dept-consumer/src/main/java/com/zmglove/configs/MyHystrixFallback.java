package com.zmglove.configs;

import com.zmglove.entity.Dept;
import org.springframework.stereotype.Component;

@Component
public class MyHystrixFallback implements MyFeignClient{
    @Override
    public Dept getById(long id) {
        return null;
    }

    @Override
    public String hello() {
        return "当前是客户端进行Hystrix服务降级处理";
    }
}
