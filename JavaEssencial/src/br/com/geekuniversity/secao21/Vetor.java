package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;
	
	public void adiciona(Aluno aluno) {
		//TODO redecer um aluno
		this.garantirEspaco();
		this.alunos[this.total] = aluno;
		this.total = this.total + 1;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		//TODO redecer um aluno e sua posi��o
		this.garantirEspaco();
		
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!!!");
		}
		
		for (int i = this.total -1; i >= posicao; i-=1 ) {
			this.alunos[i+1] = this.alunos[i];
		}
		
		this.alunos[posicao] = aluno;
		this.total++; // total = total + 1
	}
	
	public Aluno pega(int posicao) {
		//TODO recebe uma posic�o e devolve o aluno
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!!!");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		//TODO remove aluno pela posi��o	
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!!!");
		}
		
		for (int i = posicao; i <= this.total; i++ ) {
			this.alunos[i] = this.alunos[i+1];
		}
		this.total--; // total = total - 1
	}
	
	public boolean contem(Aluno aluno) {
		//TODO descobre se o aluno est� ou n�o na lista
		for (int i = 0; i < this.total; i++) {
			if(aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		//TODO devolve a quantdade de alunos no vetor
		return this.total;
	}
	
	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.alunos.length;
	}
	
	private void garantirEspaco() {
		// Verifica se o array alunos est� cheio
		if(this.total == this.alunos.length) {
		   // Caso esteja cheio cria um novo array cm o dobro do tamanho do array original	
		   Aluno novoArray[] = new Aluno[this.alunos.length*2];
		  
		   // Preenche  array noco com as informa��es do array original
		   for(int i= 0; i < this.alunos.length; i++) {
			   novoArray[i] = this.alunos[i];
		   }
		   
		   // Atribui ao array original o array novo
		   this.alunos = novoArray;
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.alunos); // Facilita a visualiza��o do array
	}
}
