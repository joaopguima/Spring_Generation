package com.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class ControllerHelloWorld {
	
	@GetMapping
	public String helloWorld() {
		
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		
		return "TRABALHO EM EQUIPE\r\n"
				+ "ORIENTAÇÃO AO DETALHE\r\n"
				+ "PROATIVIDADE\r\n"
				+ "COMUNICAÇÃO\r\n"
				+ "\nMENTALIDADES\r\n"
				+ "ORIENTAÇÃO AO FUTURO\r\n"
				+ "RESPONSABILIDADE PESSOAL\r\n"
				+ "MENTALIDADE DE CRESCIMENTO\r\n"
				+ "PERSISTÊNCIA";
	}
	
	@GetMapping("/meus-obj")
	public String meusObjetivos() {
		
		return "Meus objetivos de aprendizagem desta semana é: "
				+ "\nAprender e dominar o Spring."
				+ "\nEntender o funcionamento do Spring no Desenvolvimento."
				+ "\nE alavancar mais uma semana de sucesso dentro do bootcamp.";
	}
	
}
