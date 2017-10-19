package com.isga.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isga.dao.IUserRepository;
import com.isga.model.User;
import com.isga.service.IUserService;

@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updatePassword(Long idUser, String password) {
		User user = userRepository.findOne(idUser);
		user.setPassword(password);
		return user;
	}

	@Override
	public User authentification(String login, String password) {
		User user = userRepository.getUSerByLogin(login);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				return user;
			} else {
				return new User("", "", "vide", "", "");
			}
		} else {
			return new User("", "", "vide", "", "");
		}
	}

}
