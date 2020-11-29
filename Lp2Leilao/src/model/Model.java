package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Banco;
import entities.Cliente;
import entities.Imovel;
import entities.Lance;
import entities.Leilao;
import entities.TipoImovel;
import entities.Veiculo;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Model {
//INSTANCIANDO AS CLASSES (LISTAS) 
	public static List<Cliente> clientes;
	public static List<Imovel> imoveis;
	public static List<Veiculo> veiculos;
	public static List<Banco> bancos;
	public List<Leilao> leiloes;
	public List<Lance> lances;	
	int idProduto;
	int idLance;
	int idLeilao;		
	
	public Model(){
		clientes = new ArrayList<>();
		imoveis = new ArrayList<>();
		bancos = new ArrayList<>();
		leiloes = new ArrayList<>();
		veiculos = new ArrayList<>();
		lances = new ArrayList<>();
		setIdProduto(1);
		setIdLance(1);
		setIdLeilao(1);
	}	
	
	static Scanner leitor = new Scanner (System.in);
	
	public void cadastrarLance() throws ParseException {		
		System.out.println("======CADASTRO DE LANCE===================");
		int idLance = getIdLance();
		System.out.print("cpfPessoa: ");
		String cpfPessoa = leitor.next();		
		System.out.print("idLeilao: ");
		int idLeilao = leitor.nextInt();		
		System.out.print("idProduto: ");
		int idProduto = leitor.nextInt();		
		System.out.print("valor: ");
		Double valor = leitor.nextDouble();		
		Lance lance = new Lance(idLance, cpfPessoa, idLeilao, idProduto, valor);
		this.idLance = getIdLance()+1;
		System.out.println("====LANCE CADASTRADO COM SUCESSO!========");		
	}
	
	public void filtrarLancePorProduto() {
		System.out.println("======PESQUISAR LANCES/PRODUTO===================");
				
		System.out.print("idProduto: ");
		int idProduto = leitor.nextInt();
		for(Lance lance : lances) {
			if(idProduto == lance.getIdProduto()) {
				System.out.println("ID: "+lance.getIdLance()+
								   " CPF: "+lance.getCpfPessoa()+
								   " LANCE R$"+lance.getValor());
			}
		}
	}

//CLIENTES@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	public void cadastrarCliente() {
		System.out.println("==========CADASTRO DE CLIENTES=============");
		System.out.print("NOME CLIENTE: ");
		String nome = leitor.next();
		System.out.print("ENDEREÇO CLIENTE: ");
		String endereco = leitor.next();
		System.out.print("CPF CLIENTE: ");
		String cpf = leitor.next();
		System.out.print("IDADE CLIENTE: ");
		int idade = leitor.nextInt();				
		Cliente cliente = new Cliente(nome, idade, cpf, endereco);
		clientes.add(cliente);
		System.out.println("====CLIENTE CADASTRADO COM SUCESSO!=======");		
	}
	
	public void consultarClientes() {
		for (Cliente Cliente : clientes) {
			System.out.println("======================================" +
							   "\nNome: " + Cliente.getNome() + 
							   "\nCPF: " + Cliente.getCpf() +
							   "\nIDADE: "+ Cliente.getIdade()+
							   "\nENDEREÇO: "+Cliente.getEndereco());
		}
	}
	
	public boolean deletarCliente() {
		System.out.println("==========DELETAR CLIENTE=================");
		System.out.print("CPF do cliente: ");
		String cpf = leitor.next();
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {	
				clientes.remove(cliente);
				return true;
			}		
		}
		System.out.print("CLIENTE NÃO ENCONTRADO\n");
		return false;
	}
	
	public boolean atualizarCliente() {
		System.out.println("==========EDITAR CLIENTE=================");
		System.out.print("CPF do cliente: ");
		String doc = leitor.next();
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(doc)) {
				System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
					       + "\n1 - NOME"
					       + "\n2 - ENDEREÇO"
					       + "\n3 - CPF"
					       + "\n4 - IDADE"
					       + "\nESCOLHA UMA OPÇÃO: ");			
			int escolha = leitor.nextInt();	
			String tipo = new String();
			switch(escolha){		    	    
	        case 1 :
	        	System.out.print("NOME CLIENTE: ");
	    		String nome = leitor.next();
	    		cliente.setNome(nome);
	    		System.out.print("NOME ATUALIZADO ");
	        break;		        
	        case 2 :
	        	System.out.print("ENDEREÇO CLIENTE: ");
	    		String endereco = leitor.next();
	    		cliente.setEndereco(endereco);
	    		System.out.print("ENDEREÇO ATUALIZADO ");
	        break;
	        case 3 :
	        	String cpf = leitor.next();
	    		System.out.print("CPF CLIENTE: ");
	    		cliente.setEndereco(cpf);
	    		System.out.print("CPF ATUALIZADO ");
	        break;    
	        case 4 :
	        	System.out.print("IDADE CLIENTE: ");
	    		int idade = leitor.nextInt();
	    		cliente.setIdade(idade);
	    		System.out.print("IDADE ATUALIZADA ");
	        break; 
			}
				return true;
			}		
		}
		System.out.print("CLIENTE NÃO ENCONTRADO\n");
		return false;
	}

