package Conjunto;

public class ConjuntoMain {

	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Marcelo");
		conjunto.adiciona("Guilherme");
		System.out.println(conjunto);
		
		conjunto.adiciona("kleberson");
		System.out.println(conjunto);
	}
}
