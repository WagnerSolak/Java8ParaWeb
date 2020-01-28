package Unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp5 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4);
	    integers.forEach(x->{

	    	//declarando uma variável dentro da expressão lambda:
	    	int y = x/2;
	    	System.out.println(y);
	    });

	}

}
