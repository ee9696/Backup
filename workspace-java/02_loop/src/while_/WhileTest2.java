package while_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count;
		int yn;
		
		while(true) {
		int com = (int)(Math.random()*100)+1;
		System.out.println();
		System.out.println("���ڸ� �߻��߽��ϴ�...");
		count = 0;
			while (true) {
				System.out.print("���� �Է� : ");
				count++;
				int user = Integer.parseInt(br.readLine());
				if(com>user) {
					System.out.println(user + "���� Ů�ϴ�.");
				}else if (com<user) {
					System.out.println(user + "���� �۽��ϴ�.");
				}else {
					break; 
				}
			}
		System.out.print("������" + count+"������ ���߼̽��ϴ�.");
		
		while(true) {
			System.out.print("1�� �� (Y/N) ? ");
			yn = br.read();
			br.read();
			br.read();
			if(yn=='Y' || yn=='y' || yn=='N' || yn=='n'); break;
		}
			if(yn=='N' || yn=='n') break;
		}
		System.out.println("���α׷��� �����մϴ�");
	}
}


/*
public class WhileTest2 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int com, user, count;
      int yn;
      
      while(true) {
         com = (int)(Math.random()*100) + 1; //1~100
         
         System.out.println();
         System.out.println("���ڸ� �߻��߽��ϴ�..."+com);
         count = 0; //�ʱ�ȭ
         while(true) {
            System.out.print("���� �Է� : ");
            user = Integer.parseInt(br.readLine());
            count++; //count = count + 1
            
            if(com == user) break;
            
            if(com > user) {
               System.out.println(user+"���� Ů�ϴ�");
            }else {
               System.out.println(user+"���� �۽��ϴ�");
            }  
         }//while
         
         System.out.println("������..."+count+"������ ���߼̽��ϴ�");
         
         while(true) {
            System.out.print("1�� �� (Y/N) ? ");
            yn = br.read();
            br.read();
            br.read();
            
            if(yn=='Y' || yn=='y' || yn=='N' || yn=='n') break;
         }//while
         
         if(yn=='N' || yn=='n') break;
      }//while
      System.out.println("���α׷��� �����մϴ�");
   }

}
*/