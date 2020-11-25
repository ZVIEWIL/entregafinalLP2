package entities;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Lance {
	Cliente idPessoa;	
	Double valor;
	Leilao idLeilao;
	
	public Lance (Cliente idPessoa, Double valor, Leilao idLeilao) {
		setIdPessoa(idPessoa);
		setValor(valor);
		setIdLeilao(idLeilao);		
	}	
}
