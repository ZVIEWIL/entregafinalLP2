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
			System.out.println("===========  LEILÃO   ===========");
			System.out.println("\n===== CADASTROS =====");
			System.out.println(
					    "01 - Cadastrar Úsuario"+
					  "\n02 - Cadastrar Banco"+
					  "\n03 - Cadastrar Imóvel"+
					  "\n04 - Cadastrar Veículo"+
					  "\n05 - Cadastrar Leilão"+
					  "\n06 - Cadastrar Lote\n"+
					  "\n===== CONSULTAS ====="+
					  "\n07 - Consultar Úsuarios"+
					  "\n08 - Consultar Bancos"+
					  "\n09 - Consultar Imóveis"+
					  "\n10 - Consultar Veículos"+
					  "\n11 - Consultar Leilões"+
					  
					  "\n================================="+
					  "\n99 - Sair"
					  
	//	            + "\n7 -  Imprimir Clientes"
	//	            + "\n9 -  Remover Clientes"
	//	            + "\n10 - Imprimir Imoveis"
	//	            + "\n11 - Remover Imoveis"
	//	            + "\n12 - Imprimir Veiculos"
	//	            + "\n13 - Remover Veiculos"
	//	            + "\n14 - Imprimir Instituição Financeira"
	//	            + "\n15 - Remover Instituição Financeira"
	//	            + "\n16 - Imprimir Lote"
	//	            + "\n17 - Remover Lote"
	//	            + "\n18 - Imprimir Leilão"
	//	            + "\n19 - Remover Leilão"
	//	            + "\n20 - Dar Lance"
	//	            + "\n21 - Imprimir Lances por Cliente"
	//	            + "\n22 - Imprimir Lote específico"
	//	            + "\n23 - Atualizar dados do Cliente"
	//	            + "\n24 - Atualizar dados da Instituição Financeira"
	//	            + "\n25 - Atualizar dados de Imóvel"
	//	            + "\n26 - Atualizar dados de Veículo"	            
		            );
			System.out.print("\nESCOLHA UMA OPÇÃO: ");       
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
		        	System.out.println("opção 3");
		        break;    
		        case 4 :
		        	System.out.println("opção 4");
		        break;
		        case 5 :
		        	System.out.println("opção 5");
		        break;
		        case 6 :
		        	System.out.println("opção 6");
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