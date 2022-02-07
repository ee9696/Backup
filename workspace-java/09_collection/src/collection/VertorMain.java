package collection;

import java.util.Iterator;
import java.util.Vector;

public class VertorMain {

   public static void main(String[] args) {
      Vector<String> v = new Vector<String>();//기본용량 10개, 10개씩 증가
      System.out.println("벡터 크기 = " + v.size());//0 - 항목 개수
      System.out.println("벡터 용량 = " + v.capacity());//10 - 벡터 크기
      System.out.println();
      
      System.out.println("--- 항목 추가 ---");
      for(int i=1; i<=10; i++){
         v.add(i+"");
      }
      
      //v.add("5"); //중복허용, 순서
      v.addElement("5");
      System.out.println("벡터 크기 = " + v.size());//10
      System.out.println("벡터 용량 = " + v.capacity());//10 -> 20
      System.out.println();
      
      for(int i=0; i<v.size(); i++) {
         System.out.print(v.get(i)+ "  ");
      }
      System.out.println();
      
      System.out.println("--- 항목 삭제 ---");
      v.remove("5"); //앞에 있는 "5"를 삭제
      v.removeElementAt(9); //뒤에 있는 "5"를 삭제
      
      Iterator<String> it = v.iterator();//생성
      while(it.hasNext()) {
         System.out.print(it.next()+"  ");
      }
      System.out.println();
      
      Vector<String> v2 = new Vector<String>(5, 2); //기본용량 5개, 2개씩 증가
   }

}