package Test;

import org.junit.Assert;
import org.junit.Test;
import entities.Imovel;

public class ImovelTest {
	
	
	
	private Imovel imovel;
	
	@Test
	
	public void ValidatePerformGetImovel() {
		imovel = new Imovel (01, 1000, "-200", 02, "122247480", 10, 1, "Leilao");
		String expectedResult = 01 + 1000 + "-200" + 02 + "122247480" +  10 + 1 + "Leilao";
		Assert.assertEquals(expectedResult, imovel.getCep() + imovel.getNumero() + imovel.getArea() + imovel.getTipo());
	
	

}
}
