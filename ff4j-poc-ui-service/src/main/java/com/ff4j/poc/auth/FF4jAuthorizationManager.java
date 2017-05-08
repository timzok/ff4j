package com.ff4j.poc.auth;

import com.ff4j.poc.service.UserService;
import org.ff4j.security.AbstractAuthorizationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

public class FF4jAuthorizationManager extends AbstractAuthorizationManager {

    public static ThreadLocal<String> context;

    private UserService userService;

    public FF4jAuthorizationManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getCurrentUserName() {
        return context.get();
    }

    @Override
    public Set<String> getCurrentUserPermissions() {
        Set<String> result = new HashSet<>();
        return result;
    }

    @Override
    public Set<String> listAllPermissions() {
        HashSet result = new HashSet<>(userService.getAllRoles());
        return result;
    }
}
