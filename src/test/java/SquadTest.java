import java.time.LocalDateTime;
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

//asserts if instances can be created succefully
  @Test
  public void squad_instantiatesCorrectly_true() {
  assertEquals(true, mSquad instanceof Squad);
  }

  @Test
  public void Name_categoryInstantiatesWithName_String() {
  assertEquals("Unbeatable", mSquad.getName());
  }
}
