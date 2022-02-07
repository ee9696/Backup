package constructor;

public class VarArgs {
   public int sum(int...ar) { //내부적으로 배열로 처리
      int hab=0;
      for(int i=0; i<ar.length; i++) {
         hab += ar[i];
      }
      return hab;
   }
   /*public int sum(int a, int b) {
      return a+b;
   }
   public int sum(int a, int b, int c) {
      return a+b+c;
   }
   public int sum(int a, int b, int c, int d) {
      return a+b+c+d;
   }
   */
   public static void main(String[] args) {
      VarArgs va= new VarArgs();
      
      System.out.println("합=" + va.sum(10,20));
      System.out.println("합=" + va.sum(10,20,30));
      System.out.println("합=" + va.sum(10,20,30,40));
   }
}