public class HR_DivisibleSumPairs {
  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 6, 1, 2};
    int len = arr.length;
    int k = 3;
    int count = 0;
    for(int i=0; i<len-1; i++) {
      for(int j=i+1; j<len; j++) {
        if((arr[i]+arr[j])%k==0) {
          System.out.printf("%d %d\n", arr[i], arr[j]);
          count++;
        }
      }
    }
    System.out.println(count);
  }
  
}