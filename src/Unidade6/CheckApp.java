package Unidade6;

import java.awt.Checkbox;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class CheckApp {

	public static void main(String[] args) {
		JFrame f = new JFrame("Aplicação");
		f.setSize(350, 250);
		Container cont = f.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(new Checkbox("1-Sim"));
		cont.add(new Checkbox("2-Não"));
		f.setVisible(true);
		
	}
}
