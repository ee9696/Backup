class MethodTest2 {
   
   public static void main(String[] args) {
      
      MethodTest2 mt = new MethodTest2();//생성

      System.out.println("합 = " + mt.sum(320, 258)); //호출
      System.out.println("차 = " + mt.sub(320, 258)); //62
	  System.out.println("곱 = " + mt.mul(320, 258)); //
	  System.out.println("몫 = " + String.format("%.2f",mt.div(320, 258))); //1.24
   }

   public double div(int a, int b){
	   return (double)a/b;
   }

   public int mul(int a, int b){
	   return a*b;
   }

   public int sub(int a, int b){
	   return a-b;
   }

   public int sum(int a, int b) { //구현
      return a+b;
   }
}
