package com.isga.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isga.dao.ICoursRepository;
import com.isga.model.Cours;
import com.isga.service.ICoursService;

@Service
@Transactional
public class CoursService implements ICoursService {

	@Autowired
	private ICoursRepository coursRepository;

	@Override
	public Cours addCour(Cours cours) {
		return coursRepository.save(cours);
	}

	@Override
	public List<Cours> getAllCoursByMatiere(Long idMatiere) {
		List<Cours> cours = coursRepository.getCoursByMatiere(idMatiere);
		return cours;
	}

}
