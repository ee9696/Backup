package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusGame {
	private Object system;

	public static void main(String args[]) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int i;
			int count = 0;
			int score = 20;
			String yn;
		
			while(true) {
				count=0;
				for (i = 1; i<=5; i++) {
					int a = (int)(Math.random()*90)+10;
					int b = (int)(Math.random()*90)+10;
					
					for(int j=1; j<=2; j++) { // 틀리면 기회를 1번 더 제공
						System.out.print("[문제" + i + "]" + a + "+" + b + "=");
						int dab = Integer.parseInt(br.readLine());
							if(dab==a+b) {
								System.out.println("딩동댕...참 잘했어요.");
								count++;
								break; //for j를 벗어나라
							} else {
								if(j==1) //1번 틀렸을 때	
									System.out.println("틀렸다...");
								else if(j==2)	//	2번 틀렸을 때
									System.out.println("틀렸다...정답 : " + a+b);
							}
					}
				}
				System.out.println("당신의 총 " + count + "문제를 맞추어서 " + count*score + "점 입니다.");
				System.out.print("한 번 더 하시겠습니까? (Y/N)");
				yn = br.readLine();
				if(yn.equals("n") || yn.equals("N")) break;
				} 
				System.out.println("프로그램을 종료합니다");
			 
	}
}
			


/*
   public class PlusGame {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a, b,  dab, count;
      String yn;
      
      while(true) {
         count=0;
         for(int i=1; i<=5; i++) {//5문제
            a = (int)(Math.random() * 90) + 10; //10 ~ 99
            b = (int)(Math.random() * 90) + 10;
            
            for(int j=1; j<=2; j++) { //틀리면 기회를 1번 더 제공
               System.out.print("[문제" + i + "] " + a + " + " + b + " = ");
               dab = Integer.parseInt(br.readLine());
               if(dab == a+b) {
                  System.out.println("딩동댕...참 잘했어요");
                  count++;
                  break; //for j를 벗어나라
               }else {
                  if(j==1) //1번 틀렸을 때
                     System.out.println("틀렸다...");
                  else if(j==2) //2번 틀렸을 때
                     System.out.println("틀렸다...정답 : " +(a+b));
               }
            }//for j
            
            System.out.println();
         }//for i
         
         System.out.println();
         System.out.println("당신의 총 "+count+"문제를 맞추어서 "+ count*20 +"점 입니다.");
         
         System.out.print("1번 더 (Y/N) ? ");
         yn = br.readLine();
         
         if(yn.equals("N") || yn.equals("n")) break;
      }//while
      
      System.out.println("프로그램을 종료합니다");
   }

}
*/

