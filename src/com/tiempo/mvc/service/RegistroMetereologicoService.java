package com.tiempo.mvc.service;

import java.util.List;
import java.util.stream.Collectors;

import com.tiempo.mvc.model.RegistroDatos;
import com.tiempo.mvc.repository.RegistroDatosRepository;

public class RegistroMetereologicoService {
	
	private RegistroDatosRepository repository;

	public RegistroMetereologicoService() {
		super();
		// TODO Auto-generated constructor stub
		repository = new RegistroDatosRepository();
	}
	
	public List<RegistroDatos> provinciaList()
	{
		return RegistroDatosRepository.getAll();
	}
}
