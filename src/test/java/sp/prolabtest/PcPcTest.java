package sp.prolabtest;

import PROLAB.Bilgisayar;
import PROLAB.Kullanici;
import PROLAB.PcPc;
import PROLAB.Pokemon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class PcPcTest {
    
    public PcPcTest() {
    }
    
     static PcPc pcpc;
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
     @BeforeClass
    public static void setUpBefore() {
    }

    @Before
    public void setUp() throws Exception {
        pcpc = new PcPc();
        
    }
    @Test
    public void kontrolYapTest(){
        
        Pokemon poke = Mockito.mock(Pokemon.class);
        Mockito.when(poke.hasarPuaniGoster()).thenReturn(20);
        
        Pokemon poke2 = Mockito.mock(Pokemon.class);
        Mockito.when(poke2.hasarPuaniGoster()).thenReturn(75);
        
       int Kullanici1Puan = pcpc.kullanici.getOyuncununSkoru();
       int Kullanici2Puan = pcpc.blgsyr.getOyuncununSkoru();
       
        pcpc.kontrolYap(poke, poke2);
        Assert.assertEquals(Kullanici1Puan+5, pcpc.blgsyr.getOyuncununSkoru(),0);
        
        pcpc.kontrolYap(poke2, poke);
        Assert.assertEquals(Kullanici1Puan+5, pcpc.kullanici.getOyuncununSkoru(),0);
        
        pcpc.kontrolYap(poke, poke);
        Assert.assertEquals(Kullanici1Puan+5, pcpc.kullanici.getOyuncununSkoru(),0);
        Assert.assertEquals(Kullanici2Puan+5, pcpc.blgsyr.getOyuncununSkoru(),0);
        
       
    }
    @Test
    public void kartUretTest(){
        
      
        Bilgisayar blg = new Bilgisayar();
        pcpc.kartUret(blg);
        Assert.assertEquals(blg.getKartListesi().size(),1,0);
    }
    @Test
    public void kartUret2Test(){
        Kullanici klc = new Kullanici();
        pcpc.kartUret2(klc);
        Assert.assertEquals(klc.getKartListesi().size(), 1,0);
    }
    @Test
    public void SayiUretTest(){
        Assert.assertNotNull(pcpc.sayiUret());
    }
}
