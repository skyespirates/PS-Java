public class LC_ObtainZero {
  public static void main(String[] args) {
    int num1=3, num2=1;
    int count = 0;
    while(num1>0&&num2>0) {
      if(num1>num2) num1-=num2;
      else num2-=num1;
      count++;
    }
    System.out.println(count);
  }
}
