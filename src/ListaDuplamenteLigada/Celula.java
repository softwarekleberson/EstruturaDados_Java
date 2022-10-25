package ListaDuplamenteLigada;

public class Celula {

	private Object elemento;
	
	private Celula proximo;
	private Celula anterior;
	
	public Celula(Object elemento) {
		this(null, elemento);
	}
	
	public Celula(Celula proxima, Object elemento) {
		
		this.proximo = proxima;
		this.elemento = elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	
}
