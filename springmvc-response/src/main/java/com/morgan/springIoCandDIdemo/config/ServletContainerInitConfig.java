package com.morgan.springIoCandDIdemo.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};    
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};    
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter =new CharacterEncodingFilter();
        filter.setEncoding("utf-8");
        return new Filter[]{filter};
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
