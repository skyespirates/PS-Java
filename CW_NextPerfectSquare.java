public class CW_NextPerfectSquare {
  public static void main(String[] args) {
    int num=144;
    long res=findNextSquare(num);
    System.out.println(res);
  }
    public static long findNextSquare(long sq) {
        double res=Math.sqrt(sq);
        int resu=(int) res;
        long resul=resu+1;
        if(res-resu>0) {
          return -1;
        } else {
          return resul*resul;
        }
    }
}
