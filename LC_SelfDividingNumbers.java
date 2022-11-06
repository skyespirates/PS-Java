public class LC_SelfDividingNumbers {
  public static void main(String[] args) {
    int left = 1;
    int right = 22;
    for(int i=left; i<=right; i++) {
      int currentDigit, currentValue=i;
      while(currentValue > 0) {
        currentDigit = currentValue % 10;
        if(currentDigit==0) break;
        if(i%currentDigit!=0) break;
        currentValue /= 10;
        if(currentValue==0) System.out.println(i);
      }
    }
  }
}
