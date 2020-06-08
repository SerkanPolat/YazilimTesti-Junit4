
package sp.prolabtest;

import PROLAB.Psyduck;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PsyduckTest {
    static Psyduck psyduck;
    public PsyduckTest() {
    }
    
     @BeforeClass
    public static void setUpBefore() {
        psyduck = new Psyduck();
    }

    @AfterClass
    public static void tearDownAfter() {
        psyduck  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(psyduck.isKartKullanildiMi());
        
        psyduck.setKartKullanildiMi(true);
        Assert.assertTrue(psyduck.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        assertEquals(20,psyduck.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        psyduck.setPokemonID(58);
        
        assertEquals(58,psyduck.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        psyduck.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    psyduck.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        psyduck.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    psyduck.getPokemonTipi().toCharArray());
        
        
    }
}
