package br.com.cod3r.exerciciosspringb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@RequestMapping
	public String ola() {
		return "Olá Spring boot";
	}

}
