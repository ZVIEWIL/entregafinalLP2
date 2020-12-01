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
 
	static Scanner scanString = new Scanner (System.in);
	static Scanner scanInt = new Scanner (System.in);
	static Scanner scanFloat = new Scanner (System.in);
	static Scanner scanDouble = new Scanner (System.in);
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 
	// funcionalidade 4a
	public void filtrarMinMax() throws ParseException {
		System.out.println("========PESQUISA POR VALOR MIN/MAX========");
		System.out.print("Informe o ID do Leilão que deseja buscar: ");
		int id_leilao = scanInt.nextInt();
		for (Leilao Leilao : leiloes) {
			if(id_leilao == Leilao.getIdLeilao()) {
				System.out.print("Informe o valor mínimo a ser pesquisado: R$ ");
				float valor_min = scanFloat.nextFloat();
				System.out.print("Informe o valor máximo a ser pesquisado: R$ ");
				float valor_max = scanFloat.nextFloat();
				for(Veiculo Veiculo : veiculos) {
					if(id_leilao==Veiculo.getIdLeilao() && valor_min < Veiculo.getLanceMinimo() && valor_max > Veiculo.getLanceMinimo())
						System.out.println("======================================" +
						           "\nId: " + Veiculo.getIdProduto()+ 
								   "\nLance Mínimo: " + Veiculo.getLanceMinimo()+
								   "\nDescrição: " + Veiculo.getDesc()+
								   "\nId Leilão: " + Veiculo.getIdLeilao()+
								   "\nAno: " + Veiculo.getAno()+
								   "\nModelo: " + Veiculo.getModelo()+
								   "\nCor: " + Veiculo.getCor()+
								   "\nTipo: " + Veiculo.getTipo()
								   );
				}
				for(Imovel Imovel : imoveis) {
					if(id_leilao==Imovel.getIdLeilao() && valor_min < Imovel.getLanceMinimo() && valor_max > Imovel.getLanceMinimo()) {
						System.out.println("======================================" +
						           "\nId: " + Imovel.getIdProduto()+ 
								   "\nLance Mínimo: " + Imovel.getLanceMinimo()+
								   "\nDescrição: " + Imovel.getDesc()+
								   "\nId Leilão: " + Imovel.getIdLeilao()+
								   "\nCep: " + Imovel.getCep()+
								   "\nNumero: " + Imovel.getNumero()+
								   "\nArea: " + Imovel.getArea()+
								   "\nTipo: " + Imovel.getTipo()
								   );
					}
				}
				System.out.println("======================================");
				return;
			}
		}
		System.out.print("Leilão não existe no sistema!\n");	
	};
	
	// funcionalidade 4b
	public void filtrarNomeProd() throws ParseException {
		System.out.print("Informe o termo que deseja buscar: ");
		String termo = scanString.nextLine();
		for(Veiculo Veiculo : veiculos) {
			if(Veiculo.getDesc().matches(".*"+termo+".*"))
				System.out.println("======================================" +
				           "\nId: " + Veiculo.getIdProduto()+ 
						   "\nLance Mínimo: " + Veiculo.getLanceMinimo()+
						   "\nDescrição: " + Veiculo.getDesc()+
						   "\nId Leilão: " + Veiculo.getIdLeilao()+
						   "\nAno: " + Veiculo.getAno()+
						   "\nModelo: " + Veiculo.getModelo()+
						   "\nCor: " + Veiculo.getCor()+
						   "\nTipo: " + Veiculo.getTipo()
						   );
		}
		for(Imovel Imovel : imoveis) {
			if(Imovel.getDesc().matches(".*"+termo+".*")) {
				System.out.println("======================================" +
				           "\nId: " + Imovel.getIdProduto()+ 
						   "\nLance Mínimo: " + Imovel.getLanceMinimo()+
						   "\nDescrição: " + Imovel.getDesc()+
						   "\nId Leilão: " + Imovel.getIdLeilao()+
						   "\nCep: " + Imovel.getCep()+
						   "\nNumero: " + Imovel.getNumero()+
						   "\nArea: " + Imovel.getArea()+
						   "\nTipo: " + Imovel.getTipo()
						   );
			}
		}
	}
	
	//funcionalidade 4c
	public void filtrarTipo() throws ParseException {
		System.out.println("======================================");
		System.out.print("Informe o tipo que deseja procurar"
		       + "\n1 - APARTAMENTO           "
		       + "\n2 - TERRENO               "
		       + "\n3 - CASA                  "
		       + "\n4 - EDIFICIO COMERCIAL    "
		       + "\n5 - CARRO                "
		       + "\n6 - MOTOCICLETA          "
		       + "\n7 - BICICLETA            "
		       + "\n8 - PATINETE             "
		       + "\n9 - SKATE                "
		       + "\nESCOLHA UMA OPÇÃO: ");			
				int escolha = scanInt.nextInt();	
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
			        case 5 :
			        	tipo = "CARRO";
			        break;		        
			        case 6 :
			        	tipo = "MOTOCICLETA";
			        break;
			        case 7 :
			        	tipo = "BICICLETA";
			        break;    
			        case 8 :
			        	tipo = "PATINETE";
			        break; 
			        case 9 :
			        	tipo = "SKATE";
			        break; 
			        default:
			        	System.out.print("\nOpção inválida.\n");
			        break;
				}
				for(Veiculo Veiculo : veiculos) {
					if(Veiculo.getTipo()== tipo)
						System.out.println("======================================" +
						           "\nId: " + Veiculo.getIdProduto()+ 
								   "\nLance Mínimo: " + Veiculo.getLanceMinimo()+
								   "\nDescrição: " + Veiculo.getDesc()+
								   "\nId Leilão: " + Veiculo.getIdLeilao()+
								   "\nAno: " + Veiculo.getAno()+
								   "\nModelo: " + Veiculo.getModelo()+
								   "\nCor: " + Veiculo.getCor()+
								   "\nTipo: " + Veiculo.getTipo()
								   );
				}
				for(Imovel Imovel : imoveis) {
					if(Imovel.getTipo()== tipo) {
						System.out.println("======================================" +
						           "\nId: " + Imovel.getIdProduto()+ 
								   "\nLance Mínimo: " + Imovel.getLanceMinimo()+
								   "\nDescrição: " + Imovel.getDesc()+
								   "\nId Leilão: " + Imovel.getIdLeilao()+
								   "\nCep: " + Imovel.getCep()+
								   "\nNumero: " + Imovel.getNumero()+
								   "\nArea: " + Imovel.getArea()+
								   "\nTipo: " + Imovel.getTipo()
								   );
					}
				}
		}
	
 
	// funcionalidade 5
	public void cadastrarLance() throws ParseException {		
		System.out.println("========CADASTRO DE LANCE========");
		int idLance = getIdLance();
		System.out.print("cpfPessoa: ");
		String cpfPessoa = scanString.nextLine();		
		System.out.print("idLeilao: ");
		int idLeilao = scanInt.nextInt();		
		System.out.print("idProduto: ");
		int idProduto = scanInt.nextInt();		
		System.out.print("valor: ");
		Double valor = scanDouble.nextDouble();		
		lances.add(new Lance(idLance, cpfPessoa, idLeilao, idProduto, valor));
		this.idLance = getIdLance()+1;
		System.out.println("========LANCE CADASTRADO COM SUCESSO!========\n");		
	}
 
	// funcionalidade 6
	public void filtrarLancePorProduto() {
		System.out.println("========PESQUISAR LANCES POR PRODUTO========");
		System.out.print("idProduto: ");
		int idProduto = scanInt.nextInt();
		for(Lance lance : lances) {
			if(idProduto == lance.getIdProduto()) {
				System.out.println("ID Lance: "+lance.getIdLance()+
								   "| CPF: "+lance.getCpfPessoa()+
								   "| Valor do lance: R$"+lance.getValor());
			}
		}
	}
 
	// funcionalidade 7
	public void checarStatusLeilao() {
		System.out.println("========CHECAR STATUS LEILÃO========");
		System.out.print("Informe o ID do Leilão que deseja buscar: ");
		int id_leilao = scanInt.nextInt();
		for (Leilao Leilao : leiloes) {
			if(id_leilao == Leilao.getIdLeilao()) {
				Date now_now = new Date();				
				String status = "";
		        if (now_now.after(Leilao.getDataFim())) {
		     	   status = "Finalizado";
		        } else if (now_now.after(Leilao.getDataInicio()) && now_now.before(Leilao.getDataFim())) {
		        	status = "Em andamento";
		        } else {
		        	status = "Aguardando Inicio";
		        }
		        System.out.println("================\n Status:" +status + "\n================\n");
		        return;
			}
		}
		System.out.println("================\nLeilão não encontrado\n================\n");
	}
