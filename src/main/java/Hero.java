import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private LocalDateTime mCreatedAt;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mAge;
  private String mSpower;

  //constructor
  public Hero(String name, int age, String spower) {
  mName = name;
  mAge = age;
  mSpower = spower;
  mCreatedAt = LocalDateTime.now();
  instances.add(this);

  }
  //implements getName()
  public String getName() {
    return mName;
  }
  //implements getAge()
  public int getAge() {
    return mAge;
  }
  //implements getSpower()
  public String getSpower() {
    return mSpower;
  }
  //implements getCreatedAt()
  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }
  //implements all()
  public static List<Hero> all() {
    return instances;
  }
  //implements clear()
  public static void clear() {
  instances.clear();
}

}
