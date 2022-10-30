public class LC_ShuffleString_1 {
  public static void main(String[] args) {
    String s = "codeleet";
    int[] indices = {4,5,6,7,0,2,1,3};
    int len = s.length();
    String[] res = s.split("");
    String[] out = new String[len];
    for(int i=0; i<len; i++) {
      out[indices[i]]=res[i];
    }
    String str = "";
    for(String i:out) {
      str+=i;
    }
    return str;
  }
}
