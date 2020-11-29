package entities;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.Model;


public class LeilaoApplication {
	
	
	static Scanner leitor = new Scanner (System.in);
	 
	public static void main(String[] args) throws ParseException {
		Model model = new Model();
		int escolha;	    

		do {			
			System.out.println("============ LEIL�O ==============");
			System.out.println("\n========== CADASTROS ==========="+
						       "\n1 - Cadastrar �suario"+
							   "\n2 - Cadastrar Banco"+
							   "\n3 - Cadastrar Im�vel"+
							   "\n4 - Cadastrar Ve�culo"+
							   "\n5 - Cadastrar Leil�o"+
							   "\n============consultas============"+
							   "\n11 - Consultar �suarios"+
							   "\n12 - Consultar Bancos"+
							   "\n13 - Consultar Imoveis"+
							   "\n14 - Consultar Veiculos"+
							   "\n15 - Consultar Leil�es"+
							   "\n16 - Consultar Lances do Produto"+
							   "\n============EDITAR==============="+
							   "\n21 - EDITAR �suario"+
							   "\n22 - EDITAR Bancos"+
							   "\n23 - EDITAR Imoveis"+
							   "\n24 - EDITAR Veiculos"+
							   "\n25 - EDITAR Leil�es"+
							   "\n============EXCLUIR=============="+
							   "\n31 - EXCLUIR �suario"+
							   "\n32 - EXCLUIR Bancos"+
							   "\n33 - EXCLUIR Imoveis"+
							   "\n34 - EXCLUIR Veiculos"+
							   "\n35 - EXCLUIR Leil�es"+
							   "\n================================="+
							   
							   "\n99 - Sair"							   
	//	            + "\n16 - Imprimir Lote"
	//	            + "\n17 - Remover Lote"
	
	
	//	            + "\n20 - Dar Lance"
	//	            + "\n21 - Imprimir Lances por Cliente"
	//	            + "\n22 - Imprimir Lote espec�fico"
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
		        	model.cadastrarVeiculo();
		        break;
		        case 5 :
		        	model.cadastrarLeilao();
		        break;
		        case 11 :
		        	model.consultarClientes();
		        break;
		        case 12 :
		        	model.consultarBancos();	        	
		        break;
		        case 13 :
		        	model.consultarImoveis();
		        break;
		        case 14 :
		        	model.consultarVeiculos();
		        break;
		        case 15 :
		        	model.consultarLeiloes();
		        break;		        
		        case 21 :
		        	model.atualizarCliente();
		        break;
		        case 22 :
		        	model.atualizarBanco();
		        break;
		        case 23 :
		        	model.atualizarImovel();
		        break;
		        case 24 :
		        	model.atualizarVeiculo();
		        break;
		        case 25 :
		        	model.atualizarLeilao();
		        break;
		        case 31 :
		        	model.deletarCliente();
		        break;
		        
		        case 32 :
		        	model.deletarBanco();
		        break;
		        case 33 :
		        	model.deletarImovel();
		        break;
		        case 34 :
		        	model.deletarVeiculo();
		        break;
		        case 35 :
		        	model.deletarVeiculo();
		        break;
		        case 16 :
		        	model.filtrarLancePorProduto();
		        break;
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