package com.isga.service;

import com.isga.model.User;

public interface IUserService {
	
	public User addUser(User user);
	
	public User updatePassword(Long idUser, String password);
	
	public User authentification(String login, String password);

}
