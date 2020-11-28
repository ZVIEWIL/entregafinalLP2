package Test;

import org.junit.Assert;
import org.junit.Test;

import entities.Banco;

public class BancoTest {
	
	private Banco banco;
	
	
	@Test
	public void ValidatePerformGetBanco() {
		banco = new Banco ("Bancoleilao", "12556370001");
		String expectedResult = "Bancoleilao" + "12556370001";
		Assert.assertEquals(expectedResult, banco.getNomeFinanceira()+ banco.getCnpjFinanceira());
	}

}
