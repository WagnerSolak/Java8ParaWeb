package Unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp4 {

	static int numero;
	int somatorio;
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4);
		LambdaApp4 app4 = new LambdaApp4();
			
		integers.forEach(x->{
			
			numero = 10;
			x = x + numero;
			app4.somatorio = app4.somatorio + x;
			System.out.println(x);
		});
		
		System.out.println(app4.somatorio);
	}

}
