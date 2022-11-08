import java.util.*;

public class HR_BillDivision {
  public static void main(String[] args) {
    List<Integer> bill = new ArrayList<Integer>();
    int k = 1;
    int b = 12;
    
    bill.add(3);
    bill.add(10);
    bill.add(2);
    bill.add(9);
    
    int sum = 0;
    for(int i=0; i<bill.size(); i++) {
      if(i!=k) sum += bill.get(i);
    }
    int bAktual = sum / 2;
    if(bAktual==b) System.out.println("Bon Appetit");
    else System.out.println(b-bAktual);

  }
}
