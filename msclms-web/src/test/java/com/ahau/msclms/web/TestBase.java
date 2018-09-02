package com.ahau.msclms.web;

import com.ahau.mfclms.dal.entity.StudentBaseInfo;
import com.ahau.mfclms.server.service.StudentInfoService;
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

//    @Autowired
//    StudentInfoService studentInfoService;

    @Test
    public void test(){
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Assert.notNull(dataSource);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<?> resultList = jdbcTemplate.queryForList("select * from bookinfo");
        System.out.println("===>>>>>>>>>>>" + JSON.toJSONString(resultList));
    }

    @Test
    public void test1(){
        StudentInfoService studentInfoService = applicationContext.getBean(StudentInfoService.class);

        StudentBaseInfo studentInfo = new StudentBaseInfo();
        studentInfo.setStudentName("张三丰");
        studentInfo.setAge(20);
        studentInfoService.add(studentInfo);

        org.junit.Assert.assertNotNull(studentInfoService);

    }


}
