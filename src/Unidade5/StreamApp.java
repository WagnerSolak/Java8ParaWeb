package Unidade5;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	
	static List<String> funcionarios;
	
	
	public static void filtrar(String letra){
		//filtrar funci,chama metodo stream, metodo filter passando lambda com argumento (s) que inicia com letra, e imprimir usando ref de método
		funcionarios.stream().filter(s->s.startsWith(letra)).forEach(System.out::println);
	}
	public static void ordenar(String letra){
		//método sorted para ordenar
		funcionarios.stream().sorted().filter(s->s.startsWith(letra)).forEach(System.out::println);
	}
	public static void contar(String letra){
		//cria um contador, que recebe funcionarios.stream com método count que vai dar nr de elementos
		long contador = funcionarios.stream().filter(s->s.startsWith(letra)).count();
		System.out.println(contador);
	}
	public static void main(String[] args) {
		
		funcionarios = new ArrayList<>();
		funcionarios.add("Antonio");
		funcionarios.add("José");
		funcionarios.add("Pedro");
		funcionarios.add("João");
		funcionarios.add("André");
		
		//Chamadas dos métodos:
		
		//filtrar("J");
		//ordenar("A");
		contar("A");
		
	}
}
