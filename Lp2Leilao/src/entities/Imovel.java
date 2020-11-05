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
		this.cep = cep;
		this.numero = numero;
		this.area = area;
		this.tipo = tipo;
	}
}
