import java.util.*;

public class SPOJ_BasicSum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int Q=sc.nextInt();
    List<Integer> arr=new ArrayList<Integer>();
    for(int i=0; i<n; i++) {
      int input=sc.nextInt();
      arr.add(input);
    }
    for(int i=0; i<Q; i++) {
      int K=sc.nextInt();
      int B=sc.nextInt();
      int sum=0;
      if(B>n) B%=n;
      B--;
      while(K>0) {
        if(B==n) B=0;
        sum+=arr.get(B);
        B++;
        K--;
      }
      System.out.println(sum);
    }
  }
}
