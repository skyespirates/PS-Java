public class Jewels {
  public static void main(String args[]) {
    String jewels="aA";
    String stones="aAAbbbb";
    String[] je=jewels.split("");
    String[] s=stones.split("");
    int m=je.length;
    int n=s.length;
    
    int count=0;
    for(int i=0; i<m; i++) {
        for(int j=0; j<n; j++) {
            if(je[i].equals(s[j])) count++;
        }
    }

    System.out.println(count);


  }
}