//CLIENTE@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 
	public void cadastrarCliente() {
		System.out.println("==========CADASTRO DE CLIENTES=============");
		System.out.print("NOME CLIENTE: ");
		String nome = scanString.nextLine();
		System.out.print("ENDEREÇO CLIENTE: ");
		String endereco = scanString.nextLine();
		System.out.print("CPF CLIENTE: ");
		String cpf = scanString.nextLine();
		System.out.print("IDADE CLIENTE: ");
		int idade = scanInt.nextInt();				
		Cliente cliente = new Cliente(nome, idade, cpf, endereco);
		clientes.add(cliente);
		System.out.println("====CLIENTE CADASTRADO COM SUCESSO!=======");		
	}
 
	public void consultarClientes() {
		System.out.println("========LISTA DE CLIENTES========");
		for (Cliente Cliente : clientes) {
			System.out.println("======================================" +
							   "\nNome: " + Cliente.getNome() + 
							   "\nCPF: " + Cliente.getCpf() +
							   "\nIDADE: "+ Cliente.getIdade()+
							   "\nENDEREÇO: "+Cliente.getEndereco());
		}
		System.out.println("======================================");
	}
 
	public boolean deletarCliente() {
		System.out.println("========DELETAR CLIENTE========");
		System.out.print("CPF do cliente: ");
		String cpf = scanString.nextLine();
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
		System.out.println("========EDITAR CLIENTE========");
		System.out.print("CPF do cliente: ");
		String doc = scanString.nextLine();
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(doc)) {
				System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
					       + "\n1 - NOME"
					       + "\n2 - ENDEREÇO"
					       + "\n3 - CPF"
					       + "\n4 - IDADE"
					       + "\nESCOLHA UMA OPÇÃO: ");			
			int escolha = scanInt.nextInt();	
			String tipo = new String();
			switch(escolha){		    	    
	        case 1 :
	        	System.out.print("NOME CLIENTE: ");
	    		String nome = scanString.nextLine();
	    		cliente.setNome(nome);
	    		System.out.print("NOME ATUALIZADO ");
	        break;		        
	        case 2 :
	        	System.out.print("ENDEREÇO CLIENTE: ");
	    		String endereco = scanString.nextLine();
	    		cliente.setEndereco(endereco);
	    		System.out.print("ENDEREÇO ATUALIZADO ");
	        break;
	        case 3 :
	        	String cpf = scanString.nextLine();
	    		System.out.print("CPF CLIENTE: ");
	    		cliente.setEndereco(cpf);
	    		System.out.print("CPF ATUALIZADO ");
	        break;    
	        case 4 :
	        	System.out.print("IDADE CLIENTE: ");
	    		int idade = scanInt.nextInt();
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
		System.out.println("========CADASTRO DE FINANCEIRAS========");
		System.out.print("NOME FINANCEIRA: ");
		String nome = scanString.nextLine();
		System.out.print("CNPJ FINANCEIRA: ");
		String cnpj = scanString.nextLine();										
		Banco banco = new Banco(nome, cnpj);
		bancos.add(banco);
		System.out.println("========FINANCEIRA CADASTRADA COM SUCESSO!========");
	}
 
	public void consultarBancos() {
		System.out.println("========LISTA DE BANCOS========");
		for (Banco Banco : bancos) {
			System.out.println("======================================" +
					           "\nNome: " + Banco.getNomeFinanceira()+ 
							   "\nCNPJ: " + Banco.getCnpjFinanceira());
		}
		System.out.println("======================================");
	}
 
	  public void atualizarBanco() {
		  System.out.println("========EDITAR INSTITUIÇÃO FINANCEIRA========");
			System.out.print("CNPJ DO BANCO: ");
			String cnpj = scanString.nextLine();			
				for(Banco banco: bancos ) {
				if(cnpj.equals(banco.getCnpjFinanceira())) {
					System.out.println("Insira o nome da Financeira: ");
					String nomeFinanceira = scanString.nextLine();					
					banco.setNomeFinanceira(nomeFinanceira);					
					System.out.println("Insira o CNPJ: ");					
					String cnpjFinanceira = scanString.nextLine();
					banco.setCnpjFinanceira(cnpjFinanceira);					
					System.out.println("Financeira atualizada!");
				}else {
					System.out.println("Banco não encontrado");
				}
			}
		}
 
	  public boolean deletarBanco() {
			System.out.println("========DELETAR BANCO========");
			System.out.print("CNPJ: ");
			String cnpj = scanString.nextLine();
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
		System.out.println("========CADASTRO DE IMOVEIS========");		
		int idProduto = this.idProduto;
		System.out.print("LANCE MINIMO: ");
		float lanceMinimo = scanFloat.nextFloat();		
		System.out.print("DESCRIÇÃO: ");
		String desc = scanString.nextLine();		
		System.out.print("ID LEILÃO: ");
		int idLeilao = scanInt.nextInt();		
		System.out.print("CEP: ");
		String cep = scanString.nextLine();	
		System.out.print("NUMERO: ");
		int numero = scanInt.nextInt();		
		System.out.print("AREA: ");
		float area = scanFloat.nextFloat();		
		System.out.print("\nTIPO: DIGITE UM NUMERO:   "
				       + "\n1 - APARTAMENTO           "
				       + "\n2 - TERRENO               "
				       + "\n3 - CASA                  "
				       + "\n4 - EDIFICIO COMERCIAL    "
				       + "\nESCOLHA UMA OPÇÃO: ");			
		int escolha = scanInt.nextInt();	
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
		System.out.println("========IMOVEL CADASTRADO COM SUCESSO!========");
		setIdProduto(getIdProduto()+1); 
	}
 
	public boolean atualizarImovel() { 
		System.out.println("========EDITAR IMOVEL========");
		System.out.print("ID do produto: ");
		int idProduto = scanInt.nextInt();
		for (Imovel imovel : imoveis) {
			if (imovel.getIdProduto() == idProduto) {
				System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
							       + "\n1 - CEP"
							       + "\n2 - NUMERO"
							       + "\n3 - AREA"
							       + "\n4 - TIPO"
							      + "\nESCOLHA UMA OPÇÃO: ");			
				int escolha = scanInt.nextInt();	
				String tipo1 = new String();
				switch(escolha){		    	    
			    case 1 :
			      	System.out.print("CEP DO IMOVEL: ");
			  		String cep = scanString.nextLine();
			  		imovel.setCep(cep);
			  		System.out.print("CEP ATUALIZADO ");
			    break;		        
			    case 2 :
			      	System.out.print("NUMERO DO IMÓVEL: ");
			  		int numero = scanInt.nextInt();
			  		imovel.setNumero(numero);
			  		System.out.print("NUMERO ATUALIZADO ");
			    break;
			    case 3 :
			      	float area = scanFloat.nextFloat();
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
			    int escolha2 = scanInt.nextInt();	
			    String tipo = new String();
			    switch(escolha2){		    	    
			    case 1 :
			    tipo = "APARTAMENTO";
			    System.out.println("========IMOVEL ATUALIZADO COM SUCESSO!========");
			    break;		        
			    case 2 :
			    tipo = "TERRENO";
			    System.out.println("========IMOVEL ATUALIZADO COM SUCESSO!========");
			    break;
			    case 3 :
			    tipo = "CASA";
			    System.out.println("========IMOVEL ATUALIZADO COM SUCESSO!========");
			    break;    
			    case 4 :
			    tipo = "EDIFICIO COMERCIAL";
			    System.out.println("========IMOVEL ATUALIZADO COM SUCESSO!========");
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
		System.out.println("========DELETAR IMOVEL========");
		System.out.print("Id Imovel: ");
		int idProduto = scanInt.nextInt();
		for (Imovel imovel : imoveis) {
			if (idProduto==imovel.getIdProduto()) {	
				imoveis.remove(imovel);
				System.out.println("========IMOVEL DELETADO========\n");
				return true;						
			}		
		}
		System.out.print("IMOVEL NÃO ENCONTRADO\n");
		return false;
	}	
 
	public void consultarImoveis() {
		System.out.println("========LISTA DE IMÓVEIS========");
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
		System.out.println("======================================");
	}
 
//VEICULO@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 
	public void cadastrarVeiculo() {		
		System.out.println("========CADASTRO DE VEÍCULOS========");				
		int id = idProduto;
		System.out.print("LANCE MINIMO: ");
		float lanceMinimo = scanFloat.nextFloat();		
		System.out.print("DESCRIÇÃO: ");
		String desc = scanString.nextLine();		
		System.out.print("ID LEILÃO: ");
		int idLeilao = scanInt.nextInt();		
		System.out.print("ANO: ");
		int ano = scanInt.nextInt();		
		System.out.print("MODELO: ");
		String modelo = scanString.nextLine();		
		System.out.print("COR: ");
		String cor = scanString.nextLine();		
		System.out.print("\nTIPO: DIGITE UM NUMERO:     "
				       + "\n1 - CARRO                "
				       + "\n2 - MOTOCICLETA          "
				       + "\n3 - BICICLETA            "
				       + "\n4 - PATINETE             "
				       + "\n5 - SKATE                "
				       + "\nESCOLHA UMA OPÇÃO: ");			
		int escolha = scanInt.nextInt();	
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
		System.out.println("========VEÍCULO CADASTRADO COM SUCESSO!========");		
		idProduto += 1;
	}
 
	public void consultarVeiculos() {
		System.out.println("========LISTA DE VEÍCULOS========");
		for (Veiculo Veiculo : veiculos) {
			System.out.println("======================================" +
					           "\nId: " + Veiculo.getIdProduto()+ 
							   "\nLance Mínimo: " + Veiculo.getLanceMinimo()+
							   "\nDescrição: " + Veiculo.getDesc()+
							   "\nId Leilão: " + Veiculo.getIdLeilao()+
							   "\nAno: " + Veiculo.getAno()+
							   "\nModelo: " + Veiculo.getModelo()+
							   "\nCor: " + Veiculo.getCor()+
							   "\nTipo: " + Veiculo.getTipo());
		}
		System.out.println("======================================");
	}	
 
	  public boolean atualizarVeiculo() {
		  System.out.println("========EDITAR VEÍCULO========");
			System.out.print("Id do Veiculo: ");
			int idProduto = scanInt.nextInt();
			for (Veiculo veiculo : veiculos) {
				if (veiculo.getIdProduto()==idProduto) {
					System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
						       + "\n1 - ANO"
						       + "\n2 - MODELO"
						       + "\n3 - COR"
						       + "\n4 - TIPO"
						       + "\nESCOLHA UMA OPÇÃO: ");			
				int escolha = scanInt.nextInt();	
				String tipo1 = new String();
				switch(escolha){		    	    
		      case 1 :
		      	System.out.print("ANO DO VEÍCULO: ");
		  		int ano = scanInt.nextInt();
		  		veiculo.setAno(ano);
		  		System.out.print("ANO ATUALIZADO ");
		      break;		        
		      case 2 :
		      	System.out.print("MODELO DO VEÍCULO: ");
		  		String modelo = scanString.nextLine();
		  		veiculo.setModelo(modelo);
		  		System.out.print("MODELO ATUALIZADO ");
		      break;
		      case 3 :
		      	String cor = scanString.nextLine();
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
		    	int escolha2 = scanInt.nextInt();	
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
			System.out.println("========DELETAR VEICULO========");
			System.out.print("Id Veiculo: ");
			int idProduto = scanInt.nextInt();
			for (Veiculo veiculo : veiculos) {
				if (idProduto==veiculo.getIdProduto()) {	
					veiculos.remove(veiculo);
					System.out.println("========VEICULO DELETADO========\n");
					return true;						
				}		
			}
			System.out.print("VEICULO NÃO ENCONTRADO\n");
			return false;
		}
 
 
 
//LEILAO@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 
	public void cadastrarLeilao() throws ParseException {		
		System.out.println("========CADASTRO DE LEILÕES========");	
		int idLeilao = this.idLeilao;	
		setIdLeilao(getIdLeilao()+1); 
		System.out.print("Endereço: ");
		String endereco = scanString.nextLine();
		System.out.print("Data Inicio (formato dd/MM/yyyy HH:mm:ss): ");
		String data_inicio = scanString.nextLine();
		System.out.print("Data Fim (formato dd/MM/yyyy HH:mm:ss): ");
		String data_fim = scanString.nextLine();
 
		//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 
		Date data_inicio_Formatada = formato.parse(data_inicio); 
		Date data_fim_Formatada = formato.parse(data_fim); 
 
		System.out.print("Banco: ");		
		String banco = scanString.nextLine();
 
		Leilao leilao = new Leilao(idLeilao, data_inicio_Formatada, data_fim_Formatada, endereco, banco);
		leiloes.add(leilao);		
		System.out.println("========LEILÃO CADASTRADO COM SUCESSO!========");		
	}
 
	public void consultarLeiloes() {
		System.out.println("========LISTA DE LEILÕES========");
		for (Leilao Leilao : leiloes) {
			String data_inicio = formato.format(Leilao.getDataInicio()); 
			String data_fim = formato.format(Leilao.getDataFim()); 
			Date now_now = new Date();
 
			String status = "";
            if (now_now.after(Leilao.getDataFim())) {
         	   status = "Finalizado";
            } else if (now_now.after(Leilao.getDataInicio()) && now_now.before(Leilao.getDataFim())) {
            	status = "Em andamento";
            } else {
            	status = "Aguardando Inicio";
            }
 
			System.out.println("======================================" +
			                   "\nId Leilão: " + Leilao.getIdLeilao() + 
			                   "\nData Inicio: " + data_inicio + 
			                   "\nData Fim: " + data_fim + 
			                   "\nBanco: " + Leilao.getEndereco() +
			                   "\nStatus: " + status
			                   );
		}
		System.out.println("======================================");
	}
 
	public boolean atualizarLeilao() throws ParseException {
			System.out.println("========EDITAR LEILÃO========");
			System.out.print("ID do Leilão: ");
			int idLeilao = scanInt.nextInt();
			for (Leilao leilao : leiloes) {
				if (leilao.getIdLeilao() == idLeilao) {
					System.out.print("\nESCOLHA O CAMPO A SER ALTERADO:"
						       + "\n1 - DATA INICIO"
						       + "\n2 - ENDEREÇO"
						       + "\n3 - BANCO"
						       + "\n4 - DATA FIM"
						       + "\nESCOLHA UMA OPÇÃO: ");			
				int escolha = scanInt.nextInt();	
				String tipo = new String();
				switch(escolha){		    	    
		        case 1 :
		        	System.out.print("DATA: dd/MM/yyyy ");		
		    		//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		    		String dataOcorrencia = scanString.nextLine();
		    		Date dataFormatada = formato.parse(dataOcorrencia);
		    		leilao.setDataInicio(dataFormatada);
		    		System.out.print("DATA ATUALIZADA ");
		        break;		        
		        case 2 :
		        	System.out.print("ENDEREÇO: ");
		    		String endereco = scanString.nextLine();
		    		leilao.setEndereco(endereco);
		    		System.out.print("ENDEREÇO DO LEILÃO ATUALIZADO ");
		        break;
		        /*case 3 :
		        	String status = leitor.nextLine();
		    		System.out.print("STATUS: ");
		    		leilao.setStatus(status);
		    		System.out.print("STATUS ATUALIZADO ");
		        break;
		        */    
		        case 3 :
		        	System.out.print("BANCO: ");
		    		String banco = scanString.nextLine();
		    		leilao.setBanco(banco);
		    		System.out.print("BANCO ATUALIZADO ");
		        break;
		        case 4 :
		        	System.out.print("DATA: dd/MM/yyyy ");		
		    		String dataOcorrencia2 = scanString.nextLine();
		    		Date dataFormatada2 = formato.parse(dataOcorrencia2);
		    		leilao.setDataFim(dataFormatada2);
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
		System.out.println("========DELETAR VEICULO========");
		System.out.print("Id Veiculo: ");
		int IdLeilao = scanInt.nextInt();
		for (Leilao leilao : leiloes) {
			if (idProduto==leilao.getIdLeilao()) {	
				leiloes.remove(leilao);
				System.out.println("=========VEICULO DELETADO========\n");
				return true;						
			}		
		}
		System.out.print("VEICULO NÃO ENCONTRADO\n");
		return false;
	}
}
 
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@