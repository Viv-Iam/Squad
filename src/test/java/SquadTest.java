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
   Squad.clear();
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

  //assigns our squads unique id attributes
  @Test
  public void getId_categoriesInstantiateWithAnId_1() {
    assertEquals(1, mSquad.getId());
  }

  //locates specific squad using unique id
  @Test
   public void find_returnsSquadWithSameId_squadTwo() {
     Squad squadOne = new Squad("Home");
     Squad squadTwo = new Squad("Work");
     assertEquals(Squad.find(squadTwo.getId()), squadTwo);
   }

   //makes squad instantiate with empty task list
   @Test
   public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
  assertEquals(0, mSquad.getHeroes().size());
}

//allows adding of Heroes to a Squad
@Test
public void addHero_addsHeroToList_true() {
Hero hero = new Hero("Immortal", 29, "spower", "weakness");
mSquad.addHero(hero);
assertTrue(mSquad.getHeroes().contains(hero));
}

}
