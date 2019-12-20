package Unidade2;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Avaliacao extends JApplet {

	/* 2) Escrever o Applet Avaliacao que lê uma nota (0 a 100) e imprime o conceito associado.
	[90,100] “Excelente” 			[70,90[ “Bom”
	[50, 70[ “Regular” 				[0,50[ “Insuficiente”                  
	     */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g) {
		String notas = JOptionPane.showInputDialog("Informe a nota: ");
		// para conversão de string para ponto flutuante:
		float nota = Float.parseFloat(notas);
		
		if(nota < 0 || nota > 100){
			JOptionPane.showMessageDialog(null, "Nota inválida! Favor informar nota de 0 a 100" );
			paint(null);
		}else{
			if(nota < 50){
				JOptionPane.showMessageDialog(null, "Insuficiente!" );
			}
			else if(nota < 70){
				JOptionPane.showMessageDialog(null, "Regular!" );
			}
			else if(nota < 90){
				JOptionPane.showMessageDialog(null, "Bom!" );
			}
			else{
				JOptionPane.showMessageDialog(null, "Excelente!!" );
				
				//para parar a app
				System.exit(0);
			}
		}
	}

}
