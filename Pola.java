import java.util.Scanner;

/*
 * Program untuk menampilkan pola segitiga siku-siku
 * titik siku berada di kanan bawah
 * 
 * input: 4
 *     *
 *    **
 *   ***
 *  ****
 * 
 */

public class Pola {
  public static void main(String args[]) {
    Scanner obj=new Scanner(System.in);

    int n=obj.nextInt();
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        if(i+j>=n-1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }

    obj.close();
  }
}
