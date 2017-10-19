package com.isga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "matiere")
public class Matiere implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5275321664662149251L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_matiere")
	private Long idMatiere;
	private String libelleMatiere;

	@ManyToOne
	@JoinColumn(name = "id_filiere", referencedColumnName = "id_filiere")
	@JsonIgnore
	private Filiere filiere;

	public Long getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getLibelleMatiere() {
		return libelleMatiere;
	}

	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Matiere(String libelleMatiere) {
		super();
		this.libelleMatiere = libelleMatiere;
	}

	public Matiere(String libelleMatiere, Filiere filiere) {
		super();
		this.libelleMatiere = libelleMatiere;
		this.filiere = filiere;
	}

	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", libelleMatiere=" + libelleMatiere + ", filiere="
				+ filiere.getLibelleFiliere() + "]";
	}

}
