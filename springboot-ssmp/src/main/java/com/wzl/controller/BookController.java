package com.wzl.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wzl.domain.Book;
import com.wzl.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 21:33
 */
//@RestController
@RequestMapping("/books")
public class BookController {

    @Resource
    private BookService bookService;

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("{id}")
    public Boolean removeById(@PathVariable Integer id){
        return bookService.delete(id);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.update(book);
    }

    @GetMapping("{id}")
    public Book queryById(Integer id){
        return bookService.selectById(id);
    }

    //分页功能
    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> selectPage(Integer currentPage, Integer pageSize){
        return bookService.queryPage(currentPage,pageSize);
    }

    //按条件查询(为什么用get请求失败，post请求成功)
    @PostMapping("{condition}")
    public List<Book> selectCondition(@PathVariable String condition){
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper();
        lqw.like(condition != null,Book::getName,condition);
        return bookService.selectCondition(lqw);
    }

}
