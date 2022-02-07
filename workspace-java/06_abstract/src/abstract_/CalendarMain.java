package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest{
   private int year, month, week, lastDay;
   
   public CalendarTest() {
      Scanner scan=new Scanner(System.in);
        System.out.print("�⵵ �Է�: ");
        this.year = scan.nextInt();
        
        System.out.print("�� �Է�: ");
        this.month = scan.nextInt();
   }
   
   public void calc() {
      Calendar cal = Calendar.getInstance();
      
      //������ �ý��� ��¥�� �ð� - 2021 08 11
      //               ->���� 2002 10  01
      //cal.set(Calendar.YEAR, year); //��
      //cal.set(cal.MONTH, month-1);    //��
      //cal.set(cal.DAY_OF_MONTH, 1); //��
      
      cal.set(year, month-1, 1);
      
      week = cal.get(cal.DAY_OF_WEEK); //������ �����´�.
      lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH); //28, 29, 30, 31
   }
   
   public void display() {
      System.out.print("��\t��\tȭ\t��\t��\t��\t��\t\n");
      
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