import java.time.DayOfWeek;

public class HR_DayOfTheProgrammer {
  public static void main(String[] args) {
    int year = 1918;
    int dayOfProgrammer = 256;
    int days = 243;
    if(year>=1700&&year<=1917) {
      if(year%4==0) days++;
    } else if(year==1918) {
      days -= 13;
    } else {
      if(year%400==0) days++;
      else if(year%4==0&&year%100!=0) days++;
    }
    int res = dayOfProgrammer - days;
    System.out.println(dayOfProgrammer + " - " + days + " = " + res);
  }
}
