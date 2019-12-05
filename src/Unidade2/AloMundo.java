package Unidade2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class AloMundo extends JApplet {
	/* 1) Escrever o Applet AloMundo e implementar os métodos do seu Ciclo de Vida.                        */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		System.out.println("Inicializando...");
	}
	
	@Override
	public void paint(Graphics g) {
	
		g.setColor(Color.BLUE);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		this.setBackground(Color.GREEN);
		this.setSize(400, 100);
		g.drawString("Versão JVM: " +System.getProperty("java.version"), 20, 20);
		g.drawString("Versão S.O: " +System.getProperty("os.name"), 50, 50);
		
		
		//g.drawRect(0, 0, 150, 150);
		//g.setColor(Color.CYAN);
		//g.setFont(new Font("Times New Roman", Font.BOLD,16));
		//g.drawString("Alo Mundo", 20, 20);
	}
	
	@Override
	public void start() {
		System.out.println("Executando...");
	}
	
	@Override
	public void stop() {
		System.out.println("Parando...");
	}
	
	@Override
	public void destroy() {
		System.out.println("Eliminando...");
	}
	
	
	/*1) Escrever no método paint() do Applet AloMundo as propriedades do
		computador (versão da JVM e do Sistema operacional) em que o mesmo está sendo executado.
		- Obs: A cor de fundo do applet deverá ser verde; a cor da fonte do texto deverá ser azul; e a fonte Times New Roman 30 Bold.
		- Dica: use a classe System e os métodos setBackground(...), setColor(...) e setFont(...), respectivamente. 
	 */
	 /*  Para rodar a classe: Run As >  Java Applet                                                         */
    /*	 Para criar esta classe:                                                                           */
   /*    Superclass retira-se: java.lang.Object informa JApplet > Brownser seleciona JApplet - javax.swing*/
	
	
	
	
}
