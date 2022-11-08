public class HR_UtopianTree {
  public static void main(String[] args) {
    int n = 4;
    int height = 1;
    for(int i=0; i<n; i++) {
      if(i%2==0) height*=2;
      else height++;
    }
    System.out.println(height);
  }
}
