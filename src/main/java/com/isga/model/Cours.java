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

@Entity(name = "cours")
public class Cours implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3706289974577096587L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cours")
	private Long idCours;
	private String libelleCours;
	private String imgCouverture;
	private String pdfSommaire;

	@ManyToOne
	@JoinColumn(name = "id_matiere", referencedColumnName = "id_matiere")
	@JsonIgnore
	private Matiere matiere;

	public Long getIdCours() {
		return idCours;
	}

	public void setIdCours(Long idCours) {
		this.idCours = idCours;
	}

	public String getLibelleCours() {
		return libelleCours;
	}

	public void setLibelleCours(String libelleCours) {
		this.libelleCours = libelleCours;
	}

	public String getImgCouverture() {
		return imgCouverture;
	}

	public void setImgCouverture(String imgCouverture) {
		this.imgCouverture = imgCouverture;
	}

	public String getPdfSommaire() {
		return pdfSommaire;
	}

	public void setPdfSommaire(String pdfSommaire) {
		this.pdfSommaire = pdfSommaire;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Cours(String libelleCours, String imgCouverture, String pdfSommaire) {
		super();
		this.libelleCours = libelleCours;
		this.imgCouverture = imgCouverture;
		this.pdfSommaire = pdfSommaire;
	}

	public Cours(String libelleCours, String imgCouverture, String pdfSommaire, Matiere matiere) {
		super();
		this.libelleCours = libelleCours;
		this.imgCouverture = imgCouverture;
		this.pdfSommaire = pdfSommaire;
		this.matiere = matiere;
	}

	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cours [idCours=" + idCours + ", libelleCours=" + libelleCours + ", imgCouverture=" + imgCouverture
				+ ", pdfSommaire=" + pdfSommaire + ", matiere=" + matiere.getLibelleMatiere() + "]";
	}

}
