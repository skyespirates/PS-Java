public class LC_Maximum69Number {
  public static void main(String[] args) {
    int n = 9669;
    int j = 1000;
    int val = n;
    for(int i=0; i<3; i++) {
      val /= j;
      if(val==6) {
        n = n+3*j;
        break;
      }
      val %= j;
      j /= 10;
    }
    System.out.println(n);
  }
}