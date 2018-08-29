package controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseListenerController implements MouseListener{
	
	private JButton btnJogar;
	private JTextField txtPos0, txtPos1, txtPos2;
	private JLabel lblResultado;
	
	public MouseListenerController(JButton btnJogar, JTextField txtPos0, JTextField txtPos1, JTextField txtPos2, JLabel lblResultado) {
		this.btnJogar = btnJogar;
		this.txtPos0 = txtPos0;
		this.txtPos1 = txtPos1;
		this.txtPos2 = txtPos2;
		this.lblResultado = lblResultado;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		lblResultado.setForeground(new Color(0,0,0));
		lblResultado.setText("Espere...");
		VetorPosCacaNiquel vetPos = new VetorPosCacaNiquel(3);
		btnJogar.setVisible(false);
		ThreadNumeroCN pos0 = new ThreadNumeroCN(txtPos0, vetPos, btnJogar, lblResultado);
		pos0.start();
		ThreadNumeroCN pos1 = new ThreadNumeroCN(txtPos1, vetPos, btnJogar, lblResultado);
		pos1.start();
		ThreadNumeroCN pos2 = new ThreadNumeroCN(txtPos2, vetPos, btnJogar, lblResultado);
		pos2.start();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
