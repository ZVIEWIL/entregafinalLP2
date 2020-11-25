package entities;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.ModelW;
import model.ModelD;

public class LeilaoApplication {
	
	List <Cliente>clientes = new ArrayList<Cliente>();
	List <Leilao>leiloes = new ArrayList<Leilao>();
	static Scanner leitor = new Scanner (System.in);
	 
	public static void main(String[] args) {
		ModelW model = new ModelW();
		ModelD model2 = new ModelD();
		
		
		
//		@SuppressWarnings("unused")
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int escolha;	    
	    //Menu *INTERFACE GUI*
		do {			
			System.out.println("===========  LEIL�O   ===========");
			System.out.println("\n===== CADASTROS =====");
			System.out.println(
<<<<<<< HEAD
					    "1 - Cadastrar �suario"+
					  "\n2 - Cadastrar Banco"+
					  "\n3 - Cadastrar Im�vel"+
					  "\n4 - Cadastrar Ve�culo"+
					  "\n5 - Cadastrar Leil�o"+
					  "\n6 - Cadastrar Lote"+
					  "\n7 - Sair"					  
=======
					    "01 - Cadastrar �suario"+
					  "\n02 - Cadastrar Banco"+
					  "\n03 - Cadastrar Im�vel"+
					  "\n04 - Cadastrar Ve�culo"+
					  "\n05 - Cadastrar Leil�o"+
					  "\n06 - Cadastrar Lote\n"+
					  "\n===== CONSULTAS ====="+
					  "\n07 - Consultar �suarios"+
					  "\n08 - Consultar Bancos"+
					  "\n09 - Consultar Im�veis"+
					  "\n10 - Consultar Ve�culos"+
					  "\n11 - Consultar Leil�es"+
					  
					  "\n================================="+
					  "\n99 - Sair"
					  
>>>>>>> ae5c812065d1706bd25eb12d2b951fa5cc25e2e7
	//	            + "\n7 -  Imprimir Clientes"
	//	            + "\n9 -  Remover Clientes"
	//	            + "\n10 - Imprimir Imoveis"
	//	            + "\n11 - Remover Imoveis"
	//	            + "\n12 - Imprimir Veiculos"
	//	            + "\n13 - Remover Veiculos"
	//	            + "\n14 - Imprimir Institui��o Financeira"
	//	            + "\n15 - Remover Institui��o Financeira"
	//	            + "\n16 - Imprimir Lote"
	//	            + "\n17 - Remover Lote"
	//	            + "\n18 - Imprimir Leil�o"
	//	            + "\n19 - Remover Leil�o"
	//	            + "\n20 - Dar Lance"
	//	            + "\n21 - Imprimir Lances por Cliente"
	//	            + "\n22 - Imprimir Lote espec�fico"
	//	            + "\n23 - Atualizar dados do Cliente"
	//	            + "\n24 - Atualizar dados da Institui��o Financeira"
	//	            + "\n25 - Atualizar dados de Im�vel"
	//	            + "\n26 - Atualizar dados de Ve�culo"	            
		            );
			System.out.print("\nESCOLHA UMA OP��O: ");       
			escolha = leitor.nextInt();
//			for (int i = 0; i < 40; ++i) System.out.println ();
			
		    switch(escolha){		    	    
		        case 1 :
		        	model.cadastrarCliente();
		        break;		        
		        case 2 :
		        	model.cadastrarBanco();
		        break;
		        case 3 :
		        	model.cadastrarImovel();
		        break;    
		        case 4 :
		        	System.out.println("op��o 4");
		        break;
		        case 5 :
		        	System.out.println("op��o 5");
		        break;
		        case 6 :
		        	System.out.println("op��o 6");
		        break;
		        case 7 :
		        	model2.consultarClientes();	        	
		        break;
		        case 8 :
		        	model2.consultarBancos();
		        break;
		        case 9 :
		        	model2.consultarImoveis();
		        break;
		        case 10 :
		        	model2.consultarVeiculos();
		        break;
		        case 11 :
		        	model2.consultarLeiloes();
		        break;
	//	        case 12 :
	//	        	model2.consultarClientes();
	//	        break;
	//	        case 13 :
	//	        	model.removerVeiculo();
	//	        break;
	//	        case 14 :
	//	        	model.imprimirInstFin();
	//	        break;
	//	        case 15 :
	//	        	model.removerInstFin();
	//	        break;
	//	        case 16 :
	//	        	model.imprimirLotes();
	//	        break;
	//	        case 17 :
	//	        	model.removerLote();
	//	        break;
	//	        case 18 :
	//	        	model.imprimirLeiloes();
	//	        break;
	//	        case 19 :
	//	        	model.removerLeilao();
	//	        break;
	//	        case 20 :
	//	        	model.darLances();
	//	        break;
	//	        case 21 :
	//	        	model.imprimirLances();
	//	        break;
	//	        case 22 :
	//	        	
	//	        break;
	//	        case 23:
	//	        	model.alterarCliente();
	//		        break;
	//	        case 24:
	//	        	model.alterarInstFin();
	//		        break;
	//	        case 25:
	//	        	model.alterarImovel();
	//		        break;
	//	        case 26:
	//	        	model.alterarVeiculo();
	//		        break;
		        default:
		        
		        break;
	    }}while(escolha!= 99);
	}

}