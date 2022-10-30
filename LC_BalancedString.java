public class LC_BalancedString {
  public static void main(String[] args) {
    String s = "LLLLRRRR";
    int len = s.length();
    int count = 0;
    int r=0;
    int l=0;
    for(int i=0; i<len; i++) {
      switch (s.charAt(i)) {
        case 'R':
          r++;
          break;
        case 'L':
          l++;
          break;
      }
      if(r==l && r!=0 && l!=0) {
        count++;
        r=0;
        l=0;
      }
    }
    System.out.println(count);
  }
}
