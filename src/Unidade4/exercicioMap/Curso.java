package Unidade4.exercicioMap;

import java.nio.file.Path;

public class Curso {
	
	int cdcurso;
	String nome;
	float valor;
	Path url;
	
	public Curso(int cdcurso, String nome, float valor,Path url) {
		super();
		this.cdcurso = cdcurso;
		this.nome = nome;
		this.url = url;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}
	
	
	
	
	
	
	
	
}
