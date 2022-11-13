package com.wzl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wzl.domain.Book;

import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 19:32
 */
public interface IBookService extends IService<Book> {

    //分页
    public IPage<Book> queryPage(Integer currentPage,Integer pageSize);
    //条件查询
    List<Book> queryCondition(String condition);
}