//BANCO@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	public void cadastrarBanco() {
		System.out.println("======CADASTRO DE FINANCEIRAS=============");
		System.out.print("NOME FINANCEIRA: ");
		String nome = leitor.next();
		System.out.print("CNPJ FINANCEIRA: ");
		String cnpj = leitor.next();										
		Banco banco = new Banco(nome, cnpj);
		bancos.add(banco);
		System.out.println("====FINANCEIRA CADASTRADA COM SUCESSO!====");
	}
	
	public void consultarBancos() {
		for (Banco Banco : bancos) {
			System.out.println("======================================" +
					           "\nNome: " + Banco.getNomeFinanceira()+ 
							   "\nCNPJ: " + Banco.getCnpjFinanceira());
		}
	}
	
	  public void atualizarBanco() {
		  System.out.println("==========EDITAR INSTITUIÇÃO FINANCEIRA=================");
			System.out.print("CNPJ DO BANCO: ");
			String cnpj = leitor.nextLine();			
				for(Banco banco: bancos ) {
				if(cnpj.equals(banco.getCnpjFinanceira())) {
					System.out.println("Insira o nome da Financeira: ");
					String nomeFinanceira = leitor.nextLine();					
					banco.setNomeFinanceira(nomeFinanceira);					
					System.out.println("Insira o CNPJ: ");					
					String cnpjFinanceira = leitor.nextLine();
					banco.setCnpjFinanceira(cnpjFinanceira);					
					System.out.println("Financeira atualizada!");
				}else {
					System.out.println("Banco não encontrado");
				}
			}
		}
	  
	  public boolean deletarBanco() {
			System.out.println("==========DELETAR BANCO=================");
			System.out.print("CNPJ: ");
			String cnpj = leitor.next();
			for (Banco banco : bancos) {
				if (banco.getCnpjFinanceira().equals(cnpj)) {	
					bancos.remove(banco);
					return true;
				}		
			}
			System.out.print("BANCO NÃO ENCONTRADO\n");
			return false;
		}
	
