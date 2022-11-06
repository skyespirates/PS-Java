public class LC_Maximum69Number {
  public static void main(String[] args) {
    int n = 9996;
    int div = 1000;
    int currentDigit, currentValue=n;
    for(int i=0; i<4; i++) {
      currentDigit = currentValue / div;
      if(currentDigit==6) {
        n += 3*div;
        break;
      }
      currentValue %= div;
      div /= 10;
    }
    System.out.println(n);
  }
}