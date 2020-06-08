package sp.prolabtest;

import PROLAB.Butterfree;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ButterFreeTest {
    static Butterfree snorlax;
    public ButterFreeTest() {
    }
    
    
     @BeforeClass
    public static void setUpBefore() {
        snorlax = new Butterfree();
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
        snorlax.setHasarPuani(58);
        assertEquals(58,snorlax.hasarPuaniGoster(),0);
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