//IMOVEL@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	public void cadastrarImovel() {
		System.out.println("============CADASTRO DE IMOVEIS===========");		
		int idProduto = this.idProduto;
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
		System.out.print("\nTIPO: DIGITE UM NUMERO:   "
				       + "\n1 - APARTAMENTO           "
				       + "\n2 - TERRENO               "
				       + "\n3 - CASA                  "
				       + "\n4 - EDIFICIO COMERCIAL    "
				       + "\n5 - consultarClientes     "
				       + "\n6 - consultarBancos       "
				       + "\n7 - consultarImoveis      "
				       + "\n8 - consultarVeiculos     "
				       + "\n9 - consultarLeiloes      "
				       + "\nESCOLHA UMA OPÇÃO: ");			
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
		Imovel imovel = new Imovel(idProduto, lanceMinimo, desc, idLeilao, cep, numero, area, tipo);
		imoveis.add(imovel);
		System.out.println("====IMOVEL CADASTRADO COM SUCESSO!========");
		setIdProduto(getIdProduto()+1); 
	}
		
	public boolean atualizarImovel() { 
		System.out.println("==========EDITAR IMOVEL=================");
		System.out.print("ID do produto: ");
		int idProduto = leitor.nextInt();
		for (Imovel imovel : imoveis) {
			if (imovel.getIdProduto() == idProduto) {
				System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
							       + "\n1 - CEP"
							       + "\n2 - NUMERO"
							       + "\n3 - AREA"
							       + "\n4 - TIPO"
							      + "\nESCOLHA UMA OPÇÃO: ");			
				int escolha = leitor.nextInt();	
				String tipo1 = new String();
				switch(escolha){		    	    
			    case 1 :
			      	System.out.print("CEP DO IMOVEL: ");
			  		String cep = leitor.next();
			  		imovel.setCep(cep);
			  		System.out.print("CEP ATUALIZADO ");
			    break;		        
			    case 2 :
			      	System.out.print("NUMERO DO IMÓVEL: ");
			  		int numero = leitor.nextInt();
			  		imovel.setNumero(numero);
			  		System.out.print("NUMERO ATUALIZADO ");
			    break;
			    case 3 :
			      	float area = leitor.nextFloat();
			  		System.out.print("AREA DO IMOVEL: ");
			  		imovel.setArea(area);
			  		System.out.print("AREA ATUALIZADA ");
			    break;    
			    case 4 :
			    	System.out.print("TIPO: DIGITE UM NUMERO:\n"
			    		       + "1 - APARTAMENTO\n"
			    		       + "2 - TERRENO\n"
			    		       + "3 - CASA\n"
			    		       + "4 - EDIFICIO COMERCIAL\n"
			    		       + "ESCOLHA UMA OPÇÃO: ");			
			    int escolha2 = leitor.nextInt();	
			    String tipo = new String();
			    switch(escolha2){		    	    
			    case 1 :
			    tipo = "APARTAMENTO";
			    System.out.println("====IMOVEL ATUALIZADO COM SUCESSO!========");
			    break;		        
			    case 2 :
			    tipo = "TERRENO";
			    System.out.println("====IMOVEL ATUALIZADO COM SUCESSO!========");
			    break;
			    case 3 :
			    tipo = "CASA";
			    System.out.println("====IMOVEL ATUALIZADO COM SUCESSO!========");
			    break;    
			    case 4 :
			    tipo = "EDIFICIO COMERCIAL";
			    System.out.println("====IMOVEL ATUALIZADO COM SUCESSO!========");
			    break; 
			    	}			    	
						return true;
				}					
			}		
		}
			System.out.print("IMOVEL NÃO ENCONTRADO\n");
			return false;
	}
		 
		 
	public boolean deletarImovel() {
		System.out.println("==========DELETAR IMOVEL=================");
		System.out.print("Id Imovel: ");
		int idProduto = leitor.nextInt();
		for (Imovel imovel : imoveis) {
			if (idProduto==imovel.getIdProduto()) {	
				imoveis.remove(imovel);
				System.out.println("==========IMOVEL DELETADO===============\n");
				return true;						
			}		
		}
		System.out.print("IMOVEL NÃO ENCONTRADO\n");
		return false;
	}	
	
	public void consultarImoveis() {
		for (Imovel Imovel : imoveis) {
			System.out.println("======================================" +
					           "\nId: " + Imovel.getIdProduto()+ 
							   "\nLance Mínimo: " + Imovel.getLanceMinimo()+
							   "\nDescrição: " + Imovel.getDesc()+
							   "\nId Leilão: " + Imovel.getIdLeilao()+
							   "\nCep: " + Imovel.getCep()+
							   "\nNumero: " + Imovel.getNumero()+
							   "\nArea: " + Imovel.getArea()+
							   "\nTipo: " + Imovel.getTipo());
		}
	}
	
