/*
 * Program untuk menghitung jumlah kata dalam kalimat
 */

public class Words {

  public static void main(String args[])   {
    String text="hello world";
    String[] res=text.split(" ");
    for(String e:res) {
      System.out.println(e);
    }
  }
}
