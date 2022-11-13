package com.wzl.dao.impl;

import com.wzl.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author wangzhilong
 * @dcreate 2022-02-13 15:30
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("springboot 整合 junit");
    }
}
