package model;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Banco;
import entities.Cliente;
import entities.Imovel;
import entities.TipoImovel;
import entities.Veiculo;
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
	
	public void cadastrarCliente() {
		System.out.println("===========================================");
		System.out.println("==========CADASTRO DE CLIENTES=============");
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
	
	public void cadastrarBanco() {
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
	
	public void cadastrarImovel() {
		System.out.println("==========================================");
		System.out.println("============CADASTRO DE IMOVEIS===========");
		System.out.println("==========================================");		
		int id = idProduto;
		System.out.print("LANCE MINIMO: ");
		float lanceMinimo = leitor.nextFloat();
		
		System.out.print("DESCRIÇÃO: ");
		String desc = leitor.next();
		
		System.out.print("ID LEILÃO: ");
		int idLeilao = leitor.nextInt();
		
		System.out.print("CEP: ");
		String cep = leitor.next();
		
		System.out.print("NUMERO: ");
		int numero = leitor.nextInt();
		
		System.out.print("AREA: ");
		float area = leitor.nextFloat();
		
		System.out.print("TIPO: DIGITE UM NUMERO:      \n"
				       + "1 - APARTAMENTO              \n"
				       + "2 - TERRENO                  \n"
				       + "3 - CASA                     \n"
				       + "4 - EDIFICIO COMERCIAL       \n"
				       + "ESCOLHA UMA OPÇÃO:             ");			
		int escolha = leitor.nextInt();	
		String tipo = new String();
		switch(escolha){		    	    
        case 1 :
        	tipo = "APARTAMENTO";
        break;		        
        case 2 :
        	tipo = "TERRENO";
        break;
        case 3 :
        	tipo = "CASA";
        break;    
        case 4 :
        	tipo = "EDIFICIO COMERCIAL";
        break; 
		}
		Imovel imovel = new Imovel(id, lanceMinimo, desc, idLeilao, cep, numero, area, tipo);
		System.out.println("==========================================");
		System.out.println("====IMOVEL CADASTRADO COM SUCESSO!========");
		System.out.println("==========================================");
		idProduto += 1;
	}
	
	public void cadastrarVeiculo() {
		System.out.println("==========================================");
		System.out.println("===========CADASTRO DE VEÍCULOS===========");
		System.out.println("==========================================");		
		int id = idProduto;
		System.out.print("LANCE MINIMO: ");
		float lanceMinimo = leitor.nextFloat();
		
		System.out.print("DESCRIÇÃO: ");
		String desc = leitor.next();
		
		System.out.print("ID LEILÃO: ");
		int idLeilao = leitor.nextInt();
		
		System.out.print("ANO: ");
		int ano = leitor.nextInt();
		
		System.out.print("MODELO: ");
		String modelo = leitor.next();
		
		System.out.print("COR: ");
		String cor = leitor.next();
		
		System.out.print("TIPO: DIGITE UM NUMERO:     \n"
				       + "1 - CARRO                   \n"
				       + "2 - MOTOCICLETA             \n"
				       + "3 - BICICLETA               \n"
				       + "4 - PATINETE                \n"
				       + "5 - SKATE                   \n"
				       + "ESCOLHA UMA OPÇÃO:            ");			
		int escolha = leitor.nextInt();	
		String tipo = new String();
		switch(escolha){		    	    
        case 1 :
        	tipo = "CARRO";
        break;		        
        case 2 :
        	tipo = "MOTOCICLETA";
        break;
        case 3 :
        	tipo = "BICICLETA";
        break;    
        case 4 :
        	tipo = "PATINETE";
        break; 
        case 5 :
        	tipo = "SKATE";
        break; 
		}
		Veiculo veiculo = new Veiculo(idProduto,lanceMinimo,desc,idLeilao,ano,modelo,cor,tipo);
		System.out.println("===========================================");
		System.out.println("====VEÍCULO CADASTRADO COM SUCESSO!========");
		System.out.println("===========================================");
		idProduto += 1;
	}

}
