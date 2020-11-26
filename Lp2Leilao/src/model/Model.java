package model;

import java.text.SimpleDateFormat;
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
public class Model {
	// INSTANCIADO IDS
	int idProduto;
	int idLeilao;
	//INSTANCIANDO AS LISTAS 
	private static List<Cliente> clientes;
	private static List<Imovel> imoveis;
	private static List<Veiculo> veiculos;
	private static List<Banco> bancos;
	static List<Leilao> leiloes;
	static List<Lance> lances;

		//CRIANDO ARRAYLISTS
		public Model() {
			clientes = new ArrayList<>();
			imoveis = new ArrayList<>();
			bancos = new ArrayList<>();
			leiloes = new ArrayList<>();
			veiculos = new ArrayList<>();
			lances = new ArrayList<>();
			this.idProduto=1;
			this.idLeilao=1;
		}
	
	
	static Scanner leitor = new Scanner (System.in);
	
	
	// @@@@@@@@@@@@@@@@@@ LISTAGENS @@@@@@@@@@@@@@@@@@
	public void consultarClientes() {
		System.out.println("================================");
		System.out.println("======= LISTA DE CLIENTES ======");
		System.out.println("================================");
		for (Cliente Cliente : clientes) {
			System.out.println(	"\nNome: " + Cliente.getNome() + 
								" \nCPF: " + Cliente.getCpf() + 
								" \nEndereço: " + Cliente.getEndereco() + 
								" \nIdade: " + Cliente.getIdade()
					);
			System.out.println("================================");
		}
	}
	
	public void consultarBancos() {
		System.out.println("================================");
		System.out.println("======== LISTA DE BANCOS =======");
		System.out.println("================================");
		for (Banco Banco : bancos) {
			System.out.println(	"Nome: " + Banco.getNomeFinanceira()+ 
								"\nCNPJ: " + Banco.getCnpjFinanceira());
			System.out.println("================================");
		}
		System.out.println("\n");
	}
	
	public void consultarImoveis() {
		System.out.println("================================");
		System.out.println("======= LISTA DE IMÓVEIS =======");
		System.out.println("================================");
		for (Imovel Imovel : imoveis) {
			System.out.println(	"Descrição: " + Imovel.getDesc()+ 
								"\nTipo: " + Imovel.getTipo() +
								"\nÁrea: " + Imovel.getArea() +
								"\nNúmero: " + Imovel.getNumero() +
								"\nCEP: " + Imovel.getCep() +								
								"\nID Leilão: " + Imovel.getIdLeilao() +
								"\nID Produto: " + Imovel.getIdProduto() +
								"\nLance Mínimo: " + Imovel.getLanceMinimo());
			System.out.println("================================");
		}
		System.out.println("\n");
	}
	
	public void consultarVeiculos() {
		System.out.println("================================");
		System.out.println("====== LISTA DE VEÍCULOS =======");
		System.out.println("================================");
		for (Veiculo Veiculo : veiculos) {
			System.out.println(	"Descrição: " + Veiculo.getDesc()+ 
								"\nTipo: " + Veiculo.getTipo() +
								"\nAno: " + Veiculo.getAno() +
								"\nCor: " + Veiculo.getCor() +
								"\nModelo: " + Veiculo.getModelo() +								
								"\nID Leilão: " + Veiculo.getIdLeilao() +
								"\nID Produto: " + Veiculo.getIdProduto() +
								"\nLance Mínimo: " + Veiculo.getLanceMinimo());
			System.out.println("================================");
		}
		System.out.println("\n");
	}
	
	public void consultarLeiloes() {
		System.out.println("================================");
		System.out.println("======= LISTA DE LEILÕES =======");
		System.out.println("================================");
		for (Leilao Leilao : leiloes) {
			System.out.println(	"ID Leilão: " + Leilao.getIdLeilao() +
								"\nEndereço: " + Leilao.getEndereco() +
								"\nStatus: " + Leilao.getStatus() +
								"\nBanco: " + Leilao.getBanco()+ 
								"\nProdutos: " + Leilao.getLoteProdutos()
								);
			System.out.println("================================");
		}
		System.out.println("\n");
	}
	
	// @@@@@@@@@@@@@@@@@@ CONSULTAS @@@@@@@@@@@@@@@@@@
	
	public void cadastrarCliente() {
		System.out.println("================================");
		System.out.println("===== CADASTRO DE CLIENTES =====");
		System.out.println("================================");
		System.out.print("NOME CLIENTE: ");
		String nome = leitor.next();
		System.out.print("ENDEREÇO CLIENTE: ");
		String endereco = leitor.next();
		System.out.print("CPF CLIENTE: ");
		String cpf = leitor.next();
		System.out.print("IDADE CLIENTE: ");
		int idade = leitor.nextInt();				
		clientes.add(new Cliente(nome, idade, cpf, endereco));
		System.out.println("===== CLIENTE CADASTRADO COM SUCESSO! =====");
		System.out.println("===========================================");
	}
	
	public void cadastrarBanco() {
		System.out.println("==========================================");
		System.out.println("=========== CADASTRO DE BANCOS ===========");
		System.out.println("==========================================");
		System.out.print("NOME FINANCEIRA: ");
		String nome = leitor.next();
		System.out.print("CNPJ FINANCEIRA: ");
		String cnpj = leitor.next();
		System.out.print("CPF CLIENTE: ");						
		bancos.add(new Banco(nome, cnpj));
		System.out.println("==========================================");
		System.out.println("====BANCO CADASTRADA COM SUCESSO!====");
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
		imoveis.add(new Imovel(id, lanceMinimo, desc, idLeilao, cep, numero, area, tipo));
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
		veiculos.add(new Veiculo(idProduto,lanceMinimo,desc,idLeilao,ano,modelo,cor,tipo));
		System.out.println("===========================================");
		System.out.println("====VEÍCULO CADASTRADO COM SUCESSO!========");
		System.out.println("===========================================");
		idProduto += 1;
	}
	
	public void cadastrarLeilao() throws ParseException {
		System.out.println("==========================================");
		System.out.println("========== CADASTRO DE LEILÕES ===========");
		System.out.println("==========================================");
		
		System.out.print("idLeilao: ");
		int idLeilao = leitor.nextInt();
		
		System.out.print("loteProdutos: ");
		int loteProdutos = leitor.nextInt();
		
		System.out.print("endereco: ");
		String endereco = leitor.next();
		
		System.out.print("dataOcorrencia: dd/MM/yyyy ");		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataOcorrencia = leitor.next();
		Date dataFormatada = formato.parse(dataOcorrencia); 
		
		System.out.print("status: ");
		String status = leitor.next();
		
		System.out.print("banco: ");		
		String banco = leitor.next();
		
		leiloes.add(new Leilao(idLeilao, loteProdutos, dataFormatada, endereco, status, banco));
		System.out.println("==========================================");
		System.out.println("====LEILÃO CADASTRADO COM SUCESSO!====");
		System.out.println("==========================================");
	}

}
