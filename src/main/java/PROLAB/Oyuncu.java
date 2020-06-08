package PROLAB;

import java.util.ArrayList;
import java.util.List;

public abstract class Oyuncu {
	private int oyuncuID;
    private String oyuncuAdi;
    private int oyuncununSkoru;
    
  //private int[] kartListesi = new int[5];
  	private List<Integer> kartListesi = new ArrayList<Integer>();
  	
  	
  	public List<Integer> getKartListesi() {
  		return kartListesi;
  	}

  	public void setKartListesi(List<Integer> kartListesi) {
  		this.kartListesi = kartListesi;
  	}

  	public Oyuncu() {
  		super();
  	}

//  	public int[] getKartListesi() {
//  		return kartListesi;
//  	}
//
//  	public void setKartListesi(int[] kartListesi) {
//  		this.kartListesi = kartListesi;
//  	}

  	public Oyuncu(int oyuncuID, String oyuncuAdi, int oyuncununSkoru) {
  		super();
  		this.oyuncuID = oyuncuID;
  		this.oyuncuAdi = oyuncuAdi;
  		this.oyuncununSkoru = oyuncununSkoru;
  	}
  	
  	public int getOyuncuID() {
  		return oyuncuID;
  	}

  	public void setOyuncuID(int oyuncuID) {
  		this.oyuncuID = oyuncuID;
  	}

  	public String getOyuncuAdi() {
  		return oyuncuAdi;
  	}

  	public void setOyuncuAdi(String oyuncuAdi) {
  		this.oyuncuAdi = oyuncuAdi;
  	}

  	public int getOyuncununSkoru() {
  		return oyuncununSkoru;
  	}

  	public void setOyuncununSkoru(int oyuncununSkoru) {
  		this.oyuncununSkoru = oyuncununSkoru;
  	}
  	public int skorGoster() {
  		return this.oyuncununSkoru;
  	}
}
