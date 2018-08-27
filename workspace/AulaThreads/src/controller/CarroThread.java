package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CarroThread extends Thread{
	
	private JLabel lblCarro;
	private int dstMax, vlMax; 
	private JTextField venc;
	private JTextField perd;
	private String nome;
	private JButton btnCorrer;
	public String rival;
	
	public CarroThread(JLabel lblCarro, int dstMax, int vlMax, JTextField vencedor, JTextField perdedor, String nome, JButton btnCorrer) {
		this.lblCarro = lblCarro;
		this.dstMax = (dstMax - 100);
		this.vlMax = vlMax;
		this.perd = perdedor;
		this.venc = vencedor;
		this.nome = nome;
		this.btnCorrer = btnCorrer;
	}
	
	public void run() {
		correr();
	}
	
	
	public void correr() {
		Rectangle percurso = lblCarro.getBounds();
		int vlAtual;
		while(percurso.x < dstMax) {
			vlAtual = (int)((Math.random()*(vlMax+1)));
			if((percurso.x + vlAtual) > dstMax) {
				lblCarro.setBounds(dstMax, percurso.y, percurso.width, percurso.height);
			}else {
				lblCarro.setBounds(percurso.x + vlAtual, percurso.y, percurso.width, percurso.height);
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			percurso = lblCarro.getBounds();
		}
		if(venc.getText().isEmpty()) {
			if(nome.equals("Carro 1")) {
				venc.setText(nome);
				perd.setText("Carro 2");
			}else {
				venc.setText(nome);
				perd.setText("Carro 1");
			}
			btnCorrer.setVisible(true);
		}
	}
}
