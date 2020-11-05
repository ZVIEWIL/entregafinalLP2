package entities;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Produto {
	
	public int idProduto;
	public float lanceMinimo;
	public String desc;
	public int idLeilao;
	
	// constructor
	public Produto(int idProduto, float lanceMinimo, String desc, int idLeilao) {
		super();
		this.idProduto = idProduto;
		this.lanceMinimo = lanceMinimo;
		this.desc = desc;
		this.idLeilao = idLeilao;
	}
}