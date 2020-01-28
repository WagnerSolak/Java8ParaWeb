package Unidade5;

@FunctionalInterface
public interface Formula {
	
	//exemplo de interface funcional -> só pode ter um método abstrato
	double calcular();
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	
	//quando vamos até a classe Calculadora e implementamos Formula, apenas o método calcular é implementado
	//haja vista que o default não é necessário implementação por causa da palavra reservada default
}
