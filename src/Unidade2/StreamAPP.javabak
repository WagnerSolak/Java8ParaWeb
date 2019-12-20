package Unidade2;

import java.io.FileInputStream;


public class StreamAPP {
	
	public static void byteStream() throws Exception{
		//Leu arquivo
		FileInputStream entrada = new FileInputStream("C:/Users/wagne/eclipse-workspace/CursoJava2Disciplina/src/Unidade2/dados.txt"); 
		
		//cria um contador
		int contador = 0;
		
		while((entrada.read()) != -1)
			contador++;
		System.out.println("Nr. de carateres eh: "+contador);
		entrada.close();
	}
	
	public static void caracterStream(char letra)throws Exception{
		//Leu arquivo
				FileInputStream entrada = new FileInputStream("C:/Users/wagne/eclipse-workspace/CursoJava2Disciplina/src/Unidade2/dados.txt"); 
				
				//cria um contador
				int contador = 0;
				int c;
				while((c = entrada.read()) != -1){
					if(c == letra)
						contador++;
				}
					
				System.out.println("Nr. de vezes que a letra 'A' aparece no texto eh: carateres eh: "+contador);
				entrada.close();
	}
	
	public static void main(String[] args) {
		try {
			//byteStream(); exercicio 1)
			//Exercicio 2)
			System.out.println("Informar a letra a ser encontrada:");
			char letra = (char) System.in.read();
			caracterStream(letra);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/*
	1) Escrever a classe StreamApp que leia uma arquivo texto (dados.txt) e informe na tela o número de 
	caracteres totais existentes nesse arquivo.
	
	2) Na classe StreamApp, criar um método para contar o número de vezes que um determinado caracter 
	(por exemplo ‘a’), informado pelo usuário em tempo de execução, aparece no arquivo texto (dados.txt).*/


}
