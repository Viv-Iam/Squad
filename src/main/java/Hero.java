import java.time.LocalDateTime;

public class Hero {
  private String mName;
  private LocalDateTime mCreatedAt;

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
