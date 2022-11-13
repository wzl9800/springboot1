package com.wzl.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzl.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.events.Event;

import javax.annotation.Resource;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 18:29
 */
@SpringBootTest
public class BookTestCodeService {

    //@Autowired
    @Resource
    private IBookService bookService;
    @Test
    public void save(){
        Book book = new Book();
        book.setType("计算机理论");
        book.setName("轻量级Java Web企业级应用实战");
        book.setDescription("源码级剖析Spring框架，适合已经掌握Java基础的读者");
        System.out.println(bookService.save(book ));
    }

    @Test
    public void testupdate(){
        Book book = new Book();
        book.setId(6);
        book.setType("计算机理论");
        book.setName("==轻量级Java Web企业级应用实战==");
        book.setDescription("源码级剖析Spring框架，适合已经掌握Java基础的读者");
        System.out.println(bookService.updateById(book));
    }

    @Test
    public void testselect(){
        System.out.println(bookService.getById(1));
    }


    @Test
    public void testselectAll(){
        System.out.println(bookService.list());
    }

    @Test
    public void testGetPage(){
        IPage<Book> page = new Page<>(2,2);
        bookService.page(page);
    }

    /*@Test
    public void testCondition(){
        QueryWrapper qw = new QueryWrapper();
        qw.like("name","5");
        bookDao.selectList(qw);
    }*/

}
