package com.morgan.springIoCandDIdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.morgan")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
    
}
