package com.morgan.springIoCandDIdemo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@Import(JdbcConfig.class)
@ComponentScan("com.morgan..springIoCandDIdemo.dao")
public class SpringConfig {

   
}
