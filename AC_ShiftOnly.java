import java.util.Scanner;
public class AC_ShiftOnly {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    boolean checker = true;
    int count = 0;
    for(int i=0; i<n; i++) {
      long num = sc.nextLong();
      if(num%2!=0) {
        checker = false;
        break;
      }
      arr[i] = num;
    }
    int len = arr.length;
    while(checker) {
      for(int i=0; i<len; i++) {
        if(arr[i]%2!=0) {
          checker = false;
          break;
        }
        arr[i]/=2;
        if(i==len-1) count++;
      }
    }
    System.out.println(count);
  }
}
