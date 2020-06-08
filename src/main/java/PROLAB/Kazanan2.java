package PROLAB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Kazanan2 extends JFrame {

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
					Kazanan2 frame = new Kazanan2();
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
	public Kazanan2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKullancKazand = new JLabel("KULLANICI KAZANDI!");
		lblKullancKazand.setForeground(new Color(0, 0, 0));
		lblKullancKazand.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKullancKazand.setHorizontalAlignment(SwingConstants.CENTER);
		lblKullancKazand.setBounds(10, 10, 249, 78);
		contentPane.add(lblKullancKazand);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\earth\\Desktop\\Images\\kazanan.jpg"));
		lblNewLabel.setBounds(0, 0, 436, 263);
		contentPane.add(lblNewLabel);
	}
}
