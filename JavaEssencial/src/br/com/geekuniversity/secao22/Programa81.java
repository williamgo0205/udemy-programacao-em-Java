package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Streams + Thread (Paralelismo)

/*
 - Util quando estamos trabalhando com milh�es Bilh�es de dados.
 - N�o � recomendado para quantidade pequena de dados.
*/

public class Programa81 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Programa��o para Leigos", 170));
		cursos.add(new Curso("Algor�timos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		// Para fazer o Stream rodar em paralelo (Thread) 
		// Modifica-se de .stream() para .parallelStream()
		cursos.parallelStream() 
		    .filter(c -> c.getAlunos() >= 100)
		    .collect(Collectors.toMap(c -> c.getNome(), 
		    		                  c -> c.getAlunos()))
		    .forEach((nome, alunos) -> System.out.println("O curso " + nome + " tem " + alunos + " alunos"));
	}

}
