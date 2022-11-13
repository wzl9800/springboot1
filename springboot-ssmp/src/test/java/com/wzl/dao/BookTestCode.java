package com.wzl.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzl.dao.BookDao;
import com.wzl.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
/**
 * @author wangzhilong
 * @dcreate 2022-02-14 11:40
 */
@SpringBootTest
public class BookTestCode {

    //@Autowired
    @Resource
    private BookDao bookDao;

    @Test
    public void testselect(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    public void testinsert(){
        Book book = new Book();
        book.setType("计算机理论");
        book.setName("SpringMVC + Mybatis开发从入门到项目实战");
        book.setDescription("全方位解析面向WEB应用的轻量级框架");
        bookDao.insert(book);
    }

    @Test
    public void testselectAll(){
        bookDao.selectList(null);
    }

    @Test
    public void testGetPage(){
        IPage page = new Page(2,2);
        bookDao.selectPage(page,null );
        System.out.println(page.getCurrent());//当前页
        System.out.println(page.getSize());//每页最多2条数据
        System.out.println(page.getPages());//总共多少页
        System.out.println(page.getTotal());//总条数
        System.out.println(page.getRecords());//
    }

    @Test
    public void testCondition(){
        QueryWrapper qw = new QueryWrapper();
        qw.like("name","5");
        bookDao.selectList(qw);
    }
    @Test
    public void testCondition1(){
        String nameCondition = null;
        LambdaQueryWrapper<Book>  lamqw = new LambdaQueryWrapper();
        lamqw.like(nameCondition != null,Book::getName,nameCondition);
        bookDao.selectList(lamqw);
    }
}
