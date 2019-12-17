package com.software.gameforum.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userLoginInterceptor())
                .addPathPatterns("/api/user/**")
                .addPathPatterns("/api/game/praisePost","/api/game/cancelPraisePost",
                        "/api/game/followPost","/api/game/cancelFollowPost",
                        "/api/game/commentPost","/api/game/replyMessage");
    }

    @Bean
    public UserLoginInterceptor userLoginInterceptor() {
        return new UserLoginInterceptor();
    }
}
