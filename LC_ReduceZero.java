public class LC_ReduceZero {
  public static void main(String[] args) {
    int num = 123;
    int count = 0;
    while(num > 0) {
      if(num%2 == 0) {
        count++;
        num /= 2;
      } else {
        count++;
        num -= 1;
      }
    }
    System.out.println(count);
  }
}
