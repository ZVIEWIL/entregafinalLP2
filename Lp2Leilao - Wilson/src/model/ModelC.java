package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import entities.Imovel;
import entities.TipoImovel;
import entities.Banco;
import entities.Produto;
import entities.Leilao;
import entities.TipoVeiculo;
import entities.Veiculo;
import entities.Lance;




public class ModelC {


	private Scanner print;
	
	
	private static List<Cliente> clientes;
	private static List<Imovel> imoveis;
	private static List<TipoImovel> tipoimoveis;
	private static List<Banco> bancos;
	private static List<Produto> produtos;
	static List<Leilao> leiloes;
	private static List<TipoVeiculo> tipoveiculos;
	private static List<Veiculo> veiculos;
	static List<Lance> lances;
	
	

	public ModelC() {
		
		clientes = new ArrayList<>();
		imoveis = new ArrayList<>();
		bancos = new ArrayList<>();
		leiloes = new ArrayList<>();
		veiculos = new ArrayList<>();
		tipoveiculos = new ArrayList<>();
		produtos = new ArrayList<>();
		lances = new ArrayList<>();
		
		
		print = new Scanner(System.in);
		
		
	}
	
	
	
	void removerCliente() {
		
		System.out.println("Insira o idCliente: ");
		String nome = print.next();
		
	for (int i = 0; i < clientes.size(); i++) {
	    if (clientes.get(i).getNome().equals(nome)) {
	      clientes.remove(i);
	    }
	  }
	System.out.println("Cliente removido com sucesso");
	}
	
	
	
	void removerImovel() {
		
		System.out.println("Insira o CEP do imóvel: ");
		String cep = print.next();
		
	for (int i = 0; i < imoveis.size(); i++) {
	    if (imoveis.get(i).getCep().equals(cep)) {
	      imoveis.remove(i);
	    }
	  }
	System.out.println("Imóvel Removido com sucesso");
	}
	
	
	
	void removerVeiculo() {
		
		System.out.println("Insira o Tipo do Veículo: ");
		String tipo = print.next();
		
	for (int i = 0; i < veiculos.size(); i++) {
	    if (veiculos.get(i).getTipo().equals(tipo)) {
	      veiculos.remove(i);
	    }
	  }
	System.out.println("Veículo Removido com sucesso");
	}
	
	
	
	void removerBanco() {
		
		System.out.println("Insira o CNPJ do Banco: ");
	String	cnpjFinanceira = print.next();
		
	for (int i = 0; i < bancos.size(); i++) {
	    if (bancos.get(i).getCnpjFinanceira().equals(cnpjFinanceira)) {
	    	bancos.remove(i);
	    }
	  }
	System.out.println("Financeira Removida com sucesso");
	}
	
	
	
	void removerLeilao() {
		
		System.out.println("Insira o numero o Id do Leilao: ");
	int	idLeilao = print.nextInt();
		
	for (int i = 0; i < leiloes.size(); i++) {
	    if (leiloes.get(i).getIdLeilao().equals(idLeilao)) {
	    	leiloes.remove(i);
	    }
	  }
	System.out.println("Leilão Removido com sucesso");
	}
	
	


}
