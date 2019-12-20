package Unidade3;

public class UsoGenerico {

	public static void main(String[] args) {
		
		//manipulando generico
		ExemploGenerics iob = new ExemploGenerics<Integer>(88);        // criou um obj 88 do tipo inteiro
		iob.showType(); // imprimir o tipo
		
		ExemploGenerics sob = new ExemploGenerics<String>("SOLAK");
		sob.showType();

	}
}
