import java.math.MathContext;

public class LC_NumberCommonFactors {
  public static void main(String[] args) {
    int a=12, b=6;
    int min = Math.min(a, b);
    int count = 0;
    for(int i=1; i<=min; i++) {
      if(a%i==0&&b%i==0) count++;
    }
    System.out.println(count);
  }
}
