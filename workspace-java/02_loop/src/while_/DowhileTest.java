package while_;

public class DowhileTest {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		
		int a=0;
	      do {
	         a++; //1 2...9 10
	         System.out.print(a + " ");
	         
	      }while(a<10);
	      System.out.println("\n");
	      
	      char ch='A';
	      int count=0;
	      
	      do {
	         System.out.print(ch + " ");
	         ch++; //B C D
	         
	         count++; //1 2 3 4 5 6 7 8 9
	         if(count%7 == 0) System.out.println();
	         
	      }while(ch<='Z');
	}
}
