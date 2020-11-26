package entities;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Model;


public class LeilaoApplication {
	
	List <Cliente>clientes = new ArrayList<Cliente>();
	List <Leilao>leiloes = new ArrayList<Leilao>();
	static Scanner leitor = new Scanner (System.in);
	 
	public static void main(String[] args) {
		Model model = new Model();
		
		
		int escolha;	    
	    //Menu da Interface
		do {
			System.out.println("================================");
			System.out.println("===========  LEILÃO  ===========");
			System.out.println("================================");
			System.out.println("\n========= CADASTROS ==========");
			System.out.println(			  
					    "1 - Cadastrar Úsuario"+
					  "\n2 - Cadastrar Banco"+
					  "\n3 - Cadastrar Imóvel"+
					  "\n4 - Cadastrar Veículo"+
					  "\n5 - Cadastrar Leilão"+
					  "\n6 - Cadastrar Lote\n"+
					  "\n========= CONSULTAS ========="+
					  "\n7 - Consultar Úsuarios"+
					  "\n8 - Consultar Bancos"+
					  "\n9 - Consultar Imóveis"+
					  "\n10 - Consultar Veículos"+
					  "\n11 - Consultar Leilões"+
					  "\n================================="+
					  "\n99 - Sair"	            
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
		        	model.cadastrarImovel();
		        break;    
		        case 4 :
		        	model.cadastrarVeiculo();
		        break;
		        case 5 :
		        	model.cadastrarLeilao();
		        break;
		        case 6 :
		        	System.out.print("Em construção");
		        break;
		        case 7 :
		        	model.consultarClientes();	        	
		        break;
		        case 8 :
		        	model.consultarBancos();
		        break;
		        case 9 :
		        	model.consultarImoveis();
		        break;
		        case 10 :
		        	model.consultarVeiculos();
		        break;
		        case 11 :
		        	model.consultarLeiloes();
		        break;

		        default:
		        
		        break;
	    }}while(escolha!= 99);
	}

}