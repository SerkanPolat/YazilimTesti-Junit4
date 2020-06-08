
package sp.prolabtest;

import PROLAB.Snorlax;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SnorlaxTest {
    public SnorlaxTest() {
    }
    
    static Snorlax snorlax;
     @BeforeClass
    public static void setUpBefore() {
        snorlax = new Snorlax();
    }

    @AfterClass
    public static void tearDownAfter() {
        snorlax  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(snorlax.isKartKullanildiMi());
        
        snorlax.setKartKullanildiMi(true);
        Assert.assertTrue(snorlax.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        
        assertEquals(30,snorlax.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        snorlax.setPokemonID(58);
        
        assertEquals(58,snorlax.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        snorlax.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    snorlax.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        snorlax.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    snorlax.getPokemonTipi().toCharArray());
        
        
    }
}
