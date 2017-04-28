import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  // public void mHero = new Hero {"Immortals", 29, "sing"}

//confirm we can successfully instantiate Squad objects
  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Immortals", 29);
    assertEquals(true, myHero instanceof Hero);
  }
//ensure we can assign hero a name and retrive it
  @Test
  public void Hero_instantiatesWithName_String() {
    Hero myHero = new Hero("Immortals", 29);
    assertEquals("Immortals", myHero.getName());
  }

  //ensure we can assign hero an age and retrive it
    @Test
    public void Age_instantiatesWithAge_Integer() {
      Hero myHero = new Hero("Immortal", 29);
      assertEquals(29, myHero.getAge());
    }

  //automatically records date and time hero was entered
  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Hero myHero = new Hero("Immortals", 29);
    assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getCreatedAt().getDayOfWeek());
  }

  //Retrives all instances of a class
  @Test
  public void all_returnsAllInstancesOfHero_true() {
    Hero heroOne = new Hero("Mortals", 29);
    Hero heroTwo = new Hero("Immortals", 29);
    assertEquals(true, Hero.all().contains(heroOne));
    assertEquals(true, Hero.all().contains(heroTwo));
  }

  //empties the instances ArrayList
  @Test
  public void clear_emptiesAllHerosFromArrayList_0() {
  Hero myHero = new Hero("Immortals", 29);
  Hero.clear();
  assertEquals(Hero.all().size(), 0);
}
}
