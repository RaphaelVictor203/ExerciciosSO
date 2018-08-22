package view;

import javax.swing.JOptionPane;

import controller.ProcessController;

public class MainExc2 {

	public static void main(String[] args) {
		ProcessController pro = new ProcessController();
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"MENU:                                 "+pro.retornaSO()+"\n\n"
					+ " 1 - Listar processos;\n"
					+ " 2 - Matar processo;\n"
					+ " 9 - Sair;"));
			switch(opc){
				case 1:
					JOptionPane.showMessageDialog(null, pro.listaProcessos(pro.retornaSO()));
					break;
				case 2:
					String kill = JOptionPane.showInputDialog("Insira o nome ou o PID do processo que deseja matar:");
					try {
						pro.killProcess(pro.retornaSO(), Integer.parseInt(kill));
						JOptionPane.showMessageDialog(null, "Processo morto");
					}catch(NumberFormatException e) {
						pro.killProcess(pro.retornaSO(), kill );
						JOptionPane.showMessageDialog(null, "Processo morto");
					}
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida !!!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}while(opc != 9);
	}

}
