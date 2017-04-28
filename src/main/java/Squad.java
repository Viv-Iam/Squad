import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Squad {
private String mName;
private static List<Squad> instances = new ArrayList<Squad>();
private int mId;

public Squad(String name) {
  mName = name;
  //add comes before mId
  instances.add(this);
  mId = instances.size();

}

//implements getName()
public String getName() {
  return mName;
}

//implements all()
public static List<Squad> all() {
   return instances;
 }
//implements clear()
 public static void clear() {
   instances.clear();
 }

 public int getId() {
   return mId;
 }
}
