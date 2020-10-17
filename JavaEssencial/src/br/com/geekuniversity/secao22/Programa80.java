package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Streams

public class Programa80 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Programa��o para Leigos", 170));
		cursos.add(new Curso("Algor�timos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		System.out.println(">>>> Cursos Totais");
		cursos.forEach(System.out::println);
		
		// Como copiar o conte�do do Stream para outra lista de curso;
		List<Curso> resultado = cursos.stream()
									.filter(c -> c.getAlunos() >= 100)
									.collect(Collectors.toList()); // coleta as informa��es e insere em uma nova lista
		System.out.println();
		System.out.println(">>>> Cursos filtrados pelo Collect do Stream");
		resultado.forEach(System.out::println);
		
		System.out.println();
		System.out.println(">>>> Utiliza��o do Collectors.toMap");
		cursos.stream()
		    .filter(c -> c.getAlunos() >= 100)
		    .collect(Collectors.toMap(c -> c.getNome(), 
		    		                  c -> c.getAlunos())) // Coleta pelo Map pelo nome a quantidade dos alunos
		    .forEach((nome, alunos) -> System.out.println("O curso " + nome + " tem " + alunos + " alunos"));
		
	}

}
