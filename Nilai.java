import java.util.Scanner;

// Program untuk menentukan ketegori nilai siswa

public class Nilai {
  public static void main(String args[]) {
    Scanner obj=new Scanner(System.in);
    float a=obj.nextFloat();
    float b=obj.nextFloat();
    float c=obj.nextFloat();
    float avg=(a+b+c)/3;
    String text="";
    if(avg<30) {
      text="KURANG";
    } else if(avg<60) {
      text="CUKUP";
    } else {
      text="BAIK";
    }
    System.out.println(String.format("%.2f", avg) + text);

    obj.close();
  }
}
