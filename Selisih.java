import java.util.Scanner;

/*
 * Program untuk menentukan selisih terbesar dari 2 bilangan berurutan
 * 
 */

public class Selisih {
  public static void main(String args[]) {
    Scanner obj=new Scanner(System.in);
    long a=obj.nextLong();
    long b=obj.nextLong();
    long c=obj.nextLong();
    long d=obj.nextLong();

    long dif1=a-b;
    long dif2=b-c;
    long dif3=c-d;

    if(dif1<0) dif1*=-1;
    if(dif2<0) dif2*=-1;
    if(dif3<0) dif3*=-1;

    long max=dif1;
    if(max<dif2) max=dif2; 
    if(max<dif3) max=dif3;

    System.out.println(max);

    obj.close();
  }

}
