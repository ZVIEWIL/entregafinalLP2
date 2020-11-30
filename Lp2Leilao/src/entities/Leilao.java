
package entities;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
public class Leilao {

	private int idLeilao;
	private Date dataInicio;
	private Date dataFim;
	private String endereco;
	private String banco;
	
	public Leilao(int idLeilao, Date dataInicio,Date dataFim, String endereco, String banco) {
		super();
		setIdLeilao(idLeilao);
		setDataInicio(dataInicio);
		setDataFim(dataFim);
		setEndereco(endereco);
		setBanco(banco);		
	}

	@Override
	public String toString() {
		return "Leilão [idLeilao=" + idLeilao + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", endereco=" + endereco + ", banco=" + banco + "]";
	}	
	
}


