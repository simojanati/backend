package com.isga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "responsable")
public class Responsable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3155864620270640879L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_responsable")
	private Long idResponsable;
	private String email;

	public Long getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Responsable(String email) {
		super();
		this.email = email;
	}

	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Responsable [idResponsable=" + idResponsable + ", email=" + email + "]";
	}

}
