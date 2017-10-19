package com.isga.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isga.model.User;
import com.isga.service.IUserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/authentification")
	public User authentification(@RequestParam(value = "username") String login,
			@RequestParam(value = "token") String password) {
		try {
			User user = userService.authentification(login, password);
			return user;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new User("", "", "vide", "", "");
		}
	}
}
