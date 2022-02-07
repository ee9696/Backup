package nested;

public class Outer {
   private String name;
   
   public void output() {
      System.out.println("�̸�=" + this.name + "\t ����=" + new Inner().age);
   }
   
   class Inner {
      private int age;
      
      public void disp() {
         System.out.println("�̸�=" + Outer.this.name + "\t ����=" + this.age);
      }
   }

   public static void main(String[] args) {
      Outer ou = new Outer();
      ou.name = "ȫ�浿";
      ou.output();
      
      Outer.Inner in = ou.new Inner();
      in.age = 25;
      in.disp();
      
      Outer.Inner in2 = ou.new Inner();
      in2.age = 30;
      in2.disp();
      
      Outer.Inner in3 = new Outer().new Inner();
      //in3.name = "�ڳ�"; - error
      in3.age = 35;
      in3.disp();

   }

}
