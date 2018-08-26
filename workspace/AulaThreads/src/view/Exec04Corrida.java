package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CarroThread;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exec04Corrida extends JFrame {

	private JPanel contentPane;
	private JTextField txtPerdedor;
	private JTextField txtVencedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exec04Corrida frame = new Exec04Corrida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exec04Corrida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarro = new JLabel("Carro_1");
		lblCarro.setForeground(Color.RED);
		lblCarro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarro.setBounds(38, 75, 77, 16);
		contentPane.add(lblCarro);
		
		JLabel lblCarro_2 = new JLabel("Carro_2");
		lblCarro_2.setForeground(Color.BLUE);
		lblCarro_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarro_2.setBounds(38, 115, 77, 16);
		contentPane.add(lblCarro_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 104, 437, 2);
		contentPane.add(separator);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCarro.setBounds(38, 75, 77, 16);
				lblCarro_2.setBounds(38, 115, 77, 16);
				txtPerdedor.setText("");
				txtVencedor.setText("");
				int vl = 50;
				btnCorrer.setVisible(false);
				Thread carro1 = new CarroThread(lblCarro, getWidth(), vl, txtVencedor, txtPerdedor, "Carro 1", btnCorrer);
				carro1.start();
				Thread carro2 = new CarroThread(lblCarro_2, getWidth(), vl, txtVencedor, txtPerdedor, "Carro 2", btnCorrer);
				carro2.start();
			}
		});
		btnCorrer.setBounds(33, 308, 99, 25);
		contentPane.add(btnCorrer);
		
		txtPerdedor = new JTextField();
		txtPerdedor.setEditable(false);
		txtPerdedor.setBounds(391, 309, 116, 22);
		contentPane.add(txtPerdedor);
		txtPerdedor.setColumns(10);
		
		txtVencedor = new JTextField();
		txtVencedor.setEditable(false);
		txtVencedor.setColumns(10);
		txtVencedor.setBounds(391, 274, 116, 22);
		contentPane.add(txtVencedor);
		
		JLabel lblVencedor = new JLabel("Vencedor :");
		lblVencedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVencedor.setBounds(313, 277, 77, 16);
		contentPane.add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Perdedor :");
		lblPerdedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPerdedor.setBounds(313, 312, 77, 16);
		contentPane.add(lblPerdedor);
	}
}
