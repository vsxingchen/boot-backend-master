package com.admin.server.service;

import com.admin.server.model.User;
import com.admin.server.dto.UserDto;

public interface UserService {

	User saveUser(UserDto userDto);
	
	User updateUser(UserDto userDto);

	String passwordEncoder(String credentials, String salt);

	User getUser(String username);

	void changePassword(String username, String oldPassword, String newPassword);

}
