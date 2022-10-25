package Vetor;

import java.util.Arrays;

public class Vetor {

	private Aluno[]alunos = new Aluno[100];
	private int totalAlunos = 0;
	
	
	public void garanteEspaco() {
		if(totalAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for(int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	private boolean posicaoValidaInsercao(int posicao) {
		return posicao >= 0 && posicao <= totalAlunos;
	}
	
	public void posicaoInsercao(Aluno aluno, int posicao) {
		this.garanteEspaco();
		
		if(!posicaoValidaInsercao(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
					
		for(int i = totalAlunos - 1; i >= posicao; i--) {
			alunos[i+1] = alunos[i];
		}
		
		alunos[posicao] = aluno;
		totalAlunos ++;
	}
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		
		this.alunos[totalAlunos] = aluno;
		totalAlunos ++;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalAlunos;
	}
	
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		for(int i = posicao; i <this.totalAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
	}
	
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < totalAlunos; i++) {
			if(alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return totalAlunos;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
