package sp.prolabtest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({SnorlaxTest.class, ZubatTest.class, PikachuTest.class
                    ,BulbasaurTest.class,ButterFreeTest.class,CharmanderTest.class
                    ,MeowthTest.class,JigglyPuffTest.class,PikachuTest.class
                    ,PsyduckTest.class,SquirtleTest.class})
public class PokemonTestSuite {
    
}
