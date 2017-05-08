package com.ff4j.poc.config;

import org.ff4j.web.FF4jDispatcherServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.h2.server.web.WebServlet;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends SpringBootServletInitializer {

    @Autowired
    private FF4jDispatcherServlet ff4jServlet;

    @Bean
    public ServletRegistrationBean registerFF4jServlet(){
        return new ServletRegistrationBean(ff4jServlet, "/ff4j/*");
    }

    @Bean
    public ServletRegistrationBean registerH2Servlet(){
        return new ServletRegistrationBean(new WebServlet(), "/h2/*");
    }

//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/user").allowedOrigins("http://localhost:4200");
//            }
//        };
//    }

}
