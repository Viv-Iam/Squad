import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

//confirm we can successfully instantiate Squad
  @Test
  public void Squad_instantiatesCorrectly_true() {
    Squad mySquad = new Squad("Immortals");
    assertEquals(true, mySquad instanceof Squad);
  }
}
