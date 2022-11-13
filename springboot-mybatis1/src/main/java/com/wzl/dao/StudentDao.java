package com.wzl.dao;

import com.wzl.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangzhilong
 * @dcreate 2022-02-13 18:38
 */
@Mapper
public interface StudentDao {
    public Student getById(Integer id);
}
