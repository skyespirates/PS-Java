import java.util.*;

public class HR_SalesByMatch {
  public static void main(String[] args) {
    List<Integer> ar = new ArrayList<Integer>();
    ar.add(1);
    ar.add(2);
    ar.add(1);
    ar.add(2);
    ar.add(1);
    ar.add(3);
    ar.add(2);
    
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for(int el : ar) {
      if(!count.containsKey(el)) {
        count.put(el, 1);
      } else {
        count.put(el, count.get(el)+1);
      }
    }

    int result = 0;
    for(Map.Entry entry : count.entrySet()) {
      int temp = (int)entry.getValue()/2;
      result += temp;
    }
    System.out.println(result);
  }
}
