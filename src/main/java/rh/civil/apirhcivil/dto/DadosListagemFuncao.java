package rh.civil.apirhcivil.dto;

import rh.civil.apirhcivil.entidade.Funcao;

public record DadosListagemFuncao(String nome, String descricao) {

	public DadosListagemFuncao(Funcao funcao) {
		this(funcao.getNome(),funcao.getDescricao());
	}
}
