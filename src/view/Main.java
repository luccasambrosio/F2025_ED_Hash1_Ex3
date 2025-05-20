package view;

import javax.swing.JOptionPane;

import controller.Apartamento;
import controller.ChocolateController;
import model.Morador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, vol, id;
		String options[] = {"Adicionar barra de chocolate", "Calcular quantidade de doces", "Remover barra de chocolate", "Listar barras de chocolate", "Sair"};
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
				vol = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume da barra de chocolate"));
				System.out.println(ChocolateController.add(vol));
				break;
			case 1:
				ChocolateController.calcular();
				break;
			case 2:
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do chocolate a ser removido"));
				try {
					ChocolateController.remove(id);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				ChocolateController.list();
				break;
			case JOptionPane.CLOSED_OPTION:
			case 4:
				System.exit(0);
				break;
			}
		}
	}

}
