package Unidade6;




import javax.swing.JOptionPane;

public class DialogApp {
    
	public static void main(String[] args) {
		//Pode desen aplicações de entrada de telas gráficas usando caixas de diálogos
		JOptionPane.showMessageDialog(null, "Iniciando a aplicação...","Instalação Concluída",
				JOptionPane.INFORMATION_MESSAGE);
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int resposta = JOptionPane.showConfirmDialog(null, "O nome "+nome+
				" foi informado. Salvar as alteraçãoes?");
		JOptionPane.showMessageDialog(null, ""+resposta);
		//if 0 ->fazer algo, 1, 2
	}
	
}
