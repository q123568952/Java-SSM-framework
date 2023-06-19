package com.morgan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.morgan.controller","com.morgan.config"})
@EnableWebMvc
public class SpringMvcConfig {
    
}
