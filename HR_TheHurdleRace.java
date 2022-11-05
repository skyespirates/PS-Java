import java.util.List;
import java.util.ArrayList;

public class HR_TheHurdleRace {
  public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
      int len = height.size();
      int max = height.get(0);
      for(int i=1; i<len; i++) {
          if(max<height.get(i)) max=height.get(i);
      }
      if(max>k) return max-k;
      return 0;
    }
  public static void main(String[] args) {
    List<Integer> height = new ArrayList<Integer>();
    height.add(1);
    height.add(6);
    height.add(3);
    height.add(5);
    height.add(2);
    System.out.println(hurdleRace(4, height));
  }
}
