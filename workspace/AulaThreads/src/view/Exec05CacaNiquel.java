package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MouseListenerController;
import controller.ThreadNumeroCN;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exec05CacaNiquel extends JFrame {

	private JPanel contentPane;
	private JTextField txtPos0;
	private JTextField txtPos1;
	private JTextField txtPos2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exec05CacaNiquel frame = new Exec05CacaNiquel();
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
	public Exec05CacaNiquel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPos0 = new JTextField();
		txtPos0.setHorizontalAlignment(SwingConstants.CENTER);
		txtPos0.setText("0");
		txtPos0.setFont(new Font("Tahoma", Font.BOLD, 51));
		txtPos0.setEnabled(false);
		txtPos0.setBounds(93, 63, 77, 104);
		contentPane.add(txtPos0);
		txtPos0.setColumns(10);
		
		txtPos1 = new JTextField();
		txtPos1.setText("0");
		txtPos1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPos1.setFont(new Font("Tahoma", Font.BOLD, 51));
		txtPos1.setEnabled(false);
		txtPos1.setColumns(10);
		txtPos1.setBounds(182, 63, 77, 104);
		contentPane.add(txtPos1);
		
		txtPos2 = new JTextField();
		txtPos2.setText("0");
		txtPos2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPos2.setFont(new Font("Tahoma", Font.BOLD, 51));
		txtPos2.setEnabled(false);
		txtPos2.setColumns(10);
		txtPos2.setBounds(271, 63, 77, 104);
		contentPane.add(txtPos2);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblResultado.setBounds(93, 25, 255, 25);
		contentPane.add(lblResultado);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addMouseListener(new MouseListenerController(btnJogar, txtPos0, txtPos1, txtPos2, lblResultado));
		btnJogar.setBounds(93, 190, 255, 38);
		contentPane.add(btnJogar);
		
	}
}
