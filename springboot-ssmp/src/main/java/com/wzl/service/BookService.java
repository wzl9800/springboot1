package com.wzl.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wzl.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 18:18
 */
public interface BookService {
    boolean save(Book book);
    boolean delete(Integer id);
    boolean update(Book book);
    Book selectById(Integer id);
    List<Book> selectAll();
    IPage<Book> queryPage(int currentPage,int pageSize);

    List<Book> selectCondition(LambdaQueryWrapper<Book> lqw);
}
