package model;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Banco;
import entities.Cliente;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ModelW {
	
	int idProduto;
	
	public ModelW(){
		this.idProduto=1;
		
	}
	
	
	static Scanner leitor = new Scanner (System.in);
	
	void cadastrarCliente() {
		System.out.println("===========================================");
		System.out.println("======CADASTRO DE CLIENTES=================");
		System.out.println("===========================================");
		System.out.print("NOME CLIENTE: ");
		String nome = leitor.next();
		System.out.print("ENDEREÇO CLIENTE: ");
		String endereco = leitor.next();
		System.out.print("CPF CLIENTE: ");
		String cpf = leitor.next();
		System.out.print("IDADE CLIENTE: ");
		int idade = leitor.nextInt();				
		Cliente cliente = new Cliente(nome, idade, cpf, endereco);
		System.out.println("====CLIENTE CADASTRADO COM SUCESSO!=======");
		System.out.println("==========================================");
	}
	
	void cadastrarBanco() {
		System.out.println("==========================================");
		System.out.println("======CADASTRO DE FINANCEIRAS=============");
		System.out.println("==========================================");
		System.out.print("NOME FINANCEIRA: ");
		String nome = leitor.next();
		System.out.print("CNPJ FINANCEIRA: ");
		String cnpj = leitor.next();
		System.out.print("CPF CLIENTE: ");						
		Banco banco = new Banco(nome, cnpj);
		System.out.println("==========================================");
		System.out.println("====FINANCEIRA CADASTRADA COM SUCESSO!====");
		System.out.println("==========================================");
	}
	
	void cadastrarImovel() {
		System.out.println("==========================================");
		System.out.println("============CADASTRO DE IMOVEIS===========");
		System.out.println("==========================================");
		int id = idProduto;
		System.out.print("NOME FINANCEIRA: ");
		String nome = leitor.next();
		System.out.print("CNPJ FINANCEIRA: ");
		String cnpj = leitor.next();
		System.out.print("CPF CLIENTE: ");						
		Imovel imovel = new Imovel(id, float lanceMinimo, String desc, int idLeilao, 
				                   String cep, int numero, float area, String tipo)
		System.out.println("==========================================");
		System.out.println("====FINANCEIRA CADASTRADA COM SUCESSO!====");
		System.out.println("==========================================");
		idProduto += 1;
	}

}
