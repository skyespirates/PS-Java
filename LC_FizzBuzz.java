import java.util.*;
public class LC_FizzBuzz {
  public static void main(String[] args) {
    List<String> result = new ArrayList<String>();
    for(int i=1; i<=5; i++) {
      if(i%3==0&&i%5==0) {
        result.add("FizzBuzz");
      } else if(i%3==0) {
        result.add("Fizz");
      } else if(i%5==0) {
        result.add("Buzz");
      } else {
        result.add(String.valueOf(i));
      }
    }
    for(String e : result) {
      System.out.println(e);
    }
  }
}
