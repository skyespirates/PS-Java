import java.util.ArrayList;

public class Decompress {
  public static void main(String args[]) {
    int[] arr={1,1,2,3};
    int n=arr.length;
    ArrayList<Integer> res=new ArrayList<Integer>();
    for(int i=0; i<n; i+=2) {
      for(int j=0; j<arr[i]; j++) {
        res.add(arr[i+1]);
      }
    }
    int m=res.size();
    int[] result=new int[m];
    for(int i=0; i<m; i++) {
      result[i]=res.get(i);
      System.out.println(result[i]);
    }
  }
}
