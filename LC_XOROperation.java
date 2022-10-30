public class LC_XOROperation {
  public static void main(String[] args) {
    int n = 5;
    int start = 0;
    int res = 0;
    for(int i=0; i<n; i++) {
      res ^= start+2*i;
    }
    System.out.println(res);
  }
}
