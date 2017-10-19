package com.isga.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isga.model.Filiere;
import com.isga.service.IFiliereService;

@RestController
@CrossOrigin
@RequestMapping("/filiere")
public class FiliereRestController {

	@Autowired
	private IFiliereService filiereService;

	@GetMapping("/getFiliers")
	public List<Filiere> getFilieres() {
		try {
			return filiereService.getAllFilieres();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@GetMapping("/getFilierById/{idFiliere}")
	public Filiere getFilierById(@PathVariable("idFiliere") Long idFiliere) {
		try {
			return filiereService.getFiliereById(idFiliere);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
