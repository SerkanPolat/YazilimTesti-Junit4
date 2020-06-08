package sp.prolabtest;

import PROLAB.Bulbasaur;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BulbasaurTest {
    
    public BulbasaurTest() {
    }
    
    static Bulbasaur bulbasaur;
     @BeforeClass
    public static void setUpBefore() {
        bulbasaur = new Bulbasaur();
    }

    @AfterClass
    public static void tearDownAfter() {
        bulbasaur  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(bulbasaur.isKartKullanildiMi());
        
        bulbasaur.setKartKullanildiMi(true);
        Assert.assertTrue(bulbasaur.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        
        assertEquals(50,bulbasaur.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        bulbasaur.setPokemonID(58);
        
        assertEquals(58,bulbasaur.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        bulbasaur.setPokemonAdi("TestPokemon");
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    bulbasaur.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        bulbasaur.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    bulbasaur.getPokemonTipi().toCharArray());
        
        
    }
}
