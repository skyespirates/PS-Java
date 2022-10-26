import java.util.Scanner;
public class Kangaroo {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int x1=scan.nextInt();
    int v1=scan.nextInt();
    int x2=scan.nextInt();
    int v2=scan.nextInt();
    String res="NO";
    for(int i=0; i<10000; i++) {
      x1+=v1;
      x2+=v2;
      if(x1==x2) {
        res="YES";
        break;
      }
    }
    System.out.println(res);
  }
}
