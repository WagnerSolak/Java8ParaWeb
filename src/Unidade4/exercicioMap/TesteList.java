package Unidade4.exercicioMap;

import java.util.ArrayList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, 70);
		int total = list.get(1);
		System.out.println(total);
	}

}
