package com.morgan.springIoCandDIdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.morgan.springIoCandDIdemo.service","com.morgan.springIoCandDIdemo.dao"})
public class SpringConfig {
    

}
