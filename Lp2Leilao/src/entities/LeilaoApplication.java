package entities;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.ModelW;

public class LeilaoApplication {
	
	List <Cliente>clientes = new ArrayList<Cliente>();
	List <Leilao>leiloes = new ArrayList<Leilao>();
	static Scanner leitor = new Scanner (System.in);
	 
	public static void main(String[] args) {
		ModelW model = new ModelW();
		
		
		
//		@SuppressWarnings("unused")
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int escolha;	    
	    //Menu *INTERFACE GUI*
		do {			
			System.out.println("===============================");
			System.out.println("===========LEIL�O==============");
			System.out.println("===============================");				
			System.out.println(
					    "1 - Cadastrar �suario"+
					  "\n2 - Cadastrar Banco"+
					  "\n3 - Cadastrar Im�vel"+
					  "\n4 - Cadastrar Ve�culo"+
					  "\n5 - Cadastrar Leil�o"+
					  "\n6 - Cadastrar Lote"+
					  "\n7 - Sair"					  
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
		        	System.out.println("op��o 7");	        	
		        break;
		        case 8 :
		        	System.out.println("op��o 8");
		        break;
	//	        case 9 :
	//	        	model.removerCliente();
	//	        break;
	//	        case 10 :
	//	        	model.imprimirImoveis();
	//	        break;
	//	        case 11 :
	//	        	model.removerImovel();
	//	        break;
	//	        case 12 :
	//	        	model.imprimirVeiculos();
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
	    }}while(escolha!= 0);
	}

}