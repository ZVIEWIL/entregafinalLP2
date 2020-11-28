package Test;

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
	
	@Test
	public void testPesquisaCliente() {

		// criando alguns clientes
		Cliente cliente01 = new Cliente("Lucas", 32, "123456789", "Av. Andromeda");
		Cliente cliente02 = new Cliente("Luiz", 22, "1748956789", "Rua Iguape");
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		Cliente gerClientes = new Cliente (clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getNome(), is("Lucas"));
		assertThat(cliente.getIdade(), is(25));
	
	
	}
}
