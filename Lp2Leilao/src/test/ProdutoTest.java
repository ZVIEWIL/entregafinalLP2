package test;

import org.junit.Assert;
import org.junit.Test;

import entities.Produto;


public class ProdutoTest {
	
	private Produto produto;	
		
	@Test
	public void ValidatePerformGetProduto() {
		produto = new Produto (02, 250, "-50", 01);
		String expectedResult = 02+ 250+ "-50"+ 01;
		Assert.assertEquals(expectedResult, produto.getIdProduto()+ produto.getLanceMinimo() + produto.getDesc() + produto.getIdLeilao());
	}
	
	
	

}
