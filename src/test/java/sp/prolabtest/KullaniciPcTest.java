package sp.prolabtest;

import PROLAB.Bilgisayar;
import PROLAB.Kullanici;
import PROLAB.KullaniciPc;
import PROLAB.Pokemon;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;


public class KullaniciPcTest {
    
    public KullaniciPcTest() {
    }
    KullaniciPc kullanicipc;
     
   
    @BeforeClass
    public static void setUpBefore() {
    }
    @AfterClass
    public static void tearDownAfter() {
    }
    
    @Before
    public void setUp() throws Exception {
        kullanicipc = new KullaniciPc();
        
    }
    @Test
    public void kontrolYapTest(){
        
        Pokemon poke = Mockito.mock(Pokemon.class);
        Mockito.when(poke.hasarPuaniGoster()).thenReturn(250);
        
        Pokemon poke2 = Mockito.mock(Pokemon.class);
        Mockito.when(poke2.hasarPuaniGoster()).thenReturn(150);
        
       int Kullanici1Puan = kullanicipc.kullanici.getOyuncununSkoru();
       int Kullanici2Puan = kullanicipc.blgsyr.getOyuncununSkoru();
       
        kullanicipc.kontrolYap(poke2, poke);
        Assert.assertEquals(Kullanici1Puan+5, kullanicipc.blgsyr.getOyuncununSkoru(),0);
        
        
        kullanicipc.kontrolYap(poke, poke2);
        Assert.assertEquals(Kullanici1Puan+5, kullanicipc.kullanici.getOyuncununSkoru(),0);
        
        kullanicipc.kontrolYap(poke, poke);
        Assert.assertEquals(Kullanici1Puan+5, kullanicipc.kullanici.getOyuncununSkoru(),0);
        Assert.assertEquals(Kullanici2Puan+5, kullanicipc.blgsyr.getOyuncununSkoru(),0);
        
       
    }
    @Test
    public void kartUretTest(){
        
      
        Bilgisayar blg = new Bilgisayar();
        kullanicipc.kartUret(blg);
        Assert.assertEquals(blg.getKartListesi().size(),1,0);
    }
    @Test
    public void kartUret2Test(){
        Kullanici klc = new Kullanici();
        kullanicipc.kartUret2(klc);
        Assert.assertEquals(klc.getKartListesi().size(), 1,0);
    }
    @Test
    public void SayiUretTest(){
        Assert.assertNotNull(kullanicipc.sayiUret());
    }

}
