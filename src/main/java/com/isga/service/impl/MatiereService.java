package com.isga.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isga.dao.IMatiereRepository;
import com.isga.model.Matiere;
import com.isga.service.IMatiereService;

@Service
@Transactional
public class MatiereService implements IMatiereService {

	@Autowired
	private IMatiereRepository matiereRepository;

	@Override
	public Matiere addMatiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}

	@Override
	public List<Matiere> getAllMatieresByFiliere(Long idFiliere) {
		List<Matiere> matieres = matiereRepository.getMatieresByFiliere(idFiliere);
		return matieres;
	}

	@Override
	public Matiere getMatiereById(Long idMatiere) {
		return matiereRepository.findOne(idMatiere);
	}

}
