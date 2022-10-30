public class LC_SumOddArray {
  public static void main(String[] args) {
    int[] arr = {1,4,2,5,3};
    int sum = 0;
    int len = arr.length;
    int n = (arr.length+1)/2;
    int up = arr.length;
    int down = 1;

    for(int i=0; i<n; i++) {
      for(int j=0; j<up; j++) {
        for(int k=j; k<j+down; k++) {
          sum += arr[k];
        }
      }
      up -= 2;
      down += 2;
    }
    System.out.println(sum);
  }
}
