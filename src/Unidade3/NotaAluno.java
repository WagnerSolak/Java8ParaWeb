package Unidade3;

public class NotaAluno {
	
	double valor;
	
	//exemplo de construtor genérico
	<T extends Number>NotaAluno(T obj){  //contrutor receber o tp generico T obj
		valor = obj.doubleValue();
	}
	
	//método genérico
	<T extends Number>double retornarValor(T obj){
		return obj.doubleValue();
	}
	
	
	
	
}
