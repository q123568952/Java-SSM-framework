package com.morgan.springIoCandDIdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.morgan")
@PropertySource("jdbc.properties")
public class SpringConfig {
    
}
