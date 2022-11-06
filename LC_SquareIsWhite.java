public class LC_SquareIsWhite {
  public static void main(String[] args) {
    String str = "c7";
    int e1 = str.charAt(0);
    int e2 = str.charAt(1);
    if((e1+e2)%2==0) System.out.println("false");
    else System.out.println("true");
  }
}
