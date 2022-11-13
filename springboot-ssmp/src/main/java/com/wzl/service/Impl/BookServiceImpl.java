package com.wzl.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzl.dao.BookDao;
import com.wzl.domain.Book;
import com.wzl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 18:23
 */
@Service
public class BookServiceImpl implements BookService {

    //@Autowired
    @Resource
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Book selectById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> selectAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> queryPage(int currentPage, int pageSize) {
        IPage<Book> page = new Page<>(currentPage,pageSize);
        return bookDao.selectPage(page,null);
    }

    @Override
    public List<Book> selectCondition(LambdaQueryWrapper<Book> lqw) {
        return bookDao.selectList(lqw);
    }
}
