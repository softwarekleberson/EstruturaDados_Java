package Vetor;

public class Aluno {

	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno)obj;
		return outro.getNome().equals(this.nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
