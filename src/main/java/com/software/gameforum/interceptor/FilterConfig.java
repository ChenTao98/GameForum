package com.software.gameforum.interceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean someFilterRegistration1() {
        //新建过滤器注册类
        FilterRegistrationBean registration = new FilterRegistrationBean(new MyFilter());
        registration.addUrlPatterns("/**");
        return registration;
    }
}
