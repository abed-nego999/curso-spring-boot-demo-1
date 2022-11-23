package com.example.demo.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Casa;
import com.example.demo.service.CasaService;

@RestController
public class CasaREST {

	Logger log = LoggerFactory.getLogger(CasaREST.class);

	@Autowired
	CasaService servicio;

	@GetMapping
	public Iterable<Casa> list() {
		log.debug("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡MI TRAZA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return servicio.list();
	}

	@PostMapping
	public Casa crearCasa(@RequestBody Casa casa) {
		return servicio.addCasa(casa);
	}
}
