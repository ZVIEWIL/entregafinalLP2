package entities;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Imovel extends Produto {
	public String cep;
	public int numero;
	public float area;
	public String tipo;
	
	//constructor
	public Imovel(int idProduto, float lanceMinimo, String desc, int idLeilao, String cep, int numero, float area,
			String tipo) {
		super(idProduto, lanceMinimo, desc, idLeilao);
		setCep(cep);
		setNumero(numero);
		setArea(area);
		setTipo(tipo);
	}
}
