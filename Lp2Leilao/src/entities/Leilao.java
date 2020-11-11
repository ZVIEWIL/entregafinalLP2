
package entities;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
public class Leilao {

	private Integer idLeilao;
	private Integer loteProdutos;
	private Date dataOcorrencia;
	private String endereco;
	private String status;
	private String banco;
	
	public Leilao(Integer idLeilao, Integer loteProdutos, Date dataOcorrencia, String endereco, String status,
			String banco) {
		super();
		setIdLeilao(idLeilao);
		setLoteProdutos(loteProdutos);
		setDataOcorrencia(dataOcorrencia);
		setEndereco(endereco);
		setStatus(status);
		setBanco(banco);		
	}

	@Override
	public String toString() {
		return "Leilão [idLeilao=" + idLeilao + ", loteProdutos=" + loteProdutos + ", dataOcorrencia=" + dataOcorrencia
				+ ", endereco=" + endereco + ", status=" + status + ", banco=" + banco + "]";
	}	
	
}


