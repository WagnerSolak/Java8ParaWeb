package Unidade3;

public class ExemploGenerics<T> { //tipo T passa por parametro e não informou o tipo
	
	T obj; // passa por tempo de código argumento T e chama de obj

	public ExemploGenerics(T obj) {
		super();
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	// criar metodo para retornar informações deste objeto]
	public void showType(){
		System.out.println(obj.getClass().getName());
	}


}
