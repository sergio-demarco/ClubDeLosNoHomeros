package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.Bar;
import ar.edu.unlam.pb2.Clientes;

public class BarTest {
	@Test
	public void testQueCuentaLosClientesConUnHomero() 
	{
		Bar miBar = new Bar();
		Clientes miCliente1 = new Clientes("Homero", 300d,20);
		Clientes miCliente2 = new Clientes("Barney", 300d,19);
		Clientes miCliente3 = new Clientes("Homero", 300d,19);
		miBar.agregarClientes(miCliente1);
		miBar.agregarClientes(miCliente2);
		miBar.agregarClientes(miCliente3);
		assertEquals(2,miBar.contarClientes(), 0);
		
	}
	
	@Test
	public void testQueListaLosClientes() 
	{
		Bar miBar = new Bar();
		Clientes miCliente1 = new Clientes("Pedro", 300d,20);
		Clientes miCliente2 = new Clientes("Homero", 300d,19);
		Clientes miCliente3 = new Clientes("Homero", 300d,19);
		miBar.agregarClientes(miCliente1);
		miBar.agregarClientes(miCliente2);
		miBar.agregarClientes(miCliente3);
		
		System.out.println(miBar.mostrarClientes());			
	}
}
