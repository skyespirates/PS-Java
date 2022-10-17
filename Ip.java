import java.util.Arrays;

public class Ip {
  public static void main(String args[]) {
    int n=4;
    int[] arr={1,2,3,4,5,6,7,8};
    int[] cpy=Arrays.copyOfRange(arr, n, 2*n);
    for(int e:cpy) {
      System.out.println(e);
    }
  }
}
