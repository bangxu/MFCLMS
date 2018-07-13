package com.ahau.mfclms.dal;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  23:51 2018/7/13
 */
@Configuration
public class DataSourceConfiguration {

    @Bean
    public SessionFactory getSessionFactory(){
        return null;
    }

    @Bean
    public DataSource createDataSource(){
        return null;
    }

}
