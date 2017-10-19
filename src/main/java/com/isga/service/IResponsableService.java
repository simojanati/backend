package com.isga.service;

import com.isga.model.Responsable;

public interface IResponsableService {

	public Responsable addResponsable(Responsable responsable);
	
	public Responsable updateEmail(Long idResponsable, String mail);
	
	public String getEmail();
}
