package multiFor;

public class MultiFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan, i;
	    
		for(int w=2; w<=8; w+=3) { //3¹ø w=1, w=2, w=3 -> w=2. w=5, w=8
			for(i=1; i<=9; i++) {      
				for(dan=w; dan<=w+2; dan++) {
					if(dan !=10)
						System.out.print(dan+"*"+i+"="+dan*i+"\t");
	         }//for dan
				System.out.println();
			}//for i
			
		}

	}
}


/*

package multiFor;

public class MultiFor4 {

   public static void main(String[] args) {
      int dan, i;
      
      for(int w=2; w<=8; w+=3) {//3¹ø w=1, w=2, w=3 -> w=2, w=5, w=8
         for(i=1; i<=9; i++) {
            for(dan=w; dan<=w+2; dan++) {
               if(dan != 10)
                  System.out.print(dan+"*"+i+"="+dan*i+"\t");
            }//for dan
            System.out.println();
         }//for i
         System.out.println();
      }//for w
   }
}

*/