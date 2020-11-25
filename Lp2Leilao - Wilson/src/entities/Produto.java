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
		setIdProduto(idProduto);
		setLanceMinimo(lanceMinimo);
		setDesc(desc);
		setIdLeilao(idLeilao);
	}
}