package Unidade4;


import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		((LinkedList<String>) lista).removeFirst();
		((LinkedList<String>) lista).removeLast();
		
		System.out.println(lista);
		
		//Result.:   mostrou na ordem de inserção
		//Result2.:  ao adicionar a classe Collections, adicionado ao método est.sort, mostra a lista ordenada
	}

}
