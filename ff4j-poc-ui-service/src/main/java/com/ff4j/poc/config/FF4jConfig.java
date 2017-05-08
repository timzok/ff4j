package com.ff4j.poc.config;

import com.ff4j.poc.auth.FF4jAuthorizationManager;
import com.ff4j.poc.service.UserService;
import org.ff4j.FF4j;
import org.ff4j.web.FF4jDispatcherServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FF4jConfig {

    @Autowired
    private UserService userService;

    @Bean
    public FF4j getFF4j() {
        final FF4j result = new FF4j("ff4j.xml");
        final FF4jAuthorizationManager authorizationManager = new FF4jAuthorizationManager(userService);
        result.setAuthorizationsManager(authorizationManager);
        return result;
    }

    @Bean
    public FF4jDispatcherServlet getFF4JServlet() {
        FF4jDispatcherServlet ds = new FF4jDispatcherServlet();
        ds.setFf4j(getFF4j());
        return ds;
    }

}
