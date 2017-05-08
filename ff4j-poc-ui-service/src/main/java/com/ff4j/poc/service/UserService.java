package com.ff4j.poc.service;

import com.ff4j.poc.dao.RoleDao;
import com.ff4j.poc.dao.UserDao;
import com.ff4j.poc.domain.Role;
import com.ff4j.poc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;


    public List<User> getAllUser() {
        final List<User> result = new ArrayList<>();

        Iterable<User> users = this.userDao.findAll();
        if (users != null) {
            users.forEach(result::add);
        }

        return result;
    }

    public User findUserById(@NotNull final Long id) {
        return this.userDao.findOne(id);
    }

    public User saveUser(@NotNull final User user) {
       return this.userDao.save(user);
    }

    public List<Role> getAllRoles() {
        final List<Role> result = new ArrayList<>();

        Iterable<Role> users = this.roleDao.findAll();
        if (users != null) {
            users.forEach(result::add);
        }

        return result;
    }

    public Role findRoleById(@NotNull final Long id) {
        return this.roleDao.findOne(id);
    }

    public Role findRoleByKey(@NotNull final String key) {
        return this.roleDao.findRoleByKey(key);
    }
}
