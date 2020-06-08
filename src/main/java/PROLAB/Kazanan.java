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

public class Kazanan extends JFrame {

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
					Kazanan frame = new Kazanan();
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
	public Kazanan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBilgisayarKazand = new JLabel("B\u0130LG\u0130SAYAR KAZANDI!");
		lblBilgisayarKazand.setIcon(new ImageIcon("C:\\Users\\earth\\Desktop\\Images\\bilg-icon.png"));
		lblBilgisayarKazand.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblBilgisayarKazand.setHorizontalAlignment(SwingConstants.CENTER);
		lblBilgisayarKazand.setBounds(55, 73, 322, 127);
		contentPane.add(lblBilgisayarKazand);
	}
}
