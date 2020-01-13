package Unidade3.grafico;

import java.util.ArrayList;
import java.util.List;

public class GenericaApp {

	public static void main(String[] args) {
		
		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());
		
		//Rectangle ret = lista.get(0); 
		//não consegue converter shape em rectangle, por isso nao aceit, está errado
		//não aceita para manter um código mais robusto
		
		List<?> ls = lista;
		//correto
		
		
		

	}

}
