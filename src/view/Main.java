package view;

import javax.swing.JOptionPane;
import controller.ChocolateController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, vol;
		String options[] = {"Adicionar barra de chocolate", "Calcular quantidade de doces", "Sair"};
		String[] faixasVolume = {
			    "entre 50 e 60 cm3",
			    "entre 100 e 110 cm3",
			    "entre 150 e 165 cm3",
			    "entre 200 e 220 cm3",
			    "entre 260 e 280 cm3"
			};
		int[] volPesoMap = {60, 115, 160, 215, 280};

		ChocolateController chocolate = new ChocolateController();
		while(true) {
			op = JOptionPane.showOptionDialog(null, 
					"Escolha uma opção:", 
					null, 
					0, 
					0, 
					null, 
					options, 
					null);
			switch(op) {
			case 0:
				int op2 = JOptionPane.showOptionDialog(null, 
						"Escolha uma opção:", 
						null, 
						0, 
						0, 
						null, 
						faixasVolume, 
						null);
				try {
					chocolate.add(volPesoMap[op2]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 1:
				chocolate.calcular();
				break;
			case JOptionPane.CLOSED_OPTION:
			case 2:
				System.exit(0);
				break;
			}
		}
	}

}
