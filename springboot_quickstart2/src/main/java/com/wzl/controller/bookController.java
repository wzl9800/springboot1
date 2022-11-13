package com.wzl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhilong
 * @dcreate 2022-02-12 19:47
 */
@RestController
@RequestMapping("/one")
public class bookController {
    @RequestMapping
    public String book(){
        System.out.println("one hhh");
        return "hhh_yyyy";
    }
}
