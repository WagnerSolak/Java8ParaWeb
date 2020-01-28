package Unidade5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	
	public static void main(String[] args) {
		
	//esta forma de implementação:
	/*
	List<Integer> integers = Arrays.asList(1,2,3,4);
	
	for(Integer inteiro:integers){
		inteiro = inteiro +10;
		System.out.println(inteiro);
	}
	*/
	//faz o mesmo usando Lambda:	
	List<Integer> integers = Arrays.asList(1,2,3,4);
	integers.forEach(x->{
		x = x + 10;
		System.out.println(x);
	});
		
		
		
	}

}
