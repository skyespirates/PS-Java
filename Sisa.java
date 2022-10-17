import java.util.Scanner;

/*
 * Program untuk menentukan apakah bilangan ketiga dari urutan tiga bilangan
 * merupakan hasil bagi dua bilangan yang di depan
 * contoh pada urutan a b c = 4 3 2
 * apakah 2 merupakan hasil dari 4%3
 * jika benar increment counter jika salah continue
 * 
 */

public class Sisa {
  public static void main(String args[]) {
    Scanner sken = new Scanner(System.in);
    int n=sken.nextInt();
    int count=0;
    try {
      for(int i=0; i<n; i++) {
        int a=sken.nextInt();
        int b=sken.nextInt();
        int c=sken.nextInt();
        if(a==0||b==0) continue;
        if(a%b==c) count++;
      }
    } finally {
      sken.close();
    }
    System.out.println(count);
  }
}
