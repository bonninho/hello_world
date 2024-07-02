package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class HelloWorldBSM {
	@GetMapping
	public String Bsms() {
		return "BSMs da Generation:\n"
				+ "Persistência,\n"
				+ "Proatividade,\n"
				+ "Comunicação,\n"
				+ "Orientação ao Futuro,\n"
				+ "Trabalho em Equipe,\n"
				+ "Atenção aos Detalhes,\n"
				+ "Responsabilidade Pessoal,\n"
				+ "Mentalidade de Crescimento";
	}
}
