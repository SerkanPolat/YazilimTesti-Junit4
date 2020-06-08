package PROLAB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class KullanciSecim extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullanciSecim frame = new KullanciSecim();
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
	public KullanciSecim() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KULLANICI SEC\u0130M\u0130\r\n");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(108, 0, 211, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Kullan\u0131c\u0131 vs Bilgisayar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KullaniciPc tahta = new KullaniciPc();
				tahta.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setBounds(0, 457, 211, 57);
		contentPane.add(btnNewButton);
		
		JButton btnBilgisayarVsBilgisayar = new JButton("Bilgisayar vs Bilgisayar ");
		btnBilgisayarVsBilgisayar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				PcPc tahta = new PcPc();
				tahta.setVisible(true);
				
							}
		});
		btnBilgisayarVsBilgisayar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnBilgisayarVsBilgisayar.setBackground(Color.CYAN);
		btnBilgisayarVsBilgisayar.setBounds(249, 457, 203, 57);
		contentPane.add(btnBilgisayarVsBilgisayar);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\earth\\Downloads\\JavaPokemonGameImages\\Pokemon.PNG"));
		lblNewLabel_1.setBounds(0, 0, 452, 514);
		contentPane.add(lblNewLabel_1);
	}
}
