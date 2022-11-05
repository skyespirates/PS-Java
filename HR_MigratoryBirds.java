import java.util.*;
public class HR_MigratoryBirds {
  public static int[] bubbleSort(int[] nums) {
    int n = nums.length;
    for(int i=0; i<n-1; i++) {
      for(int j=0; j<n-i-1; j++) {
          if(nums[j]>nums[j+1]) {
              int temp=nums[j];
              nums[j]=nums[j+1];
              nums[j+1]=temp;
          }
      }
  }
  return nums;
  }
  public static void main(String[] args) {
    // int[] arr = {1, 4, 4, 5, 3};
    int[] arr = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5};
    int len = arr.length;
    int[] res = bubbleSort(arr);
    List modus = new ArrayList<Integer>();
    int current = arr[0];
    int sum = 1;
  
    for(int i=1; i<len; i++) {
      if(current==res[i]) {
        sum++;
      } else {
        modus.add(sum);
        current = res[i];
        sum = 1;
      }
    }
    
    /*
    modus.add(2);
    modus.add(2);
    modus.add(3);
    modus.add(3);
    modus.add(1);
    */
    for(Object e:modus) {
      System.out.println(e);
    }
  }
}
