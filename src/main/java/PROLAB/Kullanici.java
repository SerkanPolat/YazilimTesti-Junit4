package PROLAB;
import java.util.List;

public class Kullanici extends Oyuncu implements IOyuncu{
    
    public Kullanici(){
    	super();
		super.setOyuncuID(12);
		super.setOyuncununSkoru(0);
    }
    
    public Kullanici(int oyuncuID,String oyuncuAdi,int oyuncununSkoru){
        super(oyuncuID,oyuncuAdi,oyuncununSkoru);
		super.setOyuncuID(12);
		super.setOyuncununSkoru(0);
    }
    
    @Override
	public void kartSec(int kartId) {
		List<Integer> result = getKartListesi();
		result.add(kartId);
		super.setKartListesi(result);
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
		return "Kullanici [getOyuncuID()=" + getOyuncuID() + ", getOyuncuAdi()=" + getOyuncuAdi()
				+ ", getOyuncununSkoru()=" + getOyuncununSkoru() + ", skorGoster()=" + skorGoster() + "]";
	}
  
  
}

