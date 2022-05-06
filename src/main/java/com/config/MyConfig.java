package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

// 扩展springmvc
@Configuration
public class MyConfig implements WebMvcConfigurer {

    // ViewResolver实现了视图解析器接口的类，我们就可以把它看做视图解析器
    @Bean   //将这个豆子交给SpringBoot,让它帮我们实现自动装配
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    //自定义一个自己的视图解析器
    public static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }

    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ha").setViewName("hello");
    }
}
