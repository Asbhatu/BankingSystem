package com.usersFront.user.Dao;

import org.springframework.data.repository.CrudRepository;

import com.usersFront.user.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
	Role findByName(String name);

}
