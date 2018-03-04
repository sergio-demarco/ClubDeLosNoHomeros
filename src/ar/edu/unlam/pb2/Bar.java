package ar.edu.unlam.pb2;

import java.util.Iterator;
import java.util.TreeSet;

import ar.edu.unlam.pb2.Clientes;

public class Bar {
	private TreeSet<Clientes> clientes = new TreeSet<Clientes>();

	public TreeSet<Clientes> mostrarClientes() {
		Iterator<Clientes> iterator = clientes.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getNombre());
		}
		return clientes;
	}

	public void agregarClientes(Clientes clientes) {
		clientes.add(clientes);
	}

	public Integer contarClientes() {
		return clientes.size();
	}
}
