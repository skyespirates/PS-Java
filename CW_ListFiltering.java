import java.util.List;
import java.util.ArrayList;
public class CW_ListFiltering {
  public static void main(String[] args) {
    List<Object> list=new ArrayList<Object>();
    list.add(1);
    list.add("a");
    list.add(2);
    list.add("b");
    for (Object e : list) {
        if(e.getClass().getName() == "java.lang.String") {
          continue;
        } else {
          System.out.println((int)e);
        }
    }
  }
}
