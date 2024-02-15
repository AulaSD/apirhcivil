package rh.civil.apirhcivil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import rh.civil.apirhcivil.dto.DadosCadastrarFuncao;
import rh.civil.apirhcivil.entidade.Funcao;
import rh.civil.apirhcivil.repository.FuncaoRepository;

@RestController
@RequestMapping("/funcao")
public class FuncaoController {

	@Autowired
	private FuncaoRepository repository;
	
	@PostMapping
	
	public void cadastrar(@RequestBody @Valid DadosCadastrarFuncao dados) {
		repository.save(new Funcao(dados));
	}
}
