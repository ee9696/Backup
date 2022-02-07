package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest{
   private int year, month, week, lastDay;
   
   public CalendarTest() {
      Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력: ");
        this.year = scan.nextInt();
        
        System.out.print("월 입력: ");
        this.month = scan.nextInt();
   }
   
   public void calc() {
      Calendar cal = Calendar.getInstance();
      
      //기준은 시스템 날짜와 시간 - 2021 08 11
      //               ->변경 2002 10  01
      //cal.set(Calendar.YEAR, year); //년
      //cal.set(cal.MONTH, month-1);    //월
      //cal.set(cal.DAY_OF_MONTH, 1); //일
      
      cal.set(year, month-1, 1);
      
      week = cal.get(cal.DAY_OF_WEEK); //요일을 가져온다.
      lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH); //28, 29, 30, 31
   }
   
   public void display() {
      System.out.print("일\t월\t화\t수\t목\t금\t토\t\n");
      
      for(int i=1; i<week; i++) {
         System.out.print("\t");
      }
      
      for(int i=1; i<=lastDay; i++) {
         System.out.print(i+"\t");
         
         if(week%7==0) System.out.println();
         week++;
      }
   }
}
//----------------
public class CalendarMain {

   public static void main(String[] args) {
      CalendarTest ct = new CalendarTest();
      ct.calc();
      ct.display();

   }

}