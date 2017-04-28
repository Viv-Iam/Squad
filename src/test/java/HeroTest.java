import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  private Hero mHero;
  @Before
  public void instantiate() {
    mHero = new Hero("Immortals", 29, "sing", "weak");
  }
  @After
 public void tearDown() {
   Hero.clear();
 }
//confirm we can successfully instantiate Squad objects
  @Test
  public void Hero_instantiatesCorrectly_true() {
    assertEquals(true, mHero instanceof Hero);
  }
//ensure we can assign hero a name and retrive it
  @Test
  public void Hero_instantiatesWithName_String() {
    assertEquals("Immortals", mHero.getName());
  }

  //ensure we can assign hero an age and retrive it
    @Test
    public void Age_instantiatesWithAge_Integer() {
      assertEquals(29, mHero.getAge());
    }

    //ensure we can assign hero a special power and retrive it
    @Test
    public void Spower_instantiatesWithSpower_String() {
      assertEquals("sing", mHero.getSpower());
    }
    @Test
    public void Weakness_instantiatesWithWeakness_String() {
      assertEquals("weak", mHero.getWeakness());
    }

  //automatically records date and time hero was entered
  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    assertEquals(LocalDateTime.now().getDayOfWeek(), mHero.getCreatedAt().getDayOfWeek());
  }

  //Retrives all instances of a class
  @Test
  public void all_returnsAllInstancesOfHero_true() {
    Hero heroOne = new Hero("Mortals", 29, "sing", "weak");
    Hero heroTwo = new Hero("Immortals", 29, "sing", "weak");
    assertEquals(true, Hero.all().contains(heroOne));
    assertEquals(true, Hero.all().contains(heroTwo));
  }

  //empties the instances ArrayList
  @Test
  public void clear_emptiesAllHerosFromArrayList_0() {
  Hero.clear();
  assertEquals(Hero.all().size(), 0);
}

//ensure we can assign hero a unique id's
@Test
public void getId_herosInstantiateWithAnID_1() {
  // Hero.clear();  // Remember, the test will fail without this line! We need to empty leftover Heros from previous tests!
  assertEquals(1, mHero.getId());
}
}
