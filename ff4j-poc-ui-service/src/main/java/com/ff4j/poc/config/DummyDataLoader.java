package com.ff4j.poc.config;

import com.ff4j.poc.dao.RoleDao;
import com.ff4j.poc.dao.UserDao;
import com.ff4j.poc.domain.Role;
import com.ff4j.poc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class DummyDataLoader {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;


    @PostConstruct
    @Transactional
    public void initData() {
        try {
            Role role1 = roleDao.save(createRole("Role 1", "role.1"));
            Role role2 = roleDao.save(createRole("Role 2", "role.2"));
            Role role3 = roleDao.save(createRole("Role 3", "role.3"));

            User user1 = createUser("User 1");
            user1 = addRoleToUser(user1, role1, role2, role3);
            user1 = userDao.save(user1);


            User user2 = createUser("User 2");
            user2 = addRoleToUser(user2, role2);
            user2 = userDao.save(user2);

            User user3 = createUser("User 3");
            user3 = addRoleToUser(user3, role3);
            user3 = userDao.save(user3);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private User createUser(@NotNull final String name) {
        return User.builder().name(name).build();
    }

    private Role createRole(@NotNull final String name, @NotNull final String key) {
        return Role.builder().name(name).key(key).build();
    }

    private User addRoleToUser(@NotNull final User user, Role... roles) {
        user.setRoles(new HashSet<>(Arrays.asList(roles)));
        return user;
    }

}
