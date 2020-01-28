package Unidade5.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class LojaVirtual {
	
	 static Map<Cliente,List<Curso>> pagamentos = new HashMap<>();
	
	 
	 public static void listarCursos(List<Curso>lista){
		 //lambda para mostrar cursos do Antonio(ultima linha é chamado o étodo listarCurso
		 //lista.forEach(p->System.out.println(p.getCdcurso()+"<=>"+p.getNome()));
		 
		 //usando referência de métodos:
		 //lista.forEach(System.out::print);
		 
		 
	 }
	 
	 
	 public static void main(String[] args) {
		//criar os cursos disponíveis no site para a a venda
		Curso java8 = new Curso(1, "Java para Web", 2000, Paths.get("/java8"));
		Curso oracle12c = new Curso(2, "Oracle 12c", 2500, Paths.get("/oracle12c"));
		Curso php7 = new Curso(3, "Php 7", 1500, Paths.get("/php7"));
		
		
		//cadastrar o cliente
		Cliente antonio = new Cliente("123.456.789-00", "Antonio Sampaio Jr", "antonio@gmail.com");
		
		
		//criar a lista de cursos do cliente
		List<Curso> cursoAntonio = new LinkedList<>();
		 
		
		//fazer um checkout dos cursos escolhidos
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		while (opcao!=4) {
			System.out.println("Qual curso deseja adquirir: [1-Java8], [2-Oracle12c], [3-PHP7], [4-Finalizar Compra]");
			opcao = entrada.nextInt();//ler entrada do cliente
			if(opcao==1){
				cursoAntonio.add(java8);
			}else if(opcao==2){
				cursoAntonio.add(oracle12c);
			}else if(opcao==3){
				cursoAntonio.add(php7);
			}else
				opcao=4;
				
		}	
			entrada.close();
			pagamentos.put(antonio, cursoAntonio);
			System.out.println(pagamentos);
			
			
		//	listarCursos(cursoAntonio);
			
			//Referência de método com interface funcional
			Consumer<List<Curso>> consumer = LojaVirtual::listarCursos;
			consumer.accept(cursoAntonio);
		}
	}

