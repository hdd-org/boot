package com.boot.bootdemo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfiguration implements WebMvcConfigurer {

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        System.out.println("2222222222");
//        registry.addViewController("/").setViewName("index.html");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//    }
}
