public class Buah {

  public static void countApples(int s, int t, int a, int[] apples) {
    // int count = 0;
    for(int i=0; i<apples.length; i++) {
      if(apples[i]<0) {
        continue;
      } else {
          System.out.println(a+apples[i]);
      }
    }
    
  }





  public static void main(String args[]) {
    int s = 7;
    int t = 11;
    int a = 5;
    int[] apples = {-2, 2, 1};
    countApples(s, t, a, apples);
  }
}
