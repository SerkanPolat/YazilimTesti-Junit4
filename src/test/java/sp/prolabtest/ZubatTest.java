package sp.prolabtest;

import PROLAB.Zubat;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ZubatTest {
    
    public ZubatTest() {
    }
    
    static Zubat zubat;
     @BeforeClass
    public static void setUpBefore() {
        zubat = new Zubat();
    }

    @AfterClass
    public static void tearDownAfter() {
        zubat  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(zubat.isKartKullanildiMi());
        
        zubat.setKartKullanildiMi(true);
        Assert.assertTrue(zubat.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        
        assertEquals(50,zubat.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        zubat.setPokemonID(58);
        
        assertEquals(58,zubat.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        zubat.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    zubat.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        zubat.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    zubat.getPokemonTipi().toCharArray());
        
        
    }
}
