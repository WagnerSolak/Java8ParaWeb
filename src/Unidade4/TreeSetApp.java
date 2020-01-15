package Unidade4;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {
		// Usou Set e new TreeSet (orientado a interface)
		// lista implementando a interface Set e especializando a classe TreeSet
		Set<String> lista = new TreeSet<>();
			lista.add("vermelho");
			lista.add("verde");
			lista.add("verde");
			lista.add("amarelo");
		
		System.out.println(lista);
		
		//Result.: mostrou na ordem invertida
	}

}
