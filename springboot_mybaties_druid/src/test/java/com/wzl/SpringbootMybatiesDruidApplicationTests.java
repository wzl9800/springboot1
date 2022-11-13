package com.wzl;

import com.wzl.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootMybatiesDruidApplicationTests {

    @Resource
    private StudentDao studentDao;
    @Test
    void contextLoads() {
        System.out.println(studentDao.getById(1002));
    }

}
