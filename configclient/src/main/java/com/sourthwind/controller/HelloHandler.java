package com.sourthwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 11:13
 */
@RequestMapping("/config")
@RestController
@RefreshScope
public class HelloHandler {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/index")
    public String index(){
        return "当前端口："+this.port;
    }
}