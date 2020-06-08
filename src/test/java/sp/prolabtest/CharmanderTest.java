package sp.prolabtest;

import PROLAB.Charmander;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharmanderTest {
    static Charmander charmander;
    public CharmanderTest() {
        
    }
    
    
     @BeforeClass
    public static void setUpBefore() {
        charmander = new Charmander();
    }
    
    @AfterClass
    public static void tearDownAfter() {
        charmander  = null;
    }
    
    @Test
    public void isKartKullanildiMiTest(){
        Assert.assertFalse(charmander.isKartKullanildiMi());
        
        charmander.setKartKullanildiMi(true);
        Assert.assertTrue(charmander.isKartKullanildiMi());
    } 
    
    @Test
    public void hasarPuaniTest(){
        
        assertEquals(60,charmander.hasarPuaniGoster(),0);
    }
    @Test
    public void PokemonIdTest(){
        charmander.setPokemonID(58);
        
        assertEquals(58,charmander.getPokemonID(),0);
    }
    @Test
    public void PokemonAdiTest(){
        charmander.setPokemonAdi("TestPokemon");
        
        Assert.assertArrayEquals("TestPokemon".toCharArray(),
                                    charmander.getPokemonAdi().toCharArray());
    }
    @Test
    public void PokemonTipTest(){
        
        charmander.setPokemonTipi("TestTipi");
        Assert.assertArrayEquals("TestTipi".toCharArray(),
                                    charmander.getPokemonTipi().toCharArray());
        
        
    }
}
