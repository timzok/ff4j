package com.ff4j.poc.dao;

import com.ff4j.poc.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

@Repository
public interface RoleDao extends CrudRepository<Role, Long> {

    Role findRoleByKey(@NotNull String key);
}
