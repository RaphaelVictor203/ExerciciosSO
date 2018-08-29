package controller;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadNumeroCN extends Thread{
	
	private JTextField txtNumero;
	private VetorPosCacaNiquel vetPos;
	private JButton btnJogar;
	private JLabel lblResultado;
	
	public ThreadNumeroCN(JTextField txtNumero, VetorPosCacaNiquel vetPos, JButton btnJogar, JLabel lblResultado) {
		this.txtNumero = txtNumero;
		this.vetPos = vetPos;
		this.btnJogar = btnJogar;
		this.lblResultado = lblResultado;
	}
	
	public void run() {
		rodar();
	}
	
	public void rodar() {
		int numero = 0;
		int rodadas = (int)((Math.random())*150)+1;
		int mls = 0;
		for(int i=1; i<=rodadas; i++) {
			numero = (int)((Math.random())*7)+1;
			txtNumero.setText(Integer.toString(numero));
			try {
				sleep(mls);
				mls += 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		vetPos.insert(numero);
		if(vetPos.checaTermino()) {
			btnJogar.setVisible(true);
			if(vetPos.ganhou()) {
				lblResultado.setForeground(new Color(0,255,127));
				lblResultado.setText("Ganhou :)");
			}else {
				lblResultado.setForeground(new Color(255,0,0));
				lblResultado.setText("Perdeu :|");
			}
		}
		
	}
	
}
