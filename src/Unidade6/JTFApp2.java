package Unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFApp2 /*extends JFrame implements ActionListener*/{ //eventListener será associada de outra forma

	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Primeira Aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JTextField tf = new JTextField("Digite aqui...");
		
		//tratamento usando lambda
		tf.addActionListener(ev->{
			JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
		});
		cont.add(tf, BorderLayout.NORTH);
		frame.setVisible(true);
	}

	/*@Override
	public void actionPerformed(ActionEvent evento) {
		//mostrar o que foi selecionado
		JOptionPane.showConfirmDialog(null, evento.getActionCommand().toString());
		
	}*/
}
