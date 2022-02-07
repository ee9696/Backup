package for_;

public class ForTest7 {
	public static void main(String args[]) {
		int i, sum=0;
		int a = 0, b = 0;
		
		for (i=1; i<=10; i++) {
			if(i%2==1) {
				a = (-i);
			} else {
				b = (i);
				sum += 1;
				System.out.print(a + "+" + b);
			}
		}System.out.print("=" + sum);
	} 
}

/*
/*
-1 + 2 - 3 + 4 -5 + 6 - 7 + 8 - 9 + 10
 

package for_;

public class ForTest7 {

   public static void main(String[] args) {
      int sum=0;
      
      for(int i=1; i<=10; i++) {
         if(i%2 == 0) {
            sum += i;
            System.out.print("+" +i);
         }else {
            sum -= i;
            System.out.print("-" +i);
         }         
      }//for
      
      System.out.println("=" + sum);
   }
}
*/