package com.isga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "filiere")
public class Filiere implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5157706888640874443L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_filiere")
	private Long idFiliere;
	private String libelleFiliere;
	private String iconFiliere;
	private String imgFiliere;

	public Long getIdFiliere() {
		return idFiliere;
	}

	public void setIdFiliere(Long idFiliere) {
		this.idFiliere = idFiliere;
	}

	public String getImgFiliere() {
		return imgFiliere;
	}

	public void setImgFiliere(String imgFiliere) {
		this.imgFiliere = imgFiliere;
	}

	public String getLibelleFiliere() {
		return libelleFiliere;
	}

	public void setLibelleFiliere(String libelleFiliere) {
		this.libelleFiliere = libelleFiliere;
	}

	public String getIconFiliere() {
		return iconFiliere;
	}

	public void setIconFiliere(String iconFiliere) {
		this.iconFiliere = iconFiliere;
	}

	public Filiere(String libelleFiliere, String iconFiliere, String imgFiliere) {
		super();
		this.libelleFiliere = libelleFiliere;
		this.iconFiliere = iconFiliere;
		this.imgFiliere = imgFiliere;
	}

	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Filiere [idFiliere=" + idFiliere + ", libelleFiliere=" + libelleFiliere + ", iconFiliere=" + iconFiliere
				+ ", imgFiliere=" + imgFiliere + "]";
	}

}
