package Unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppv2 {
	
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(new FileReader("C:/Users/wagne/eclipse-workspace/CursoJava2Disciplina/src/Unidade2/numeros.txt"));
			double soma = 0;
			String valor;
			while(entrada.hasNext()){// enquanto houver elementos no arq txt
				
				valor = entrada.next();//ler os elementos
				soma = soma + Double.parseDouble(valor); // passa o valor lido para o soma
			}
			entrada.close();
			JOptionPane.showMessageDialog(null, "A soma dos valores eh: "+ soma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ler do arquivo e nao do teclado
	}
}
