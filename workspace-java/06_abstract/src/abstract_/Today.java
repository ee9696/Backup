/*
package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
*/

package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {

   public static void main(String[] args) throws ParseException {
      Date date = new Date();
      System.out.println("오늘 날짜 : " + date);
      System.out.println();
      
      SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
      System.out.println("오늘 날짜 : " + sdf.format(date));
      System.out.println();
      
      //입력
      SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
      Date birth = input.parse("19910716091527");//String -> Date
      System.out.println("내생일 : " + birth);
      System.out.println("내생일 : " + sdf.format(birth));
      System.out.println();
      
      //기준은 시스템 날짜와 시간
      //Calendar cal = new Calendar(); - error
      //Calendar cal = new GregorianCalendar(); //자식 클래스 이용하여 생성  - 1번 창엘
      Calendar cal = Calendar.getInstance(); //메소드를 이용하여 생성     - 2번 건휘
      
      //Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
      
      int year = cal.get(Calendar.YEAR);     //int year = cal.get(1);
      int month = cal.get(Calendar.MONTH) + 1; //int month = cal.get(2);
      int day = cal.get(Calendar.DAY_OF_MONTH);
      
      int week = cal.get(Calendar.DAY_OF_WEEK); //1-일요일, 2-월요일,...
      String dayOfWeek = null;
      switch(week){
      case 1 : dayOfWeek = "일요일"; break;
      case 2 : dayOfWeek = "월요일"; break;
      case 3 : dayOfWeek = "화요일"; break;
      case 4 : dayOfWeek = "수요일"; break;
      case 5 : dayOfWeek = "목요일"; break;
      case 6 : dayOfWeek = "금요일"; break;
      case 7 : dayOfWeek = "토요일"; break;
      }//switch
      
      int hour = cal.get(Calendar.HOUR_OF_DAY);
      int minute = cal.get(Calendar.MINUTE);
      int second = cal.get(Calendar.SECOND);
      
      System.out.println("오늘 날짜 : " + year + "년 "
                               + month + "월 "
                              + day + "일 "
                              + dayOfWeek + " "
                              + hour + "시 "
                              + minute + "분 "
                              + second + "초");
      
   }

}