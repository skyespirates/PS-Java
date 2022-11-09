import java.util.*;
public class SPOJ_DQuery {
  public static int[] bubbleSort(int[] arr) {
    int n = arr.length;
    for(int i=0; i<n-1; i++) {
      for(int j=0; j<n-i-1; j++) {
        if(arr[j]>arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int[] arr = new int[p];
    for(int i=0; i<p; i++) {
      int num = sc.nextInt();
      arr[i] = num;
    }
    for(int i=0; i<p-1; i++) {
      for(int j=0; j<p-i-1; j++) {
        if(arr[j]>arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    int k = sc.nextInt();
    for(int i=0; i<k; i++) {
      int m = sc.nextInt();
      int n = sc.nextInt();
      int count = 1;
      for(int j=m-1; j<n-1; j++) {
        if(arr[j]!=arr[j+1]) count++;
      }
      System.out.println(count);
    }
  }
}
