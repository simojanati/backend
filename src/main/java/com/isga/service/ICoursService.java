package com.isga.service;

import java.util.List;

import com.isga.model.Cours;

public interface ICoursService {

	public Cours addCour(Cours cours);

	public List<Cours> getAllCoursByMatiere(Long idMatiere);

}
