package com.wzl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

/**
 * @author wangzhilong
 * @dcreate 2022-02-12 19:19
 */

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/one")
    public String getById(){
            System.out.println("springboot is running....");
            return "springboot is running ....";
    }
}
