package br.com.geekuniversity.secao21;

// Armazenamento Sequencial

/*
 int numeros[] = new int [5];
 
 numeros[0] = 1;
 numeros[1] = 3;
 numeros[2] = 5;
 numeros[3] = 7;
 numeros[4] = 9;
*/
public class Programa55 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a1);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a2);
		System.out.println("Total de alunos: " + lista.tamanho());

		// Visualizando informa��es da lista
		System.out.println(lista);
		
		// Utilizando m�todo contem
		System.out.println(lista.contem(a1));
		
		// Tentando buscar uma informa��o ide uma posi��o nv�lida
		try {
			System.out.println(lista.pega(101));
		}catch(IllegalArgumentException e) {
			System.out.println("O aluno da posi��o 101 n�o existe");
			System.out.println(e.getMessage());
		}
		
		// Adicionando alunos na posi��o informaa inv�lida
		Aluno a3 = new Aluno("Maria");
		
		try {
			lista.adiciona(101, a3);
		}catch(IllegalArgumentException e) {
			System.out.println("A posi��o informada � inv�lida");
			System.out.println(e.getMessage());
		}
		
		// Removendo um aluno
		try {
		   lista.remove(0);
		} catch(IllegalArgumentException e) {
			System.out.println("A posi��o informada � inv�lida");
			System.out.println(e.getMessage());
		}
		
		System.out.println(lista);		
		
	}
}
