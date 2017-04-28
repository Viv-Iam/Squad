import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

//confirm we can successfully instantiate Squad objects
  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Immortals");
    assertEquals(true, myHero instanceof Hero);
  }

  @Test
  public void Hero_instantiatesWithName_String() {
    Hero myHero = new Hero("Immortals");
    assertEquals("Immortals", myHero.getName());
  }

  //automatically records date and time hero was entered
  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Hero myHero = new Hero("Immortals");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getCreatedAt().getDayOfWeek());
  }
}
