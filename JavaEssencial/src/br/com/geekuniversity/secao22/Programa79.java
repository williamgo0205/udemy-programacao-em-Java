package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Streams

public class Programa79 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algorítimos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		// Como fazer para imprimir "qualquer curso ou o primeiro da lista" para cursos com mais de 100 alunos?
		cursos.stream()
		    .filter(c -> c.getAlunos() >= 100) // Se não encontrar ele não imprime
		    //.findAny() // Pega qualquer valor de acordo com o filtro, nesse caso qualquer curso caso tenha mais de 100 alunos
		    .findFirst() // Pega o primeiro registro
		    .ifPresent(System.out::println); // se encontrar algum curso imprime

	}

}
