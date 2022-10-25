package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class MainQuee {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("bolsa");
		fila.add("estojo");
		fila.add("diamantante");
		
		System.out.println(fila.toString());
		
		fila.poll();
		System.out.println(fila);
		
		String elemento =  fila.peek();
		System.out.println(elemento);

	}

}
