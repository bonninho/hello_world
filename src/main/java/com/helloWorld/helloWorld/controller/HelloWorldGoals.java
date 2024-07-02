package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goals")
public class HelloWorldGoals {
	@GetMapping
	public String Goals() {
		return "Meus objetivos para esta semana são:\n"
				+ "- Entender melhor APIs e Spring,\n"
				+ "- Estudar o conteúdo do curso de sábado e fazer a tarefa,\n"
				+ "- Não surtar";
	}
}
