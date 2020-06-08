package PROLAB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PROLAB.Bilgisayar;
import PROLAB.Kullanici;
import PROLAB.Bulbasaur;
import PROLAB.Butterfree;
import PROLAB.Charmander;
import PROLAB.Jigglypuff;
import PROLAB.Meowth;
import PROLAB.Pikachu;
import PROLAB.Pokemon;
import PROLAB.Psyduck;
import PROLAB.Snorlax;
import PROLAB.Squirtle;
import PROLAB.Zubat;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class KullaniciPc extends JFrame {

	private static final long serialVersionUID = 1L;
	int[] KartListesi = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	
	public Bilgisayar blgsyr = new Bilgisayar();
	public Kullanici kullanici = new Kullanici();
		
	private JPanel tahta;
	private JTextField oyuncuskoru1;
	private JTextField oyuncuskoru2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullaniciPc frame = new KullaniciPc();
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
	public KullaniciPc() {
		
		List<Pokemon> pokemonListesi = new ArrayList<Pokemon>();
		pokemonListesi.add(new Pikachu());
		pokemonListesi.add(new Bulbasaur());
		pokemonListesi.add(new Charmander());
		pokemonListesi.add(new Squirtle());
		pokemonListesi.add(new Zubat());
		pokemonListesi.add(new Psyduck());
		pokemonListesi.add(new Snorlax());
		pokemonListesi.add(new Butterfree());
		pokemonListesi.add(new Jigglypuff());
		pokemonListesi.add(new Meowth());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 649);
		tahta = new JPanel();
		tahta.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tahta);
		tahta.setLayout(null);
		
		JButton PCkart2 = new JButton("PCkart2");
		PCkart2.setIcon(new ImageIcon("/Resimler/Arka.png"));
                
		PCkart2.setBounds(150, 26, 130, 182);
		tahta.add(PCkart2);
		
		JButton PCkart1 = new JButton("PCkart1");
		PCkart1.setIcon(new ImageIcon("/Resimler/Arka.png"));
		PCkart1.setBounds(10, 26, 130, 182);
		tahta.add(PCkart1);
		
		JButton PCkart3 = new JButton("PCkart3");
		PCkart3.setIcon(new ImageIcon("/Resimler/Arka.png"));
		PCkart3.setBounds(291, 26, 130, 182);
		tahta.add(PCkart3);
		
		JButton pcKart2 = new JButton("kulKart2");
		pcKart2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pcKart2.setIcon(new ImageIcon("/Resimler/Arka.png"));
		pcKart2.setBounds(647, 373, 130, 182);
		tahta.add(pcKart2);
		
		JButton pcKart3 = new JButton("kulKart3");
		pcKart3.setIcon(new ImageIcon("/Resimler/Arka.png"));
		pcKart3.setBounds(787, 373, 130, 182);
		tahta.add(pcKart3);
		
		JButton pcKart1 = new JButton("kulKart1");
		pcKart1.setIcon(new ImageIcon("/Resimler/Arka.png"));
		pcKart1.setBounds(507, 373, 130, 182);
		tahta.add(pcKart1);
		
		JButton ortadaki1 = new JButton("ortadaki1");
		ortadaki1.setIcon(new ImageIcon("/Resimler/Arka.png"));
		ortadaki1.setBounds(291, 251, 130, 182);
		tahta.add(ortadaki1);
		
		JButton ortadaki2 = new JButton("ortadaki2");
		ortadaki2.setIcon(new ImageIcon("/Resimler/Arka.png"));
		ortadaki2.setBounds(383, 211, 130, 182);
		tahta.add(ortadaki2);
		
		JButton ortadaki3 = new JButton("ortadaki3");
		ortadaki3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ortadaki3.setIcon(new ImageIcon("/Resimler/Arka.png"));
		ortadaki3.setBounds(466, 157, 130, 182);
		tahta.add(ortadaki3);
		
		JButton ortadaki4 = new JButton("ortadaki4");
		ortadaki4.setIcon(new ImageIcon("/Resimler/Arka.png"));
		ortadaki4.setBounds(535, 113, 130, 182);
		tahta.add(ortadaki4);
		
		JLabel lbloyuncubilgisayar = new JLabel("1.OYUNCU:B\u0130LG\u0130SAYAR");
		lbloyuncubilgisayar.setForeground(Color.RED);
		lbloyuncubilgisayar.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbloyuncubilgisayar.setBounds(113, 0, 213, 23);
		tahta.add(lbloyuncubilgisayar);
		
		JLabel lbloyuncubilgisayar_1 = new JLabel("2.OYUNCU:KULLANICI");
		lbloyuncubilgisayar_1.setForeground(Color.BLUE);
		lbloyuncubilgisayar_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbloyuncubilgisayar_1.setBounds(611, 344, 213, 19);
		tahta.add(lbloyuncubilgisayar_1);
		/******************************************** KART DAGITMA ********************************************************************/
		JButton Dagitma = new JButton("KARTLARI DA\u011EIT");
		Dagitma.setForeground(Color.MAGENTA);
		Dagitma.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Dagitma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Kart cekmek ile beraber 3+2
				int i = 0;
				while (i < 5) {
					kartUret(blgsyr);
					kartUret2(kullanici);
					i++;
				}
				
				System.out.println(blgsyr.getKartListesi().toString());
				System.out.println(kullanici.getKartListesi().toString());
			}
		});
		Dagitma.setBounds(733, 12, 184, 21);
		tahta.add(Dagitma);
		/*****************************************************************************************************************************/
		/******************************************** KART CEVIRME *******************************************************************/
		JButton Cevirme = new JButton("KARTLARI \u00C7EV\u0130R");
		Cevirme.setForeground(Color.ORANGE);
		Cevirme.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cevirme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PCkart1.setIcon(new ImageIcon(
						"/Resimler/" + kullanici.getKartListesi().get(0) + ".png"));

				/*****************/
				PCkart2.setIcon(new ImageIcon(
						"/Resimler/" + kullanici.getKartListesi().get(1) + ".png"));
				
				/*****************/
				PCkart3.setIcon(new ImageIcon(
						"/Resimler/" + kullanici.getKartListesi().get(2) + ".png"));
			}
		});
		Cevirme.setBounds(733, 43, 184, 21);
		tahta.add(Cevirme);
		/*****************************************************************************************************************************/
		JLabel lbloyuncununSkoru = new JLabel("1.OYUNCUNUN SKORU");
		lbloyuncununSkoru.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbloyuncununSkoru.setBounds(20, 230, 138, 13);
		tahta.add(lbloyuncununSkoru);
		
		oyuncuskoru1 = new JTextField();
		oyuncuskoru1.setBounds(160, 227, 39, 19);
		tahta.add(oyuncuskoru1);
		oyuncuskoru1.setColumns(10);
		
		JLabel lblOyuncununSkoru = new JLabel("2. OYUNCUNUN SKORU");
		lblOyuncununSkoru.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblOyuncununSkoru.setBounds(507, 595, 142, 13);
		tahta.add(lblOyuncununSkoru);
		
		oyuncuskoru2 = new JTextField();
		oyuncuskoru2.setBounds(657, 592, 45, 19);
		tahta.add(oyuncuskoru2);
		oyuncuskoru2.setColumns(10);
		
		
		JButton btnNewButton = new JButton("1.Kart Se\u00E7imi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kullanicinin random dagitilan 3 kart arasindan secebilecegi ilk kart
				pcKart1.setIcon(new ImageIcon(
						"/Resimler/" + blgsyr.getKartListesi().get(0) + ".png"));
				kontrolYap(pokemonListesi.get(kullanici.getKartListesi().get(0)),
						pokemonListesi.get(blgsyr.getKartListesi().get(0)));
				skorYaz();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(517, 565, 97, 21);
		tahta.add(btnNewButton);
		
		JButton btnkartSeimi = new JButton("2.Kart Se\u00E7imi");
		btnkartSeimi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kullanicinin random dagitilan 3 kart arasindan secebilecegi ikinci kart
				pcKart2.setIcon(new ImageIcon(
						"/Resimler/" + blgsyr.getKartListesi().get(1) + ".png"));
				kontrolYap(pokemonListesi.get(kullanici.getKartListesi().get(1)),
						pokemonListesi.get(blgsyr.getKartListesi().get(1)));
				skorYaz();
			}
		});
		btnkartSeimi.setForeground(Color.BLACK);
		btnkartSeimi.setBackground(Color.WHITE);
		btnkartSeimi.setBounds(657, 565, 97, 21);
		tahta.add(btnkartSeimi);
		
		JButton btnkartSeimi_1 = new JButton("3.Kart Se\u00E7imi");
		btnkartSeimi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kullanicinin random dagitilan 3 kart arasindan secebilecegi ucuncu kart
				pcKart3.setIcon(new ImageIcon(
						"/Resimler/" + blgsyr.getKartListesi().get(2) + ".png"));
				kontrolYap(pokemonListesi.get(kullanici.getKartListesi().get(2)),
						pokemonListesi.get(blgsyr.getKartListesi().get(2)));
				skorYaz();
			}
		});
		btnkartSeimi_1.setForeground(Color.BLACK);
		btnkartSeimi_1.setBackground(Color.WHITE);
		btnkartSeimi_1.setBounds(797, 565, 97, 21);
		tahta.add(btnkartSeimi_1);
		
		JButton btnkartekme = new JButton("1.KART \u00C7EKME");
		btnkartekme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ortadaki2.setIcon(new ImageIcon(
						"/Resimler/" + kullanici.getKartListesi().get(3) + ".png"));
				ortadaki1.setIcon(new ImageIcon(
						"/Resimler/" + blgsyr.getKartListesi().get(3) + ".png"));
				kontrolYap(pokemonListesi.get(kullanici.getKartListesi().get(3)),
						pokemonListesi.get(blgsyr.getKartListesi().get(3)));
				skorYaz();
			}
		});
		btnkartekme.setForeground(new Color(255, 153, 0));
		btnkartekme.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnkartekme.setBounds(92, 313, 155, 21);
		tahta.add(btnkartekme);
		
		JButton btnkartekme_1 = new JButton("2.KART \u00C7EKME");
		btnkartekme_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ortadaki4.setIcon(new ImageIcon(
						"/Resimler/" + kullanici.getKartListesi().get(4) + ".png"));
				ortadaki3.setIcon(new ImageIcon(
						"/Resimler/" + blgsyr.getKartListesi().get(4) + ".png"));
				kontrolYap(pokemonListesi.get(kullanici.getKartListesi().get(4)),
						pokemonListesi.get(blgsyr.getKartListesi().get(4)));
				skorYaz();
				
				if(blgsyr.getOyuncununSkoru()<kullanici.getOyuncununSkoru()) {
					Kazanan tahta = new Kazanan();
					tahta.setVisible(true);
				
				}
				
				else if(blgsyr.getOyuncununSkoru()>kullanici.getOyuncununSkoru()) {
					Kazanan2 tahta = new Kazanan2();
					tahta.setVisible(true);
				}
				else {
					Beraber tahta = new Beraber();
					tahta.setVisible(true);
				}
			}
		});
		btnkartekme_1.setForeground(new Color(255, 153, 0));
		btnkartekme_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnkartekme_1.setBounds(92, 344, 155, 21);
		tahta.add(btnkartekme_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\earth\\Desktop\\Images\\background.jpg"));
		label.setBounds(0, 0, 927, 608);
		tahta.add(label);
	}
		
	public void skorYaz() {
		oyuncuskoru2.setText(String.valueOf(blgsyr.getOyuncununSkoru()));
		oyuncuskoru1.setText(String.valueOf(kullanici.getOyuncununSkoru()));
	}
	
	public void kontrolYap(Pokemon result, Pokemon result2) {
		if (result2.hasarPuaniGoster() > result.hasarPuaniGoster()) {
			blgsyr.setOyuncununSkoru(blgsyr.getOyuncununSkoru() + 5);
		} else if (result2.hasarPuaniGoster() == result.hasarPuaniGoster()) {
			kullanici.setOyuncununSkoru(kullanici.getOyuncununSkoru() + 0);
		} else {
			kullanici.setOyuncununSkoru(kullanici.getOyuncununSkoru() + 5);
		}
	}
	/************************************* TEKRARSIZ RANDOM SAYI URETME **************************************************/
	//10 adet random sayi uretilmesi
	public int sayiUret() {
		Random sonuc = new Random();
		return sonuc.nextInt(10);
	}
	
	public void kartUret(Bilgisayar oyn1) {
		boolean b = true;
		int sayac=0;
		while(true) {
			if(b==false) {//deger yanlissa donguye girme
				break;
			}
			int sonuc = sayiUret();//deger dogruysa donguye gir ve random sayi uret
			for(int i=0;i<10;i++) {//10 kart icerisinden secilecek
				if(KartListesi[i] == sonuc ) {//kart listesindeki i degeri random sayiya esitse
					oyn1.kartSec(sonuc);
					KartListesi[i] = -1;//i degerine -1 koyarak tekrar etmesi engellenir
					b = false;
				}else {
					sayac++;
				}
			}
			if(sayac==10) {
				sonuc = sayiUret();
			}
		}	
	}

	public void kartUret2(Kullanici oyn2) {
		boolean b = true;
		int sayac=0;
		while(true) {
			if(b==false) {
				break;
			}
			int sonuc = sayiUret();
			for(int i=0;i<10;i++) {
				if(KartListesi[i] == sonuc ) {
					oyn2.kartSec(sonuc);
					KartListesi[i] = -1;
					b = false;
				}else {
					sayac++;
				}
			}
			if(sayac==10) {
				sonuc = sayiUret();
			}
		}	
		
	}
}
