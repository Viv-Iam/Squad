import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private LocalDateTime mCreatedAt;
  private static List<Hero> instances = new ArrayList<Hero>();
  private Integer mAge;

  //constructor
  public Hero(String name, Integer age) {
  mName = name;
  mCreatedAt = LocalDateTime.now();
  instances.add(this);

  }
  //implements getName()
  public String getName() {
    return mName;
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
