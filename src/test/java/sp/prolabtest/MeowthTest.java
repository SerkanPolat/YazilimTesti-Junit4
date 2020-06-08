
package sp.prolabtest;

import PROLAB.Meowth;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MeowthTest {
    
    public MeowthTest() {
    }
    
    static Meowth meowth;
     @BeforeClass
    public static void setUpBefore() {
        meowth = new Meowth();
    }

    @AfterClass
    public static void tearDownAfter() {
        meowth  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(meowth.isKartKullanildiMi());
        
        meowth.setKartKullanildiMi(true);
        Assert.assertTrue(meowth.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        
        assertEquals(40,meowth.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        meowth.setPokemonID(58);
        
        assertEquals(58,meowth.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        meowth.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    meowth.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        meowth.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    meowth.getPokemonTipi().toCharArray());
        
        
    }
}
