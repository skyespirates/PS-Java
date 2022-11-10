public class HR_CountingValleys {
  public static void main(String[] args) {
    int steps = 6;
    String path = "DUDUDU";
    int count = 0;
    int valley = 0;
    boolean checker = false;
    for(int i=0; i<steps; i++) {
      if(path.charAt(i)=='U') count++;
      else count--;
      if(count<0) checker = true;
      if(checker && count==0) {
        checker = false;
        valley++;
      }
    }
    System.out.println(valley);
  }
}
