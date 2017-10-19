package com.isga.service;

import java.util.List;

import com.isga.model.Matiere;

public interface IMatiereService {
	
	public Matiere addMatiere(Matiere matiere);
	
	public List<Matiere> getAllMatieresByFiliere(Long idFiliere);
	
	public Matiere getMatiereById(Long idMatiere);

}
