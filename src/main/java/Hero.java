import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private LocalDateTime mCreatedAt;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mAge;

  //constructor
  public Hero(String name, int age) {
  mName = name;
  mAge = age;
  mCreatedAt = LocalDateTime.now();
  instances.add(this);

  }
  //implements getName()
  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
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
