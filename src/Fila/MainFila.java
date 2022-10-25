package Fila;

public class MainFila {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.insere("kleberson");
		fila.insere("jose");
		fila.insere("amanda");
		fila.insere("ana");
		
		System.out.println(fila.toString());
		
		fila.remove();
		System.out.println(fila.toString());
		
		fila.remove();
		fila.remove();
		fila.remove();
		
		System.out.println(fila.toString());
		System.out.println(fila.vazia());
	}
	
}
