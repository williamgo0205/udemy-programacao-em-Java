package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Streams

public class Programa77 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algorítimos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		// Como fazer para imprimir a "quantidade de alunos" somente para cursos com mais de 100 alunos?
		cursos.stream()
		    .filter(c -> c.getAlunos() >= 100)
		    .map(Curso::getAlunos) // Mapeia um tipo de dado para outro tipo
		    .forEach(System.out::println);
		
		// Como fazer para imprimir o "somatório quantidade de alunos" somente para cursos com mais de 100 alunos?
		cursos.stream()
		    .filter(c -> c.getAlunos() >= 100)
		    .map(Curso::getAlunos) // Mapeia um tipo de dado para outro tipo
		    .forEach(System.out::println);
	}

}
