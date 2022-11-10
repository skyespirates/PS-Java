public class HR_DrawingBook {
  public static void main(String[] args) {
    int n = 2;
    int p = 1;
    int res = 0;
     if (p <= (n-p)) {
      res = p/2;
    }
    else {
      if(p%2 != 0){
        p--;
        res = (n-p)/2;
      }
      else {
          res = (n-p)/2;
      }
    }
    return res;
    System.out.println(res);
  }
}