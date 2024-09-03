package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


    @Configuration
    @RestController
    public class WebConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")  // 들어오는 모든 요청 허용
                    .allowedOrigins("http://localhost:8081") // 특정 서버 주소 허용
                    // 둘 중에 하나 사용
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 허용되는 메서드
                    .allowedHeaders("*")    // 모든 헤더 허용
                    .exposedHeaders("Authorization", "X-Auth-Token") // 특정 헤더 허용
                    .allowCredentials(true);    // 자격 증명 허용
        }
    }


