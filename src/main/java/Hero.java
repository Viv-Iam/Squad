import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private LocalDateTime mCreatedAt;
  private static List<Task> instances = new ArrayList<Task>();


  public Hero(String name) {
  mName = name;
  mCreatedAt = LocalDateTime.now();

  }
  public String getName() {
    return mName;
  }
  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

}
