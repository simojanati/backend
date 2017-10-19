package com.isga.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isga.model.Matiere;
import com.isga.service.IMatiereService;

@RestController
@CrossOrigin
@RequestMapping("/matiere")
public class MatiereRestController {

	@Autowired
	private IMatiereService matiereService;

	@GetMapping("/getMatiere/{idFiliere}")
	public List<Matiere> getMatiereByFiliere(@PathVariable("idFiliere") Long idFiliere) {
		try {
			return matiereService.getAllMatieresByFiliere(idFiliere);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@GetMapping("/getMatiereById/{idMatiere}")
	public Matiere getMatiereById(@PathVariable("idMatiere") Long idMatiere) {
		try {
			return matiereService.getMatiereById(idMatiere);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
