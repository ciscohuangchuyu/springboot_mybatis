package com.example.mybatisdemo.facade.api.test;

import org.springframework.web.bind.annotation.*;

/**
 * 测试用的Controller
 * Created by Cisco on 2018/10/31
 */
@RestController
public class TestController {
    @PostMapping(value = "/hello", produces = "application/json; charset=utf-8")
    public
    String hello(){
        return "hello";
    }

}
