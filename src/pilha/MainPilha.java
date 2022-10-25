package pilha;

public class MainPilha {

	public static void main(String[] args) {

		Pilha nomes = new Pilha();
		
		nomes.insere("kleberson");
		System.out.println(nomes.toString());
		
		nomes.insere("kaw");
		System.out.println(nomes.toString());
		
		nomes.insere("jose");
		System.out.println(nomes.toString());
		
		String r1 = nomes.remove();
		System.out.println(r1);
		
		String r2 = nomes.remove();
		System.out.println(r2);
		
		String r3 = nomes.remove();
		System.out.println(r3);
		
		System.out.println(nomes.vazia());
	}

}
