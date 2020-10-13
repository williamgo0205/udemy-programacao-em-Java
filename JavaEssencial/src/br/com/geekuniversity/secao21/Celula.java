package br.com.geekuniversity.secao21;

/**
 * Classe que representa uma c�lula (Container), onde teremos o objeto (valor)
 * e uma c�lula que ser� a liga��o para o valor pr�ximo e para o valor anterior.
 */
public class Celula {
	private Object elemento;
	private Celula proximo;
	private Celula anterior;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Celula(Object elemento) {
		this(elemento, null);
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return this.elemento;
	}
	
	public Celula getAnterior() {
		return this.anterior;
	}
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	
}
