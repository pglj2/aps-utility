package br.com.mpmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mpmanager.models.Atividade;

@Controller
public class AtividadeController {

	@RequestMapping("/atividade/cadastro")
	public String formCadastro() {
		return "atividade/cadastro";
	}
	
	@RequestMapping("/atividade")
	public String cadastrarAtividade(Atividade atividade) {
		System.out.println(atividade);
		return "/";
	}
	
}
