package com.morgan.springIoCandDIdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.morgan")
@EnableWebMvc
public class SpringMvcConfig {
    

}
