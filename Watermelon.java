import java.util.Scanner;

public class Watermelon {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    if(n==2) {
      System.out.println("NO");
    } else if(n%2==0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
