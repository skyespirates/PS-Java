import java.util.Scanner;

/*
Program untuk menampilkan pola perkalian
input: 4
1 2 3 4
2 4 5 8
3 6 9 12
4 8 12 16
*/


public class Perkalian {
  public static void main(String args[]) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=n; j++) {
        System.out.print(i*j + " ");
      }
      System.out.print("\n");
    }
    obj.close();
  }
}
