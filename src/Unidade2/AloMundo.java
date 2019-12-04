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
		g.drawRect(0, 0, 150, 150);
		g.setColor(Color.CYAN);
		g.setFont(new Font("Times New Roman", Font.BOLD,16));
		g.drawString("Alo Mundo", 20, 20);
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
	
	 /*  Para rodar a classe: Run As >  Java Applet                                                         */
    /*	 Para criar esta classe:                                                                           */
   /*    Superclass retira-se: java.lang.Object informa JApplet > Brownser seleciona JApplet - javax.swing*/
	
	
	
	
}