//VEICULO@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	public void cadastrarVeiculo() {		
		System.out.println("===========CADASTRO DE VEÍCULOS===========");				
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
		System.out.print("\nTIPO: DIGITE UM NUMERO:     "
				       + "\n1 - CARRO                "
				       + "\n2 - MOTOCICLETA          "
				       + "\n3 - BICICLETA            "
				       + "\n4 - PATINETE             "
				       + "\n5 - SKATE                "
				       + "\nESCOLHA UMA OPÇÃO: ");			
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
		veiculos.add(veiculo);		
		System.out.println("====VEÍCULO CADASTRADO COM SUCESSO!========");		
		idProduto += 1;
	}
	
	public void consultarVeiculos() {
		for (Veiculo Veiculo : veiculos) {
			System.out.println("======================================" +
					           "\nId: " + Veiculo.getIdProduto()+ 
							   "\nLance Mínimo: " + Veiculo.getLanceMinimo()+
							   "\nDescrição: " + Veiculo.getDesc()+
							   "\nId Leilão: " + Veiculo.getIdLeilao()+
							   "\nAno: " + Veiculo.getAno()+
							   "\nModelo: " + Veiculo.getModelo()+
							   "\nCor: " + Veiculo.getTipo()+
							   "\nTipo: " + Veiculo.getTipo());
		}
	}	
	
	  public boolean atualizarVeiculo() {
		  System.out.println("==========EDITAR VEÍCULO=================");
			System.out.print("Id do Veiculo: ");
			int idProduto = leitor.nextInt();
			for (Veiculo veiculo : veiculos) {
				if (veiculo.getIdProduto()==idProduto) {
					System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
						       + "\n1 - ANO"
						       + "\n2 - MODELO"
						       + "\n3 - COR"
						       + "\n4 - TIPO"
						       + "\nESCOLHA UMA OPÇÃO: ");			
				int escolha = leitor.nextInt();	
				String tipo1 = new String();
				switch(escolha){		    	    
		      case 1 :
		      	System.out.print("ANO DO VEÍCULO: ");
		  		int ano = leitor.nextInt();
		  		veiculo.setAno(ano);
		  		System.out.print("ANO ATUALIZADO ");
		      break;		        
		      case 2 :
		      	System.out.print("MODELO DO VEÍCULO: ");
		  		String modelo = leitor.next();
		  		veiculo.setModelo(modelo);
		  		System.out.print("MODELO ATUALIZADO ");
		      break;
		      case 3 :
		      	String cor = leitor.next();
		  		System.out.print("COR DO VEÍCULO: ");
		  		veiculo.setCor(cor);
		  		System.out.print("COR ATUALIZADA ");
		      break;    
		      case 4 :
		    	  System.out.print("TIPO: DIGITE UM NUMERO:\n"
		    			  + "1 - CARRO\n"
					       + "2 - MOTOCICLETA\n"
					       + "3 - BICICLETA\n"
					       + "4 - PATINETE\n"
					       + "5 - SKATE\n"
					       + "ESCOLHA UMA OPÇÃO: ");				
		    	int escolha2 = leitor.nextInt();	
		    	String tipo = new String();
		    	switch(escolha2){		    	    
		    	case 1 :
		    	tipo = "CARRO";
		    	System.out.println("====VEÍCULO ATUALIZADO COM SUCESSO!========");
		    	break;		        
		    	case 2 :
		    	tipo = "MOTOCICLETA";
		    	System.out.println("====VEÍCULO ATUALIZADO COM SUCESSO!========");
		    	break;
		    	case 3 :
		    	tipo = "BICICLETA";
		    	System.out.println("====VEÍCULO ATUALIZADO COM SUCESSO!========");
		    	break;    
		    	case 4 :
		    	tipo = "PATINETE";
		    	System.out.println("====PATINETE ATUALIZADO COM SUCESSO!========");
		    	break; 
		    	}
		        case 5 :
			    	tipo = "SKATE";
			    	System.out.println("====VEICULO ATUALIZADO COM SUCESSO!========");
			    	break; 
			    	}
					return true;
				}	
				
				}		
			
			System.out.print("VEÍCULO NÃO ENCONTRADO\n");
			return false;
		}
	  public boolean deletarVeiculo() {
			System.out.println("==========DELETAR VEICULO=================");
			System.out.print("Id Veiculo: ");
			int idProduto = leitor.nextInt();
			for (Veiculo veiculo : veiculos) {
				if (idProduto==veiculo.getIdProduto()) {	
					veiculos.remove(veiculo);
					System.out.println("==========VEICULO DELETADO===============\n");
					return true;						
				}		
			}
			System.out.print("VEICULO NÃO ENCONTRADO\n");
			return false;
		}
	  
	
	
