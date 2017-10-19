package com.isga.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isga.dao.IResponsableRepository;
import com.isga.model.Responsable;
import com.isga.service.IResponsableService;

@Service
@Transactional
public class ResponsableService implements IResponsableService {

	@Autowired
	private IResponsableRepository responsableRepository;

	@Override
	public Responsable addResponsable(Responsable responsable) {
		return responsableRepository.save(responsable);
	}

	@Override
	public Responsable updateEmail(Long idResponsable, String mail) {
		Responsable responsable = responsableRepository.findOne(idResponsable);
		responsable.setEmail(mail);
		return responsable;
	}

	@Override
	public String getEmail() {
		List<Responsable> responsables = responsableRepository.findAll();
		String email = responsables.get(0).getEmail();
		return email;
	}

}
