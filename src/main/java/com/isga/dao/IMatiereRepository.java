package com.isga.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.isga.model.Matiere;

public interface IMatiereRepository extends JpaRepository<Matiere, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM matiere m WHERE m.id_filiere=:x")
	public List<Matiere> getMatieresByFiliere(@Param("x") Long idFiliere);
	
}
