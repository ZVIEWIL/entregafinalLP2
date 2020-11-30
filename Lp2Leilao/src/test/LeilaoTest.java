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
		String data_inicio = "24/11/2020";
		Date dataFormatada = formato.parse(data_inicio);
		String data_fim = "25/11/2020";
		Date dataFormatada2 = formato.parse(data_fim);
		leilao = new Leilao (01, dataFormatada, dataFormatada2, "Rua Três", "Banco2");
		String expectedResult = 01 + 02 + 24/11/2020 + "Rua Três"+ "Ativo" + "Banco2";
		Assert.assertEquals(expectedResult, leilao.getEndereco() + leilao.getBanco());
	}




}
