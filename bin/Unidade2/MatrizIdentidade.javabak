package Unidade2;

import javax.swing.JApplet;

public class MatrizIdentidade extends JApplet {

	/*3) Escrever o Applet Identidade que representa uma matriz Identidade I=3
			(apenas os valores diagonais são = 1). Todos os outros são 0.
			matriz Identidade -> os valores ficam na diagonal!         */
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		int I[][] = new int [3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i == j)              //os elementos da diagonal
					I [i][j] = 1;
				
				else
					I[i][j] = 0;
				System.out.print(I[i][j]);
			}
			System.out.println("\n===");
		}
	}
}
