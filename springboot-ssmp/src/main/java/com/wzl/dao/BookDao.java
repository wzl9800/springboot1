package com.wzl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzl.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 11:35
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
