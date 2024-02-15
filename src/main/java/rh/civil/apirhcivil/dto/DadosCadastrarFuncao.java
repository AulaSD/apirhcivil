package rh.civil.apirhcivil.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastrarFuncao(
		@NotBlank
		String nome,
		@NotBlank
		String descricao
		) {

}
