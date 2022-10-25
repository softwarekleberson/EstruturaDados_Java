package Vetor;

public class VetorMain {
	public static void main(String[] args) {
		
		Aluno joao = new Aluno("joao");
		Aluno jose = new Aluno("Jose");
		Aluno carlos = new Aluno("carlos");
		Aluno bia = new Aluno("bia");
		
		Vetor lista = new Vetor();
		lista.adiciona(joao);
		lista.adiciona(jose);
		lista.adiciona(carlos);
		//lista.posicaoInsercao(bia, 3);
		lista.remove(1);
		
		//System.out.println(lista.pega(2));
		//System.out.println(lista);
		//System.out.println(lista.tamanho());
		//System.out.println(lista.contem(bia));
		
		for(int i = 0; i < 300; i++) {
			Aluno antony = new Aluno("antony " + i);
			lista.adiciona(antony);
		}
		System.out.println(lista);
	}
}
