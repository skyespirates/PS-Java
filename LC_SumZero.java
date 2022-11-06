public class LC_SumZero {
  public static void main(String[] args) {
    int n = 5;
    int[] result = new int[n];
    int mid = n/2;
    int val = -1*mid;
    for(int i=0; i<n; i++, val++) {
      if(n%2==0&&val==0) val++;
      result[i] = val;
    }
    for(int e : result) {
      System.out.println(e);
    }
  }
}
