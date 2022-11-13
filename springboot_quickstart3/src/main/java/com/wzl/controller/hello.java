package com.wzl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhilong
 * @dcreate 2022-02-12 20:11
 */
@RestController
@RequestMapping("/three")
public class hello {
    @RequestMapping
    public String HHH(){
        System.out.println("你好呀！！！");
        return "哈哈哈";
    }
}
