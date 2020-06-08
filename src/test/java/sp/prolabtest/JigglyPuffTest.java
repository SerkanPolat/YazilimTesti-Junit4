package sp.prolabtest;

import PROLAB.Jigglypuff;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JigglyPuffTest {
    
    public JigglyPuffTest() {
    }
    
    static Jigglypuff jigglypuff;
     @BeforeClass
    public static void setUpBefore() {
        jigglypuff = new Jigglypuff();
    }

    @AfterClass
    public static void tearDownAfter() {
        jigglypuff  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(jigglypuff.isKartKullanildiMi());
        
        jigglypuff.setKartKullanildiMi(true);
        Assert.assertTrue(jigglypuff.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        
        assertEquals(70,jigglypuff.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        jigglypuff.setPokemonID(58);
        
        assertEquals(58,jigglypuff.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        jigglypuff.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    jigglypuff.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        jigglypuff.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    jigglypuff.getPokemonTipi().toCharArray());
        
        
    }
}
