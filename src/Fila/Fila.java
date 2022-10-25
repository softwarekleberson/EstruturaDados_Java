package Fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> fila = new LinkedList<>();
	
	public void insere(String nome) {
		fila.add(nome);
	}
	
	public String remove() {
		return fila.remove(0);
	}
	
	public boolean vazia() {
		return fila.isEmpty();
	}
	
	@Override
	public String toString() {
		return fila.toString();
	}
}
