package com.ahau.mfclms.dal.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  11:24 2018/7/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBase {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test(){

    }


}
