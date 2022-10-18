public class Replace {
  public static void main(String args[]) {
    String str="G()()()()(al)";
    String res;
    res=str.replace("()", "o");
    res=res.replace("(al)", "al");
    System.out.println(res);
  }
}