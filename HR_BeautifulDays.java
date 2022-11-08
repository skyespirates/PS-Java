public class HR_BeautifulDays {
  public static void main(String[] args) {
    int i = 20;
    int j = 23;
    int k = 6;
    int count = 0;
    for(int o=i; o<=j; o++) {
      int num = o;
      int temp = num;
      int result = 0;
      while(num>0) {
        temp = num % 10;
        result += temp;
        if(num < 10) break;
        result *= 10;
        num /= 10;
        temp = num;
      }   
      int res = (o-result)%k;
      if(res == 0) count++;
    }
    System.out.println(count);
  }

}
