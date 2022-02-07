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
      System.out.println("���� ��¥ : " + date);
      System.out.println();
      
      SimpleDateFormat sdf = new SimpleDateFormat("y�� MM�� dd�� E���� HH:mm:ss");
      System.out.println("���� ��¥ : " + sdf.format(date));
      System.out.println();
      
      //�Է�
      SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
      Date birth = input.parse("19910716091527");//String -> Date
      System.out.println("������ : " + birth);
      System.out.println("������ : " + sdf.format(birth));
      System.out.println();
      
      //������ �ý��� ��¥�� �ð�
      //Calendar cal = new Calendar(); - error
      //Calendar cal = new GregorianCalendar(); //�ڽ� Ŭ���� �̿��Ͽ� ����  - 1�� â��
      Calendar cal = Calendar.getInstance(); //�޼ҵ带 �̿��Ͽ� ����     - 2�� ����
      
      //Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
      
      int year = cal.get(Calendar.YEAR);     //int year = cal.get(1);
      int month = cal.get(Calendar.MONTH) + 1; //int month = cal.get(2);
      int day = cal.get(Calendar.DAY_OF_MONTH);
      
      int week = cal.get(Calendar.DAY_OF_WEEK); //1-�Ͽ���, 2-������,...
      String dayOfWeek = null;
      switch(week){
      case 1 : dayOfWeek = "�Ͽ���"; break;
      case 2 : dayOfWeek = "������"; break;
      case 3 : dayOfWeek = "ȭ����"; break;
      case 4 : dayOfWeek = "������"; break;
      case 5 : dayOfWeek = "�����"; break;
      case 6 : dayOfWeek = "�ݿ���"; break;
      case 7 : dayOfWeek = "�����"; break;
      }//switch
      
      int hour = cal.get(Calendar.HOUR_OF_DAY);
      int minute = cal.get(Calendar.MINUTE);
      int second = cal.get(Calendar.SECOND);
      
      System.out.println("���� ��¥ : " + year + "�� "
                               + month + "�� "
                              + day + "�� "
                              + dayOfWeek + " "
                              + hour + "�� "
                              + minute + "�� "
                              + second + "��");
      
   }

}