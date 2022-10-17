import java.util.Scanner;

  // Program untuk menghitung keliling dan luas lingkaran

public class Lingkaran {
  static final double phi=3.14;
  public static void main(String args[]) {
      Scanner obj=new Scanner(System.in);

      long d=obj.nextLong();;
      double r, keliling, luas;
      r=0.5*d;
      keliling=2*phi*r;
      luas=phi*r*r;
      System.out.println(String.format("%.2f %.2f", keliling, luas));

      obj.close();

  }
}
