import java.util.*;
public class HR_QueenAttack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r_q = sc.nextInt();
    int c_q = sc.nextInt();
    int poss = 0;
    if(r_q==n||c_q==n) return poss=(n-1)*3;
    else {
      poss = n*3-1;
    }
    // kalau ditengah n*3-1
  }
}
