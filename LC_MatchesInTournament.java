public class LC_MatchesInTournament {
  public static void main(String[] args) {
    int n = 7;
    int matches = n;
    int sum = 0;
    while(n > 1) {
      if(n%2==0) {
        matches = n/2;
        n = matches;
      } else {
        matches = (n-1)/2;
        n = matches + 1;
      }
      sum += matches;
    }
    System.out.println(sum);
  }
}
