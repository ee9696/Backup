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
					
					for(int j=1; j<=2; j++) { // Ʋ���� ��ȸ�� 1�� �� ����
						System.out.print("[����" + i + "]" + a + "+" + b + "=");
						int dab = Integer.parseInt(br.readLine());
							if(dab==a+b) {
								System.out.println("������...�� ���߾��.");
								count++;
								break; //for j�� �����
							} else {
								if(j==1) //1�� Ʋ���� ��	
									System.out.println("Ʋ�ȴ�...");
								else if(j==2)	//	2�� Ʋ���� ��
									System.out.println("Ʋ�ȴ�...���� : " + a+b);
							}
					}
				}
				System.out.println("����� �� " + count + "������ ���߾ " + count*score + "�� �Դϴ�.");
				System.out.print("�� �� �� �Ͻðڽ��ϱ�? (Y/N)");
				yn = br.readLine();
				if(yn.equals("n") || yn.equals("N")) break;
				} 
				System.out.println("���α׷��� �����մϴ�");
			 
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
         for(int i=1; i<=5; i++) {//5����
            a = (int)(Math.random() * 90) + 10; //10 ~ 99
            b = (int)(Math.random() * 90) + 10;
            
            for(int j=1; j<=2; j++) { //Ʋ���� ��ȸ�� 1�� �� ����
               System.out.print("[����" + i + "] " + a + " + " + b + " = ");
               dab = Integer.parseInt(br.readLine());
               if(dab == a+b) {
                  System.out.println("������...�� ���߾��");
                  count++;
                  break; //for j�� �����
               }else {
                  if(j==1) //1�� Ʋ���� ��
                     System.out.println("Ʋ�ȴ�...");
                  else if(j==2) //2�� Ʋ���� ��
                     System.out.println("Ʋ�ȴ�...���� : " +(a+b));
               }
            }//for j
            
            System.out.println();
         }//for i
         
         System.out.println();
         System.out.println("����� �� "+count+"������ ���߾ "+ count*20 +"�� �Դϴ�.");
         
         System.out.print("1�� �� (Y/N) ? ");
         yn = br.readLine();
         
         if(yn.equals("N") || yn.equals("n")) break;
      }//while
      
      System.out.println("���α׷��� �����մϴ�");
   }

}
*/

