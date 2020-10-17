package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Streams

/*
 - Streams s�o fluxos de dados/objetos, utilizados para que possamos trabalhar com esses dados de forma mais criteriosa.
 - Quando trabalhamos com stream, os m�todos aplicados � este stream nao afeta a cole��o original.
*/

public class Programa76 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Programa��o para Leigos", 170));
		cursos.add(new Curso("Algor�timos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		// Como fazer para imprimir somente os cursos com mais de 100 alunos?
		// Passos
		// 1 - Transformando a cole��o de cursos em Streams
		// 2 - Aplicamos o filtro onde os cursos com 100 ou mais alunos
		// 3 - Imprimimos o resultado
		System.out.println(">>>>  Utilizando Express�o Lambda");
		cursos.stream() // 1
		    .filter(c -> c.getAlunos() >= 100) // 2
		    .forEach(c -> System.out.println(c.getNome())); // 3
		
		System.out.println();
		System.out.println(">>>> Utilizando Method Reference");
		cursos.stream() // 1
		    .filter(c -> c.getAlunos() >= 100) // 2
		    .forEach(System.out::println); // 3
	}

}
