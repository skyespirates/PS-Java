public class LC_LeetcodeBank {
  public static void main(String[] args) {
    int n = 20;
    int init = 1;
    int sum = 0;
    for(int i=1, value=1; i<=n; i++, value++) {
      if(i%8==0) {
        init++;
        value = init;
      }
      // sum += value;
      System.out.println(value);
    }
    // System.out.println(sum);
  }
}
