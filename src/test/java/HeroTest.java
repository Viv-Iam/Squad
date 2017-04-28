import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

//confirm we can successfully instantiate Squad objects
  @Test
  public void Name_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Immortals");
    assertEquals(true, myHero instanceof Hero);
  }
//ensure we can assign hero a name and retrive it
  @Test
  public void Name_instantiatesWithName_String() {
    Hero myHero = new Hero("Immortals");
    assertEquals("Immortals", myHero.getName());
  }

  //ensure we can assign hero a name and retrive it
    @Test
    public void Age_instantiatesWithAge_Integer() {
      Hero myHero = new Hero(29);
      assertEquals(29, myHero.getAge());
    }

  //automatically records date and time hero was entered
  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Hero myHero = new Hero("Immortals");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getCreatedAt().getDayOfWeek());
  }

  //Retrives all instances of a class
  @Test
  public void all_returnsAllInstancesOfHero_true() {
    Hero heroOne = new Hero("Mortals");
    Hero heroTwo = new Hero("Immortals");
    assertEquals(true, Hero.all().contains(heroOne));
    assertEquals(true, Hero.all().contains(heroTwo));
  }

  //empties the instances ArrayList
  @Test
  public void clear_emptiesAllHerosFromArrayList_0() {
  Hero myHero = new Hero("Immortals");
  Hero.clear();
  assertEquals(Hero.all().size(), 0);
}
}
