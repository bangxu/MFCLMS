package com.ahau.msclms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author By Barry
 * @Description: Application launcher,a simple management system for library
 * @date create in  21:23 2018/7/13
 */
@EnableJpaRepositories("com.ahau.mfclms.dal")
@EntityScan(basePackages={"com.ahau.mfclms.dal.entity"})
@SpringBootApplication(scanBasePackages={"com.ahau.mfclms.server",})
public class MyApplication  {

    {
        System.out.println("应用加载中.....");
    }


    public static void main(String [] args){
        SpringApplication.run(MyApplication.class,args);
    }

}
