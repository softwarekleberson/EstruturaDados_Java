package pilha;

import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>();
		
		pilha.push("lais");
		pilha.push("cleiton");
		pilha.push("amanda");
		
		System.out.println(pilha);
		
		pilha.pop();
		System.out.println(pilha);
		
		String guarda = pilha.peek();
		System.out.println(guarda);
		
		System.out.println(pilha);
		
	}
}
