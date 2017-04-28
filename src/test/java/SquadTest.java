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

//ensure we can assign squad a name and retrive it
  @Test
  public void Name_categoryInstantiatesWithName_String() {
  assertEquals("Unbeatable", mSquad.getName());
  }

//Retrives all instances of a class
  @Test
 public void all_returnsAllInstancesOfSquad_true() {
   Squad squadOne = new Squad("Unbeatable");
   Squad squadTwo = new Squad("Beatable");
   assertEquals(true, Squad.all().contains(squadOne));
   assertEquals(true, Squad.all().contains(squadTwo));
 }

//empties the instances ArrayList
 @Test
  public void clear_emptiesAllSquadsFromList_0() {
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }

  @Test
  public void getId_categoriesInstantiateWithAnId_1() {
    assertEquals(1, mSquad.getId());
  }
}
