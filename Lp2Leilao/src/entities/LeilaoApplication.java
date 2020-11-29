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
			System.out.println("============ LEILÃO ==============");
			System.out.println("\n========== CADASTROS ==========="+
						       "\n1 - Cadastrar Úsuario"+
							   "\n2 - Cadastrar Banco"+
							   "\n3 - Cadastrar Imóvel"+
							   "\n4 - Cadastrar Veículo"+
							   "\n5 - Cadastrar Leilão"+
							   "\n============consultas============"+
							   "\n11 - Consultar Úsuarios"+
							   "\n12 - Consultar Bancos"+
							   "\n13 - Consultar Imoveis"+
							   "\n14 - Consultar Veiculos"+
							   "\n15 - Consultar Leilões"+
							   "\n16 - Consultar Lances do Produto"+
							   "\n============EDITAR==============="+
							   "\n21 - EDITAR Úsuario"+
							   "\n22 - EDITAR Bancos"+
							   "\n23 - EDITAR Imoveis"+
							   "\n24 - EDITAR Veiculos"+
							   "\n25 - EDITAR Leilões"+
							   "\n============EXCLUIR=============="+
							   "\n31 - EXCLUIR Úsuario"+
							   "\n32 - EXCLUIR Bancos"+
							   "\n33 - EXCLUIR Imoveis"+
							   "\n34 - EXCLUIR Veiculos"+
							   "\n35 - EXCLUIR Leilões"+
							   "\n================================="+
							   
							   "\n99 - Sair"							   
	//	            + "\n16 - Imprimir Lote"
	//	            + "\n17 - Remover Lote"
	
	
	//	            + "\n20 - Dar Lance"
	//	            + "\n21 - Imprimir Lances por Cliente"
	//	            + "\n22 - Imprimir Lote específico"
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