import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class HR_MigratoryBirds {
  public static int[] bubbleSort(int[] nums) {
    int n = nums.length;
    for(int i=0; i<n-1; i++) {
      for(int j=0; j<n-i-1; j++) {
          if(nums[j]>nums[j+1]) {
              int temp=nums[j];
              nums[j]=nums[j+1];
              nums[j+1]=temp;
          }
      }
  }
  return nums;
  }
  public static void main(String[] args) {
    // deklarasi array list
    List<Integer> arr = new ArrayList<Integer>();
    int result = 0;
  
    arr.add(2);
    arr.add(2);
    arr.add(3);
    arr.add(3);
    arr.add(1);

    // deklarasi hash map
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    // pendefinisian key dan value dari hash map
    // iterasi setiap elemen array
    for(int e : arr) {
      // jika elemen saat ini belum ada key nya di hash map, maka inisialisasi
      if(!count.containsKey(e)) {
        count.put(e, 1);
      } else {
        // jika elemen saat ini sudah ada key nya pada hash map, maka tinggal increment value nya 1
        count.put(e, count.get(e)+1);
      }
    }
    // dapatkan nilai maksimal dari hash map
    int maxValue = (Collections.max(count.values()));
    // iterasi semua elemen hash map
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      if (entry.getValue() == maxValue) {
        result = entry.getKey();
        break;
      }
    }
    System.out.println(result);
  }
}
