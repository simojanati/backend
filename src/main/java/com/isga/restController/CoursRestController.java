package com.isga.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isga.model.Cours;
import com.isga.service.ICoursService;

@RestController
@CrossOrigin
@RequestMapping("/cours")
public class CoursRestController {

	@Autowired
	private ICoursService coursService;

	@GetMapping("/getCours/{idMatiere}")
	public List<Cours> getCours(@PathVariable("idMatiere") Long idMatiere) {
		try {
			return coursService.getAllCoursByMatiere(idMatiere);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
