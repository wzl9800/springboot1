package com.wzl.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzl.dao.BookDao;
import com.wzl.domain.Book;
import com.wzl.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 19:32
 */
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao,Book> implements IBookService {

    @Resource
    private BookDao bookDao;


    @Override
    public IPage<Book> queryPage(Integer currentPage, Integer pageSize) {
        IPage<Book> page = new Page<>(currentPage,pageSize);
        return bookDao.selectPage(page,null);
    }

    @Override
    public List<Book> queryCondition(String condition) {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(condition != null,Book::getName,condition);
        return bookDao.selectList(lqw);
    }
}
