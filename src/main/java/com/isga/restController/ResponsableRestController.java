package com.isga.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isga.service.IResponsableService;

@RestController
@CrossOrigin
@RequestMapping("/responsable")
public class ResponsableRestController {

	@Autowired
	private IResponsableService responsableService;
	
	@GetMapping("/getEmail")
	public String getEmail() {
		try {
			return responsableService.getEmail();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
