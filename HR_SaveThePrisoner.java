public class HR_SaveThePrisoner {
  public static void main(String[] args) {
    int n = 7;
    int m = 19;
    int s = 2;
    int hasilBagi = m/n;
    int sisaBagi = m%n;
    int result = (sisaBagi+s-1)%n;
    if(result==0) System.out.println(n);
    else System.out.println(result);
  }
}
