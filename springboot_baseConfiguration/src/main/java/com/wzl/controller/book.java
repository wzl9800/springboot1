package com.wzl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

/**
 * @author wangzhilong
 * @dcreate 2022-02-12 19:50
 */
@RestController
@RequestMapping("/two")
public class book {

    @Value("${county}")
    private String count;

    @Value("${user.name1}")
    private String name;

    @Value("${tempDir}")
    private String tempDir;

    @Value("${tempDir2}")
    private String tempDir2;
    @GetMapping
    public String hhh(){
        System.out.println(count);
        System.out.println(name);
        System.out.println(tempDir);
        System.out.println(tempDir2);
        return "nnn_hhh_";
    }
}
