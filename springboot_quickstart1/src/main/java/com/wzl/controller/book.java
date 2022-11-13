package com.wzl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhilong
 * @dcreate 2022-02-12 19:50
 */
@RestController
@RequestMapping("/two")
public class book {
    @GetMapping
    public String hhh(){
        return "nnn_hhh_";
    }
}
