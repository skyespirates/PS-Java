public class CW_SquareEveryDigit {
  public static void main(String[] args) {
    int num=9119;
    if(num>0) {
      String res="";
      while(num>0) {
        int temp=num%10;
        temp*=temp;
        res=temp+res;
        num/=10;
      }
      System.out.println(res);
    } else {
      System.out.println(0);
    }
  }
}
