public class LC_ShuffleString_2 {
  public static void main(String[] args) {
    String s = "codeleet";
    int len = s.length();
    int[] indices = {4,5,6,7,0,2,1,3};
    char[] res = new char[len];
    for(int i=0; i<len; i++) {
      res[indices[i]] = s.charAt(i);
    }
    String result= "";
    for(char e : res) {
      result+=e;
    }
    System.out.println(result);
  }
}
