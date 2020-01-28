package Unidade5;


import java.util.Arrays;
import java.util.List;

public class LambdaApp3 {

	//se fosse usar atributo estático
	//static int numero;
	public static void main(String[] args) {
		

	// usando Lambda declarando variável e utilizando no corpo da função::	
	List<Integer> integers = Arrays.asList(1,2,3,4);
	
	//se fosse usar atributo estático
	//numero = 10;
	
	int numero = 10;
	integers.forEach(x->{
		x = x + numero;
		System.out.println(x);
	});
		
		
		
	}

}
