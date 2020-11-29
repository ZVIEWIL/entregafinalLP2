package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Banco;
import entities.Lance;
import entities.Leilao;
import entities.Veiculo;
import entities.Cliente;
import entities.Imovel;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ModelD {
	int idProduto;
	//INSTANCIANDO AS LISTAS 
	private static List<Cliente> clientes;
	private static List<Imovel> imoveis;
	private static List<Veiculo> veiculos;
	private static List<Banco> bancos;
	static List<Leilao> leiloes;
	static List<Lance> lances;

		//CRIANDO ARRAYLISTS
		public ModelD() {
			clientes = new ArrayList<>();
			imoveis = new ArrayList<>();
			bancos = new ArrayList<>();
			leiloes = new ArrayList<>();
			veiculos = new ArrayList<>();
			lances = new ArrayList<>();
		}
	
	
	static Scanner leitor = new Scanner (System.in);
	
	public void consultarClientes() {
		for (Cliente Cliente : clientes) {
			System.out.println("Nome: " + Cliente.getNome() + "  \nCPF: " + Cliente.getCpf());
		}
	}
	
	public void consultarBancos() {
		for (Banco Banco : bancos) {
			System.out.println("Nome: " + Banco.getNomeFinanceira()+ "  \nCNPJ: " + Banco.getCnpjFinanceira());
		}
	}
	
	public void consultarImoveis() {
		for (Imovel Imovel : imoveis) {
			System.out.println("Descrição: " + Imovel.getDesc()+ "  \nTipo: " + Imovel.getTipo());
		}
	}
	
	public void consultarVeiculos() {
		for (Veiculo Veiculo : veiculos) {
			System.out.println("Descrição: " + Veiculo.getDesc()+ "  \nTipo: " + Veiculo.getTipo());
		}
	}
	
	public void consultarLeiloes() {
		for (Leilao Leilao : leiloes) {
			System.out.println("Banco: " + Leilao.getBanco()+ "  \nEndereço: " + Leilao.getEndereco());
		}
	}
}
