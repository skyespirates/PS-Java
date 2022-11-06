public class LC_SumBaseConversion {
  public static void main(String[] args) {
    int n=10, k=10;
    int sisa, sum = 0;
    while(n>0) {
      sisa = n%k;
      n /= k;
      sum += sisa;
    }
    System.out.println(sum);
  }
}