//LEILAO@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	public void cadastrarLeilao() throws ParseException {		
		System.out.println("======CADASTRO DE LEILÕES==================");	
		
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
		
		Leilao leilao = new Leilao(idLeilao, loteProdutos, dataFormatada, endereco, status, banco);
		leiloes.add(leilao);		
		System.out.println("====LEILÃO CADASTRADO COM SUCESSO!========");		
	}
	
	public void consultarLeiloes() {
		for (Leilao Leilao : leiloes) {
			System.out.println("=============consultarLeiloes==============" +
			                   "\nId Leilão: " + Leilao.getIdLeilao() + 
			                   "\nBanco: " + Leilao.getLoteProdutos() + 
			                   "\nBanco: " + Leilao.getDataOcorrencia() + 
			                   "\nBanco: " + Leilao.getEndereco() + 
					           "\nEndereço: " + Leilao.getEndereco());
		}
	}
	
	public boolean atualizarLeilao() throws ParseException {
			System.out.println("==========EDITAR LEILÃO=================");
			System.out.print("ID do Leilão: ");
			int idLeilao = leitor.nextInt();
			for (Leilao leilao : leiloes) {
				if (leilao.getIdLeilao() == idLeilao) {
					System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
						       + "\n1 - LOTE PRODUTO"
						       + "\n2 - ENDEREÇO"
						       + "\n3 - STATUS"
						       + "\n4 - BANCO"
						       + "\n5 - DATA"
						       + "\nESCOLHA UMA OPÇÃO: ");			
				int escolha = leitor.nextInt();	
				String tipo = new String();
				switch(escolha){		    	    
		        case 1 :
		        	System.out.print("LOTE PRODUTO: ");
		    		int loteProdutos = leitor.nextInt();
		    		leilao.setLoteProdutos(loteProdutos);
		    		System.out.print("LOTE DE PRODUTOS ATUALIZADO ");
		        break;		        
		        case 2 :
		        	System.out.print("ENDEREÇO: ");
		    		String endereco = leitor.next();
		    		leilao.setEndereco(endereco);
		    		System.out.print("ENDEREÇO DO LEILÃO ATUALIZADO ");
		        break;
		        case 3 :
		        	String status = leitor.next();
		    		System.out.print("STATUS: ");
		    		leilao.setStatus(status);
		    		System.out.print("STATUS ATUALIZADO ");
		        break;    
		        case 4 :
		        	System.out.print("BANCO: ");
		    		String banco = leitor.next();
		    		leilao.setBanco(banco);
		    		System.out.print("BANCO ATUALIZADO ");
		        break;
		        case 5 :
		        	System.out.print("DATA: dd/MM/yyyy ");		
		    		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		    		String dataOcorrencia = leitor.next();
		    		Date dataFormatada = formato.parse(dataOcorrencia);
		    		leilao.setDataOcorrencia(dataFormatada);
		    		System.out.print("DATA ATUALIZADA ");
		        break;
				}
					return true;
				}		
			}
			System.out.print("LEILÃO NÃO ENCONTRADO\n");
			return false;
		}
	
	public boolean deletarLeilao() {
		System.out.println("==========DELETAR VEICULO=================");
		System.out.print("Id Veiculo: ");
		int IdLeilao = leitor.nextInt();
		for (Leilao leilao : leiloes) {
			if (idProduto==leilao.getIdLeilao()) {	
				leiloes.remove(leilao);
				System.out.println("==========VEICULO DELETADO===============\n");
				return true;						
			}		
		}
		System.out.print("VEICULO NÃO ENCONTRADO\n");
		return false;
	}
}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

