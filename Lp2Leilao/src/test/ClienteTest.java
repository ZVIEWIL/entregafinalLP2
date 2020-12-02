package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import entities.Cliente;


public class ClienteTest {
	
	private Cliente cliente;
	
	
	@Test
	public void ValidatePerformGetCliente() {
		cliente = new Cliente ("Caroline", 25, "123456789", "Rua dois");
		String expectedResult = "Caroline" + 25 + "123456789" + "Rua dois";
		Assert.assertEquals(expectedResult, cliente.getNome()+ cliente.getIdade()+ cliente.getCpf()+ cliente.getEndereco());
	}

}
