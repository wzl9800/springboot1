package com.wzl.dao;

import com.wzl.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author wangzhilong
 * @dcreate 2022-02-13 21:15
 */
//@Mapper
public interface StudentDao {
    @Select("select * from student where id=#{id}")
    Student getById(Integer id);
}
