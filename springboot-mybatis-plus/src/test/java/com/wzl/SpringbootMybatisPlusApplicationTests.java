package com.wzl;

import com.wzl.dao.SaleDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private SaleDao saleDao;
    @Test
    void contextLoads() {
        System.out.println(saleDao.selectById(2));
    }

}
