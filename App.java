import java.util.Scanner;

/*
 * 
 *  Program untuk membuat pola
 * 
 *  input: 4
 *  1***
 *  12**
 *  123*
 *  1234
 *  
 */

public class App {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      try {
        int n = obj.nextInt();
        for(int i=1; i<=n; i++) {
          for(int j=1; j<=n; j++) {
            if(j<=i) {
              System.out.print(j);
            } else {
              System.out.print("*");
            }
          }
          System.out.println("\n");
      }
    } finally {
      obj.close();
    }


    }
}
