package com.ljj.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljj
 * @Date: 2019/8/21 10:43
 * @Description:
 */
@RestController
public class HelloController {
    @Value("${name}")
    private String name;

    @GetMapping("/hello")
    public String hello(){
        return "hello " + name;
    }
}
