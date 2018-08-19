package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class MainExc1 {

	public static void main(String[] args) {
		RedesController redes = new RedesController();
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Menu\n\n"
					+ " 1 - IP's\n"
					+ " 2 - Tempo médio de Ping\n"
					+ " 9 - SAIR"));
			switch(opc) {
				case 1:
					redes.ip();
					break;
				case 2:
					redes.ping();
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida !!!");
			}
		}while(opc!=9);
	}

}
