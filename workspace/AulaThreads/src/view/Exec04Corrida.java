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
import javax.swing.ImageIcon;
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
		setBounds(100, 100, 567, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon carro = new ImageIcon("camaro_2d.png");
		carro.setImage(carro.getImage().getScaledInstance(50, 30, 100));
		JLabel lblCarro = new JLabel(carro);
		lblCarro.setForeground(Color.RED);
		lblCarro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarro.setBounds(72, 57, 77, 34);
		contentPane.add(lblCarro);
		
		ImageIcon carro_2 = new ImageIcon("carro_vermelho_2d.png");
		carro_2.setImage(carro_2.getImage().getScaledInstance(50, 30, 100));
		JLabel lblCarro_2 = new JLabel(carro_2);
		lblCarro_2.setForeground(Color.BLUE);
		lblCarro_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarro_2.setBounds(72, 115, 77, 34);
		contentPane.add(lblCarro_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(72, 104, 437, 2);
		contentPane.add(separator);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCarro.setBounds(38, 57, 77, 34);
				lblCarro_2.setBounds(38, 115, 77, 34);
				txtPerdedor.setText("");
				txtVencedor.setText("");
				int vl = 60;
				btnCorrer.setVisible(false);
				Thread carro1 = new CarroThread(lblCarro, getWidth(), vl, txtVencedor, txtPerdedor, "Carro 1", btnCorrer);
				Thread carro2 = new CarroThread(lblCarro_2, getWidth(), vl, txtVencedor, txtPerdedor, "Carro 2", btnCorrer);
				carro1.start();
				carro2.start();
			}
		});
		btnCorrer.setBounds(67, 308, 99, 25);
		contentPane.add(btnCorrer);
		
		txtPerdedor = new JTextField();
		txtPerdedor.setEditable(false);
		txtPerdedor.setBounds(425, 309, 116, 22);
		contentPane.add(txtPerdedor);
		txtPerdedor.setColumns(10);
		
		txtVencedor = new JTextField();
		txtVencedor.setEditable(false);
		txtVencedor.setColumns(10);
		txtVencedor.setBounds(425, 274, 116, 22);
		contentPane.add(txtVencedor);
		
		JLabel lblVencedor = new JLabel("Vencedor :");
		lblVencedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVencedor.setBounds(347, 277, 77, 16);
		contentPane.add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Perdedor :");
		lblPerdedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPerdedor.setBounds(347, 312, 77, 16);
		contentPane.add(lblPerdedor);
		
		JLabel lblCarro_1 = new JLabel("Carro 1:");
		lblCarro_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCarro_1.setBounds(12, 57, 77, 16);
		contentPane.add(lblCarro_1);
		
		JLabel lblCarro_3 = new JLabel("Carro 2:");
		lblCarro_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCarro_3.setBounds(12, 115, 77, 16);
		contentPane.add(lblCarro_3);
	}
}
