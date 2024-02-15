package rh.civil.apirhcivil.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rh.civil.apirhcivil.dto.DadosCadastrarFuncao;

@Table(name="funcao_colaborador")
@Entity(name="Funcao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idfuncao")
public class Funcao {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idfuncao;
	private String nome;
	private String descricao;

	public Funcao(DadosCadastrarFuncao dados) {
		this.nome = dados.nome();
		this.descricao = dados.descricao();
	}
}
