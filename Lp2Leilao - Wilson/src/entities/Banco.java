package entities;


import lombok.Getter;
import lombok.Setter;
@Setter
@Getter


public class Banco {
	
	public String nomeFinanceira;
	public String cnpjFinanceira;
	
	public Banco (String nomeFinanceira, String cnpjFinanceira) {
		setNomeFinanceira(nomeFinanceira);
		setCnpjFinanceira(cnpjFinanceira);
			
	}
}
