package Unidade3;

public class UsoGenerico {

	public static void main(String[] args) {
		
		//manipulando generico
		
		ExemploGenerics<String> sob = new ExemploGenerics<>("Solak");
		sob.showType();
	
		
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
		iob.showType(); // imprimir o tipo
		
		
	}
}
