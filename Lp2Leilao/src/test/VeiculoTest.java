package test;

import org.junit.Assert;
import org.junit.Test;

import entities.Veiculo;

public class VeiculoTest {

	private Veiculo veiculo;	
	
	@Test
	public void ValidatePerformGetVeiculo() {
		veiculo = new Veiculo (14, 45000, "-5000", 01, 2020, "Corola", "Preto", "Carro");
		String expectedResult = 14+ 45000+ "-5000"+ 01+ 2020+ "Corola"+ "Preto"+ "Carro";
		Assert.assertEquals(expectedResult, veiculo.getIdProduto()+ veiculo.getLanceMinimo()+ veiculo.getDesc()+ veiculo.getIdLeilao()+ veiculo.getAno()+ veiculo.getModelo()+ veiculo.getCor()+ veiculo.getTipo());
	}
	
}
