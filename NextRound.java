import java.util.Scanner;

public class NextRound {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    if(k>n) {
      System.out.println("Exit code is 11");
      return;
    }
    int[] score=new int[n];
    int count=0;
    for(int i=0; i<n; i++) {
      int num=sc.nextInt();
      score[i]=num;
    }
    for(int e : score) {
      if(score[k]>0&&e>=score[k]) count++;
    }
    System.out.println(count);
  }
}
