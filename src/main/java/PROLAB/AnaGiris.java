package PROLAB;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
//import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class AnaGiris extends JFrame {

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
					AnaGiris frame = new AnaGiris();
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
	public AnaGiris() {
		
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 559);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPressStart = new JButton("PRESS START");
		btnPressStart.setForeground(SystemColor.windowBorder);
		btnPressStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KullanciSecim frm2 = new KullanciSecim();
				frm2.setVisible(true);
					
			}
		});
		btnPressStart.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btnPressStart.setBackground(new Color(255, 102, 0));
		btnPressStart.setBounds(305, 401, 158, 41);
		contentPane.add(btnPressStart);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\earth\\Desktop\\Images\\anasf.jpg"));
		lblNewLabel_1.setBounds(0, 0, 730, 522);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 45, 13);
		contentPane.add(label);
	}
}
