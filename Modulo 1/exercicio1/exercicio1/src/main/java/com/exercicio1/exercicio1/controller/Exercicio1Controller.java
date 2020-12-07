package com.exercicio1.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio1")
public class Exercicio1Controller {

	@GetMapping("/habilidade1")
	public String hab1() {
		
		return "Proatividade";
	}
	
	@GetMapping("/habilidade2")
	public String hab2() {
		
		return "Atenção aos detalhes";
	}
	
	@GetMapping("/metalidade1")
	public String ment1() {
		
		return "Mentalidade de crescimento";
	}
	
	@GetMapping("/mentalidade2")
	public String ment2() {
		
		return "Persistência";
	}
}
