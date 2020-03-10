package com.atguigu.dome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzw
 * @date 2020/3/11 - 6:16
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "Holle Wrold";
    }
}
