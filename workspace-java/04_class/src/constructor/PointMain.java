package constructor;

public class PointMain {
   private int x, y;
   
   public PointMain() {
      x = y = 10;
   }
   public PointMain(int x, int y) {
      this.x = x;
      this.y = y;
   }
   public PointMain(PointMain aa, PointMain bb) {
      this.x = aa.x + bb.x;
      this.y = aa.y * bb.y;
   }
   
   public void calcPlus() {
      x += 10;
   }
   public void calcPlus(int x, int y) {
      this.x += x;
      this.y += y;
   }
         
   public static void main(String[] args) {
      PointMain aa = new PointMain();
      System.out.println("x=" + aa.x + "\t y=" + aa.y);
      
      System.out.println("\n x의 값을 +10 증가하는 메소드를 작성하시오 - calcPlus()");
      aa.calcPlus();
      System.out.println("x=" + aa.x + "\t y=" + aa.y);
      System.out.println();
      
      PointMain bb = new PointMain(100, 200);
      System.out.println("x=" + bb.x + "\t y=" + bb.y);
      
      System.out.println("\n 3, -8 인수로 받아서 x는 증가, y는 감소하는 메소드를 작성하시오- calcPlus()");
      bb.calcPlus(3, -8);
      System.out.println("x=" + bb.x + "\t y=" + bb.y);
      System.out.println();
      
      System.out.println("\n x는 aa의 x값과 bb의 x의 값을 더하고 y끼리는 곱하기"); 
      PointMain cc = new PointMain(aa, bb);
      System.out.println("x=" + cc.x + "\t y=" + cc.y);
      System.out.println();
      
      
      
   }

}//class PointMain