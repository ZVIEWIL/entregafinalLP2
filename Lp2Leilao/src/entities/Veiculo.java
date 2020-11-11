package entities;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Veiculo extends Produto{

	public int ano;
	public String modelo;
	public String cor;
	public String tipo;
	
	// constructor
	public Veiculo(int idProduto, float lanceMinimo, String desc, int idLeilao, int ano, String modelo, String cor, String tipo) {
		super(idProduto, lanceMinimo, desc, idLeilao);
		setAno(ano);
		setModelo(modelo);
		setCor(cor);
		setTipo(tipo);
		
	}	
}