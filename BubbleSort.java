public class BubbleSort {

  // Implementasi algoritma bubble sort

  public static int[] bubbleSort(int[] nums) {
    int n=nums.length;
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


  public static void main(String args[]) {
    int[] arr={3,2,4,1,5};
    arr=bubbleSort(arr);
    for(int e:arr) {
      System.out.println(e);
    }
    
  }
}
