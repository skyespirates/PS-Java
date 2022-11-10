import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HR_TheHurdleRace {
  public static void main(String[] args) {
    List<Integer> height = new ArrayList<Integer>();
    int k = 4;
    height.add(1);
    height.add(6);
    height.add(3);
    height.add(5);
    height.add(2);
    int diff = Collections.max(height) - k;
    if(diff<0) System.out.println(0);
    else System.out.println(diff);
  }
}
