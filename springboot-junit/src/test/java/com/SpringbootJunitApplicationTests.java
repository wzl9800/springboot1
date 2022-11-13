package com;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import com.wzl.SpringbootJunitApplication;
import com.wzl.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/*@SpringBootTest
@ContextConfiguration(classes = SpringbootJunitApplication.class)*/
@SpringBootTest(classes = SpringbootJunitApplication.class)

class SpringbootJunitApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        bookDao.save();
    }

}
