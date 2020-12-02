package entities;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Lance {
	int idLance;
	String cpfPessoa;
	int idLeilao;
	int idProduto;
	float valor;	
	
	public Lance (int idLance, String cpfPessoa, int idLeilao, int idProduto, float valor) {
		setIdLance(idLance);
		setCpfPessoa(cpfPessoa);		
		setIdLeilao(idLeilao);
		setIdProduto(idProduto);
		setValor(valor);
	}	
}
