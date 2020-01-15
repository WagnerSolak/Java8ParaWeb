package Unidade4.com.abctreinamentos;

import java.io.ObjectInputStream.GetField;
import java.util.HashSet;
import java.util.Set;

public class Cliente {
	//Representar através de um conjunto de elementos não duplicados
	
	Set<Curso> cursos;
	
	public static void main(String[] args) {
		
		Curso java8 = new Curso("java8");
		Curso oracle12c = new Curso("oracle12c");
		
		Set<Curso> cursosA = new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();
		
		cursosA.add(java8);
		cursosA.add(oracle12c);
		
		cursosB.add(java8);
		
		//quais cursos A e B estão fazendo
		//interseção
		cursosA.retainAll(cursosB);
		System.out.println("A intersec B");
		System.out.println(cursosA);
		
		//qual curso que A faz e B não faz
		cursosA.removeAll(cursosB);
		System.out.println("A - B");
		System.out.println(cursosB);
		
		//qual curso que B faz e A não faz
		cursosB.removeAll(cursosA);
		System.out.println("B - A");
		System.out.println(cursosB);
		
		Cliente A = new Cliente();
		A.setCursos(cursosA);
		Cliente B = new Cliente();
		B.setCursos(cursosB);
		
	}
	public Set<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}	
}
