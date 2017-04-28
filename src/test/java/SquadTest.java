import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {
  private Squad mSquad;
  @Before
  public void instantiate() {
    mSquad = new Squad("Unbeatable");
  }
  @After
 public void tearDown() {
   Hero.clear();
 }

  @Test
  public void squad_instantiatesCorrectly_true() {
  assertEquals(true, mSquad instanceof Squad)
  }
}
