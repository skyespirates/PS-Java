public class Char {
  public static void main(String args[]) {
    String text="aAAbbbb";
    String[] res=text.split("");
    for(String e:res) {
      System.out.println(e);
    }
  }
}
