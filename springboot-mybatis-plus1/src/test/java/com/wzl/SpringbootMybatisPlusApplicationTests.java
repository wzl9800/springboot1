package com.wzl;

import com.wzl.dao.UserDao;
import com.wzl.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        System.out.println(userDao.selectById(2));
        System.out.println(userDao.selectList(null));
        User user = new User(3,"盾山","456","韩国");
        userDao.insert(user);
    }

}
