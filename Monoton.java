import java.util.Scanner;

// Program untuk menentukan jenis sekuens


public class Monoton {
  public static void main(String args[]) {
    Scanner obj=new Scanner(System.in);
    long a=obj.nextLong();
    long b=obj.nextLong();
    long c=obj.nextLong();
    long d=obj.nextLong();

    String var="";

    if(a==b&&b==c&&c==d) {
      var="KONSTAN";
    } else if(a<=b&&b<=c&&c<=d) {
      var="MONOTON MENAIK";
    } else if(a>=b&&b>=c&&c>=d) {
      var="MONOTON MENURUN";
    } else {
      var="TIDAK MONOTON";
    }

    System.out.println(var);

    obj.close();
  }

}
