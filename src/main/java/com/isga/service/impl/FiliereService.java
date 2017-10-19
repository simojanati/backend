package com.isga.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isga.dao.IFiliereRepository;
import com.isga.model.Filiere;
import com.isga.service.IFiliereService;

@Service
@Transactional
public class FiliereService implements IFiliereService {

	@Autowired
	private IFiliereRepository filiereRepository;

	@Override
	public Filiere addFiliere(Filiere filiere) {
		return filiereRepository.save(filiere);
	}

	@Override
	public List<Filiere> getAllFilieres() {
		List<Filiere> filieres = filiereRepository.findAll();
		return filieres;
	}

	@Override
	public Filiere getFiliereById(Long idFiliere) {
		return filiereRepository.findOne(idFiliere);
	}

}
