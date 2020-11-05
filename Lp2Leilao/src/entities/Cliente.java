
package entities;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Cliente {
	
	private String nome;
	private String idade;
	private int cpf;
	private String endereco;
	
	public Cliente(String nome, String idade, int cpf, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
}
