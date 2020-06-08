package sp.prolabtest;

import PROLAB.Bilgisayar;
import java.util.ArrayList;
import java.util.Random;
import org.junit.*;
import org.junit.Test;

public class BilgisayarTest {
    
    static Bilgisayar bilgisayar;
    
    public BilgisayarTest() {
    }
    @BeforeClass
    public static void setUpBefore(){
        bilgisayar = new Bilgisayar();
        bilgisayar.setKartListesi(new ArrayList<Integer>());
    }
    @AfterClass
    public static void tearDownAfter() {
        bilgisayar = null;
    }
    @Test 
    public void getKartListesiTest(){
        
        Assert.assertNotNull(bilgisayar.getKartListesi());
        
    }
    @Test
    public void KartSecTest(){
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for(var item : bilgisayar.getKartListesi()){
            liste.add(item);
        }
        
        Random rnd = new Random();
        int id = rnd.nextInt();
        bilgisayar.kartSec(id);
        liste.add(id);
        
        Assert.assertArrayEquals(bilgisayar.getKartListesi().toArray(), liste.toArray());
        
    }
    @Test
    public void OyuncuIdTest(){
        
        Random rnd = new Random();
        int id = rnd.nextInt();
        bilgisayar.setOyuncuID(id);
        Assert.assertEquals(id, bilgisayar.getOyuncuID(), 0);
        
    }
    @Test
    public void OyuncuAdiTest(){
        
        bilgisayar.setOyuncuAdi("OyuncuTest");
        Assert.assertArrayEquals(bilgisayar.getOyuncuAdi().toCharArray(),
                "OyuncuTest".toCharArray());
    }
    @Test
    public void OyucununSkoruTest(){
        
        Random rnd = new Random();
        int sayi = rnd.nextInt();
        
        bilgisayar.setOyuncununSkoru(sayi);
        Assert.assertEquals(bilgisayar.getOyuncununSkoru(),sayi,0);
    }
    
}
