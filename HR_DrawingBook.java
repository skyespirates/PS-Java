import java.util.*;

public class HR_DrawingBook {
  public static void main(String[] args) {
    String[] ltr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int[] size = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for(int i=0; i<26; i++) {
      map.put(ltr[i], size[i]);
    }
    String word = "zaba";
    int len = word.length();
    String[] words = word.split("");
    int max = 0;
    for(String e : words) {
      if(max<map.get(e)) max = map.get(e);
    }
    System.out.println(len*max);
  }
}
