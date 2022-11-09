import java.util.Scanner;
public class SPOJ_Wow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String res = "";
    for(int i=0; i<n; i++) {
      res += "o";
    }
    System.out.println("W"+res+"w");
  }
}
