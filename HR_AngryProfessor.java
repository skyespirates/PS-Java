public class HR_AngryProfessor {
  public static void main(String[] args) {
    int[] a = {-2, -1, 0, 1, 2};
    int k = 3;
    int count = 0;
    for(int i : a) {
      if(i<=0) count++;
    }
    if(count>=k) System.out.println("NO");
    else System.out.println("YES");
  }
}
