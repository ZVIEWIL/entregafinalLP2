
package entities;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Cliente {
	
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	
	public Cliente(String nome, int idade, String cpf, String endereco) {
		super();
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setEndereco(endereco);		
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
}
