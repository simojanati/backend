package com.isga.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.isga.model.Cours;

public interface ICoursRepository extends JpaRepository<Cours, Long> {

	
	@Query(nativeQuery = true, value = "SELECT * FROM cours c WHERE c.id_matiere=:x")
	public List<Cours> getCoursByMatiere(@Param("x") Long idMatiere);
	
}
