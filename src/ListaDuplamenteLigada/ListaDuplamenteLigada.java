package ListaDuplamenteLigada;

public class ListaDuplamenteLigada {

	private Celula primeira = null;
	private Celula ultimo = null;
	private int totalElementos = 0;
	
	
	public void adicionaNoComeco(Object elemento) {
		
		if(this.totalElementos == 0) {
			Celula nova = new Celula(primeira, elemento);
			this.primeira = nova;
			this.ultimo = nova;
			
		} else {
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		
		this.totalElementos++;
	}
	
	public void adiconaFim(Object elemento) {
		
		if(this.totalElementos == 0) {
			adicionaNoComeco(elemento);
			
		}else {
				
			Celula nova = new Celula(elemento);
			this.ultimo.setProximo(nova);
			nova.setAnterior(this.ultimo);
			this.ultimo = nova;
			this.totalElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}
	
	public Celula pegaPosicao(int posicao) {
		
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Invalida");
		}
		
		Celula atual = primeira;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		
		return atual;
	}
	
	public void adiconaEmQualquerPosicao(int posicao, Object elemento) {
		if(posicao == 0) {
			adicionaNoComeco(elemento);
		}
		
		else if(posicao == this.totalElementos) {
			adicionaNoComeco(elemento);
		}
		
		else {
			
			Celula anterior = pegaPosicao(posicao - 1);
			Celula proxima = anterior.getProximo();
			
			Celula nova = new Celula(anterior.getProximo(), elemento);
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			
			this.totalElementos++;
		}
	}
	
	public int totalElementos() {
		return this.totalElementos;
	}
	
	public void removeInicio() {
		if(this.totalElementos == 0) {
			throw new IllegalArgumentException("Impossivel Remover, Sem Elementos");
		}
		
		this.primeira = this.primeira.getProximo();
		this.totalElementos--;
		
		if(this.totalElementos == 0) {
			this.ultimo = null;
		}
	}
	
	public void removeFim() {
		if(this.totalElementos == 1) {
			this.removeInicio();;
		} else {
			Celula penultima = this.ultimo.getAnterior();
			penultima.setProximo(null);
			this.ultimo = penultima;
			this.totalElementos--;
		}
	}
	
	public void removeQualquerPosicao(int posicao) {
		if(posicao == 0) {
			this.removeInicio();
		} else if(posicao == this.totalElementos -1) {
			this.removeFim();
		}
		else {
			Celula anterior = this.pegaPosicao(posicao -1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.totalElementos--;
		}
	}
	
	public boolean contem(Object elemento) {
		Celula atual = this.primeira;
		
		while(atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			
			atual = atual.getProximo();
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		
		if(this.totalElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		for(int i = 0; i < totalElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(" ,");
			
			atual = atual.getProximo();
		}
		
		builder.append("]");
		
		return builder.toString();
	}
}
