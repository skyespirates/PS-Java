import java.util.*;
public class HR_PDFViewer {
  public static void main(String[] args) {
    List<Integer> h = new ArrayList<Integer>();
    String word = "zaba";
    int len = word.length();
    int max = -1;
    for(int i=0; i<len; i++) {
      int ascii = (int)word.charAt(i);
      int val = ascii - 97;
      if(h.get(val)>max) max=h.get(val);
    }
    System.out.println(len*max);
  }
}
