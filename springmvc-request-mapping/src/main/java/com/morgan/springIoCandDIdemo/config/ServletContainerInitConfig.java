package com.morgan.springIoCandDIdemo.config;

import org.springframework.lang.Nullable;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};    
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};    
    }

    // @Override
    // protected WebApplicationContext createServletApplicationContext() {
    //     AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
    //     ctx.register(SpringMvcConfig.class);
    //     return ctx;
    // }

    // @Override
    // protected String[] getServletMappings() {
    //     return new String[]{"/"};

    // }

    // @Override
    // @Nullable
    // protected WebApplicationContext createRootApplicationContext() {
    //     AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
    //     ctx.register(SpringConfig.class);
    //     return ctx;
    // }
    
}
