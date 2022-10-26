import java.util.Scanner;
public class LongWords {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    for(int i=0; i<n; i++) {
      String str=obj.next();
      int len=str.length();
      if(len<=10) {
        System.out.println(str);
      } else {
        System.out.println(str.charAt(0)+""+(len-2)+str.charAt(len-1));
      }
    }
  }
}
