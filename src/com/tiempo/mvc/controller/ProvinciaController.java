package com.tiempo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tiempo.mvc.service.RegistroMetereologicoService;

@Controller
@RequestMapping("/provincia")
public class ProvinciaController {
	
	private RegistroMetereologicoService service;
	
	protected ProvinciaController() {
		super();
		service = new RegistroMetereologicoService();
	}

	@RequestMapping(value="list", method=RequestMethod.GET)
	public String ListadoProvincias(Model model) {
		model.addAttribute("provincias", service.provinciaList());
		return "Listadopronvincias";
	}
}
