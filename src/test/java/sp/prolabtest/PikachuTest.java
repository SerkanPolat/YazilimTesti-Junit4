
package sp.prolabtest;

import PROLAB.Pikachu;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PikachuTest {
    static Pikachu pikachu;
    public PikachuTest() {
    }
    
     @BeforeClass
    public static void setUpBefore() {
        pikachu = new Pikachu();
    }
    
    @AfterClass
    public static void tearDownAfter() {
        pikachu  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(pikachu.isKartKullanildiMi());
        
        pikachu.setKartKullanildiMi(true);
        Assert.assertTrue(pikachu.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        assertEquals(40,pikachu.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        pikachu.setPokemonID(58);
        
        assertEquals(58,pikachu.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        pikachu.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    pikachu.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        pikachu.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    pikachu.getPokemonTipi().toCharArray());
        
        
    }
}
