package com.wzl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzl.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangzhilong
 * @dcreate 2022-02-13 19:29
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
