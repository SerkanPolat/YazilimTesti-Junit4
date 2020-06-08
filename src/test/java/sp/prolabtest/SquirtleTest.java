
package sp.prolabtest;

import PROLAB.Squirtle;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SquirtleTest {
    
    public SquirtleTest() {
    }
    
    static Squirtle squirtle;
     @BeforeClass
    public static void setUpBefore() {
        squirtle = new Squirtle();
    }

    @AfterClass
    public static void tearDownAfter() {
        squirtle  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(squirtle.isKartKullanildiMi());
        
        squirtle.setKartKullanildiMi(true);
        Assert.assertTrue(squirtle.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        
        assertEquals(30,squirtle.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        squirtle.setPokemonID(58);
        
        assertEquals(58,squirtle.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        squirtle.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    squirtle.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        squirtle.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    squirtle.getPokemonTipi().toCharArray());
        
        
    }
}
