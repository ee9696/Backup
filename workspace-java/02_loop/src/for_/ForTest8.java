package for_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ForTest8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int x = 0, y = 0;
			int result = 1;
			int count = 0;
			
			while(true) {
				System.out.println();
				System.out.printf("x값 입력 : ");
				x = Integer.parseInt(br.readLine());
				if (x==0) {
					 break;
				}
				System.out.printf("y값 입력 : ");
				y = Integer.parseInt(br.readLine());
				
			
				for(int i=1; i<=y; i++) {
					
					result *= x; 
					count++;
						if (count==y) {
						
						System.out.println();
						System.out.println(x + "의 " + y + "승은 " + result);
						}
					
				}

			}
			System.out.println("프로그램을 종료합니다.");
	}
}

/*
 * public class ForTest8 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int x, y;
      int mul;
      
      for(;;) {
         mul = 1;
         
         System.out.print("x값 입력 : ");
         x = Integer.parseInt(br.readLine());
         if(x==0) break;
         
         System.out.print("y값 입력 : ");
         y = Integer.parseInt(br.readLine());
         
         //x의 y승
         for(int i=1; i<=y; i++) {
            mul *= x;
         }
         
         System.out.println(x + "의 " + y +"승은 " + mul);
      }//for
      
      System.out.println("프로그램 종료합니다.");
   }

}
*/
