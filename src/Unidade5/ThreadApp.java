package Unidade5;

public class ThreadApp {
	
	public static void main(String[] args) {
		//exemplo de código usando um objeto anônimo, passando como arg uma instancia de thrread passando um metodo static
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i <=1000; i++)
					System.out.println(i);
			}
			
		};
		new Thread(r).start();
	}
	
}
