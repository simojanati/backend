package com.isga.service;

import java.util.List;

import com.isga.model.Filiere;

public interface IFiliereService {

	public Filiere addFiliere(Filiere filiere);
	
	public List<Filiere> getAllFilieres();
	
	public Filiere getFiliereById(Long idFiliere);
}
