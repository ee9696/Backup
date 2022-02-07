package basic;

class Person {
   private String name;//필드, 초기화
   private int age;
   
   public void setName(String n) { //구현
      name = n;					// parameter 매개변수
   }
   public void setAge(int a) {
      age = a;
   }
   public void setData(String n, int a){
      name = n;
      age = a;
   }
   public void setData() {}
   
   public String getName(){
      return name;
   }
   public int getAge(){
      return age;
   }
}
//----------
public class PersonMain {

   public static void main(String[] args) {
      Person p; //객체
      p = new Person(); //생성
      System.out.println("객체 p = " + p);
      System.out.println("객체 p = " + p.toString());
      p.setName("홍길동");//호출
      p.setAge(25);
      System.out.println("이름="+p.getName()+"\t 나이="+p.getAge());
      System.out.println();
      
      Person p2 = new Person();
      System.out.println("객체 p2 = " + p2);
      p2.setName("코난");//호출
      p2.setAge(13);
      System.out.println("이름="+p2.getName()+"\t 나이="+p2.getAge());
      System.out.println();
      
      Person p3 = new Person();
      p3.setData("라이언", 35);
      System.out.println("이름="+p3.getName()+"\t 나이="+p3.getAge());
      System.out.println();
      
      Person p4 = new Person();
      p4.setData();
      System.out.println("이름="+p4.getName()+"\t 나이="+p4.getAge());
      System.out.println();
   }

}
