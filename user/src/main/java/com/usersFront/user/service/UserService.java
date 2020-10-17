package com.usersFront.user.service;

import java.util.Set;

import com.usersFront.user.domain.User;
import com.usersFront.user.domain.security.UserRole;

public interface UserService {
	
	User findByUsername(String username);
	User findByEmail(String email);
	
	boolean checkUserExists(String username, String email);
	boolean checkUsernameExists(String username);
	boolean checkEmailExists(String email);
	
	void save(User user);
	
	User createUser(User user, Set<UserRole> userRoles);
	

}
