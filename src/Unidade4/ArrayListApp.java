package Unidade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		
		Collections.sort(lista);
		System.out.println(lista);
		
		//Result.:   mostrou na ordem de inserção
		//Result2.:  ao adicionar a classe Collections, adicionado ao método est.sort, mostra a lista ordenada
	}

}
