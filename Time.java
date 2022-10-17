public class Time {

  /*
   * Program untuk mengonversi bentuk jam dari mode 12 yang pakai AM PM
   * menjadi format 24 jam
   * input: 06:45:30PM
   * output: 18:45:30
   * 
   */

  public static String timeConversion(String s) {
    String timeSplitted = s.substring(0, 8);
    char jam0 = timeSplitted.charAt(0);
    char jam1 = timeSplitted.charAt(1);

    String result;

    if(s.charAt(8)=='P') {
      if(s.charAt(0)=='1' && s.charAt(1)=='2') {
        result = timeSplitted;
      } else {
        jam0 += 1;
        jam1 += 2;
        String jam = "" + jam0 + jam1;
        result = jam + timeSplitted.substring(2);
      }
    } else {
      result = timeSplitted;
      if(jam0=='1' && jam1=='2') {
          result = timeSplitted.replaceFirst("12", "00");
    }
    }
    return result;
  }



  public static void main(String args[]) {
    String time = "12:05:45AM";
  
    System.out.println(timeConversion(time));
  }
}


