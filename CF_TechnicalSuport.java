import java.util.Scanner;
public class CF_TechnicalSuport {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
      int m = sc.nextInt();
      String ch = sc.next();
      int count = 0;
      for(int j=0; j<m; j++) {
        if(ch.charAt(j)=='Q') count++;
        else count--;
      }
      if(count>0) System.out.println("No");
      else System.out.println("Yes");
    }
  }
}
