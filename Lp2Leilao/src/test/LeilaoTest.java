package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import entities.Leilao;


public class LeilaoTest {
	
	private Leilao leilao;
	
	@Test
	
	public void ValidatePerformGetLeilao() throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataOcorrencia = "24/11/2020";
		Date dataFormatada = formato.parse(dataOcorrencia);
		leilao = new Leilao ( 01, 02, dataFormatada,"Rua Três", "Ativo", "Banco2");
		String expectedResult = 01 + 02 + 24/11/2020 + "Rua Três"+ "Ativo" + "Banco2";
		Assert.assertEquals(expectedResult, leilao.getEndereco() + leilao.getStatus() + leilao.getBanco());
	}




}
