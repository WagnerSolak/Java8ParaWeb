package Unidade5;

public class ValidadorApp {

	public static void main(String[] args) {
		
		//validador utilizando a expressão lambda
		
		String celular = "99113-4566";
		Validator<String> validacao = valor->valor.matches("[0-9]{5}-[0-9]{4}");
		System.out.println(validacao.valida(celular));;
	}
}
