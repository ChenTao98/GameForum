package com.software.gameforum.interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 1允许任何域名使用
        corsConfiguration.addAllowedOrigin("*");
        // 2允许任何头
        corsConfiguration.addAllowedHeader("*");
        // 3允许任何方法（post、get等）
        corsConfiguration.addAllowedMethod("*");
        //是否发送Cookie信息
        corsConfiguration.setAllowCredentials(true);
        //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
        corsConfiguration.addExposedHeader(HttpHeaders.CONTENT_TYPE);
        corsConfiguration.addExposedHeader(HttpHeaders.ACCEPT);
        corsConfiguration.addExposedHeader(HttpHeaders.ORIGIN);
        corsConfiguration.addExposedHeader(HttpHeaders.ACCESS_CONTROL_REQUEST_METHOD);
        corsConfiguration.addExposedHeader(HttpHeaders.ACCESS_CONTROL_REQUEST_HEADERS);
        return corsConfiguration;
    }
}
