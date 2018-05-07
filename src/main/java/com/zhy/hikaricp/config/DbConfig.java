package com.zhy.hikaricp.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @author: zhangocean
 * @Date: 2018/5/7 12:24
 * Describe:
 */
@Configuration
public class DbConfig {

    @Bean(name = "dataSource")
    public DataSource dataSource(@Autowired Environment environment){

        HikariDataSource dataSource = new HikariDataSource();

        dataSource.setDriverClassName(environment.getProperty("zhy.db.driverClassName"));
        dataSource.setJdbcUrl(environment.getProperty("zhy.db.url"));
        dataSource.setUsername(environment.getProperty("zhy.db.username"));
        dataSource.setPassword(environment.getProperty("zhy.db.password"));

        return dataSource;
    }

}
