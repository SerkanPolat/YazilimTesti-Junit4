package PROLAB;

import java.util.List;

public class Bilgisayar extends Oyuncu implements IOyuncu{
    
    public Bilgisayar(){
        super();
		super.setOyuncuAdi("Bilgisayar");
		super.setOyuncununSkoru(0);
    }
    
    public Bilgisayar(int oyuncuID,String oyuncuAdi,int oyuncununSkoru){
        super(oyuncuID,oyuncuAdi,oyuncununSkoru);
        super.setOyuncuID(11);
	    super.setOyuncuAdi("Bilgisayar");
	    super.setOyuncununSkoru(0);
    }

    @Override
	public void kartSec(int kartId) {
		// TODO Auto-generated method stub
		List<Integer> kartListesii = getKartListesi();
		kartListesii.add(kartId);
		super.setKartListesi(kartListesii);
	}
    

	@Override
	public List<Integer> getKartListesi() {
		// TODO Auto-generated method stub
		return super.getKartListesi();
	}

	@Override
	public void setKartListesi(List<Integer> kartListesi) {
		// TODO Auto-generated method stub
		super.setKartListesi(kartListesi);
	}

	@Override
	public int getOyuncuID() {
		// TODO Auto-generated method stub
		return super.getOyuncuID();
	}

	@Override
	public void setOyuncuID(int oyuncuID) {
		// TODO Auto-generated method stub
		super.setOyuncuID(oyuncuID);
	}

	@Override
	public String getOyuncuAdi() {
		// TODO Auto-generated method stub
		return super.getOyuncuAdi();
	}

	@Override
	public void setOyuncuAdi(String oyuncuAdi) {
		// TODO Auto-generated method stub
		super.setOyuncuAdi(oyuncuAdi);
	}

	@Override
	public int getOyuncununSkoru() {
		// TODO Auto-generated method stub
		return super.getOyuncununSkoru();
	}

	@Override
	public void setOyuncununSkoru(int oyuncununSkoru) {
		// TODO Auto-generated method stub
		super.setOyuncununSkoru(oyuncununSkoru);
	}

	@Override
	public int skorGoster() {
		// TODO Auto-generated method stub
		return super.skorGoster();
	}

	@Override
	public String toString() {
		return "Bilgisayar [getKartListesi()=" + getKartListesi() + ", getOyuncuID()=" + getOyuncuID()
				+ ", getOyuncuAdi()=" + getOyuncuAdi() + ", getOyuncununSkoru()=" + getOyuncununSkoru()
				+ ", skorGoster()=" + skorGoster() + "]";
	}

     
}
