import java.util.*;

public class HR_BetweenTwoSets {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>();
    a.add(2);
    a.add(4);
    List<Integer> b = new ArrayList<Integer>();
    b.add(16);
    b.add(32);
    b.add(96);
    
    int count = 0;

    for(int i=Collections.max(a, null); i<=Collections.min(b, null); i++) {
      boolean isFactorMultiple = true;
      for(int j : a) {
        if(i%j!=0) {
          isFactorMultiple = false;
          break;
        }
      }
      for(int k : b) {
        if(k%i!=0) {
          isFactorMultiple = false;
          break;
        }
      }
      if(isFactorMultiple) count++;
    }
    System.out.println(count);

  }
}
