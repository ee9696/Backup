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
				System.out.printf("x�� �Է� : ");
				x = Integer.parseInt(br.readLine());
				if (x==0) {
					 break;
				}
				System.out.printf("y�� �Է� : ");
				y = Integer.parseInt(br.readLine());
				
			
				for(int i=1; i<=y; i++) {
					
					result *= x; 
					count++;
						if (count==y) {
						
						System.out.println();
						System.out.println(x + "�� " + y + "���� " + result);
						}
					
				}

			}
			System.out.println("���α׷��� �����մϴ�.");
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
         
         System.out.print("x�� �Է� : ");
         x = Integer.parseInt(br.readLine());
         if(x==0) break;
         
         System.out.print("y�� �Է� : ");
         y = Integer.parseInt(br.readLine());
         
         //x�� y��
         for(int i=1; i<=y; i++) {
            mul *= x;
         }
         
         System.out.println(x + "�� " + y +"���� " + mul);
      }//for
      
      System.out.println("���α׷� �����մϴ�.");
   }

}
*/
