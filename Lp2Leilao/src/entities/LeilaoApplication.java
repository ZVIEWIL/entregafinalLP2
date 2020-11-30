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
			System.out.println("=============LEILÃO================");
			System.out.println("\n============CADASTROS============"+
						       "\n1 - Cadastrar Úsuario"+
							   "\n2 - Cadastrar Banco"+
							   "\n3 - Cadastrar Imóvel"+
							   "\n4 - Cadastrar Veículo"+
							   "\n5 - Cadastrar Leilão"+
							   "\n============CONSULTAS============"+
							   "\n6 - Consultar Úsuarios"+
							   "\n7 - Consultar Bancos"+
							   "\n8 - Consultar Imoveis"+
							   "\n9 - Consultar Veiculos"+
							   "\n10 - Consultar Leilões"+
							   "\n11 - Consultar Lances do Produto"+
							   "\n============EDITAR==============="+
							   "\n12 - Editar Úsuario"+
							   "\n13 - Editar Bancos"+
							   "\n14 - Editar Imoveis"+
							   "\n15 - Editar Veiculos"+
							   "\n16 - Editar Leilões"+
							   "\n============EXCLUIR=============="+
							   "\n17 - Excluir Úsuario"+
							   "\n18 - Excluir Bancos"+
							   "\n19 - Excluir Imoveis"+
							   "\n20 - Excluir Veiculos"+
							   "\n21 - Excluir Leilões"+
							   "\n========FUNCIONALIDADES=========="+
							   "\n22 - Filtrar Produto por Valor Min/Máx"+
							   "\n================================="+
							   "\n99 - Sair"							   

					);
			System.out.print("\nESCOLHA UMA OPÇÃO: ");       
			escolha = leitor.nextInt();
			
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
		        	model.consultarClientes();
		        break;
		        case 7 :
		        	model.consultarBancos();	        	
		        break;
		        case 8 :
		        	model.consultarImoveis();
		        break;
		        case 9 :
		        	model.consultarVeiculos();
		        break;
		        case 10 :
		        	model.consultarLeiloes();
		        break;	
		        case 11 :
		        	model.filtrarLancePorProduto();
		        break;	
		        case 12 :
		        	model.atualizarCliente();
		        break;
		        case 13 :
		        	model.atualizarBanco();
		        break;
		        case 14 :
		        	model.atualizarImovel();
		        break;
		        case 15 :
		        	model.atualizarVeiculo();
		        break;
		        case 16 :
		        	model.atualizarLeilao();
		        break;
		        case 17 :
		        	model.deletarCliente();
		        break;
		        case 18 :
		        	model.deletarBanco();
		        break;
		        case 19 :
		        	model.deletarImovel();
		        break;
		        case 20 :
		        	model.deletarVeiculo();
		        break;
		        case 21 :
		        	model.deletarVeiculo();
		        break;
		        case 22:
		        	model.filtrarMinMax();
		        break;
		        default:
		        	System.out.print("\nOpção inválida.\n");
		        break;
		    }
		} while(escolha!= 99);
	}
}