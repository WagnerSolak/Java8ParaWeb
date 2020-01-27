package Unidade4;

import java.util.LinkedHashMap;



public class LinkedHashMapApp {

	public static void main(String[] args) {
		//respeita a ordem de inserção
		LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "Bruno");
		mapa.put(2, "Umberto");
		mapa.put(3, "Fernando");
		mapa.put(3, "Caetano");
		mapa.put(4, "Umberto");
		
		System.out.println(mapa);
	}

}
