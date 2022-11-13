package com.wzl;

import com.wzl.dao.SchoolDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Resource
    //@Autowired
    private SchoolDao schoolDao;
    @Test
    void contextLoads() {
        System.out.println(schoolDao.getById(1));
    }

}
