package com.wzl.dao;

import com.wzl.domin.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * @author wangzhilong
 * @dcreate 2022-02-13 16:53
 */
@Mapper
public interface SchoolDao {
    @Select("select * from school where id = #{id}")
    public School getById(Integer id);
}
