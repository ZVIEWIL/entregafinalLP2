package Test;



import org.junit.Assert;
import org.junit.Test;
import entities.Leilao;


public class LeilaoTest {
	
	private Leilao leilao;
	
	@Test
	
	public void ValidatePerformGetLeilao() {
		leilao = new Leilao (null, null, null, "Rua Três", "Ativo", "Banco2");
		String expectedResult = 01 + 02 + 24/11/2020 + "Rua Três"+ "Ativo" + "Banco2";
		Assert.assertEquals(expectedResult, leilao.getEndereco() + leilao.getStatus() + leilao.getBanco());
	}




}
