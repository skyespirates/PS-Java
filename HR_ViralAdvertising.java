public class HR_ViralAdvertising {
  public static void main(String[] args) {
    int shared = 5;
    int liked = shared/2;
    int sum = liked;
    for(int i=0; i<4; i++) {
      shared = liked*3;
      liked = shared/2;
      sum += liked;
    }
    System.out.println(sum);
  }
}
