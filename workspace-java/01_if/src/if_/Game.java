/*
���� ���� �� ����

����(1), ����(2), ��(3)���� �ν��Ѵ�
��ǻ�ʹ� 1 ~ 3������ ������ �߻��Ѵ�.

[������]
����(1), ����(2), ��(3) �� ��ȣ�� �Է� : 2 (System.in.read() ����ϼ���)
���� �ݾ� �Է� : 200 (BufferedReader ����ϼ���)
����� ������ �ƹ�Ű�� ��������......
��ǻ�� : ����, �� : ����
�̰���ϴ�.
���� �ݾ��� 1,200�� �Դϴ�.

*/
package if_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		DecimalFormat df = new DecimalFormat();
		int com, user;
		int money = 1000;
		System.out.print("����(1), ����(2), ��(3) �� ��ȣ�� �Է� : ");
		user  = System.in.read()-48;
		System.in.read(); // ����Ű�� ������ ���Ͱ��� �ԷµǱ⶧���� �̰��� ������� �մϴ�. �ΰ� ���ݽô�.
		System.in.read(); // ����Ű�� ������ �ƽ�Ű�ڵ� 13�� ���� �Է��̵ǰ� ������ �ɶ� 10���� �Է��̵Ǳ⶧���Դϴ�.
		
		

		System.out.print("���� �ݾ� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("Press Enter key to continue...");
		System.in.read(); 
		System.in.read();

		com = (int)(Math.random()*3)+1;
		if(com==1){
			System.out.print("��ǻ�� : ����, ");
		}
		if(com==2){
			System.out.print("��ǻ�� : ����, ");
		}
		if(com==3){
			System.out.print("��ǻ�� : ��, ");
		}
		if(user==1){
			System.out.println("�� : ����");
		}
		if(user==2){
			System.out.println("�� : ����");
		}
		if(user==3){
			System.out.println("�� : ��");
		}
		
		if(com==1){
			if(user==1){
				System.out.print("�����ϴ�.\n���� �ݾ��� " + df.format(money) + "�� �Դϴ�.");
				}
			if(user==2){
				System.out.print("�����ϴ�.\n���� �ݾ��� " + df.format(money-b) + "�� �Դϴ�.");
				}
			if(user==3){
				System.out.print("�̰���ϴ�.\n���� �ݾ��� " + df.format(money+b) + "�� �Դϴ�.");
				}
		}
		if(com==2){
			if(user==1){
				System.out.print("�����ϴ�.\n���� �ݾ��� " + df.format(money-b) + "�� �Դϴ�.");
				}
			if(user==2){
				System.out.print("�����ϴ�.\n���� �ݾ��� " + df.format(money) + "�� �Դϴ�.");
				}
			if(user==3){
				System.out.print("�̰���ϴ�.\n���� �ݾ��� " + df.format(money+b) + "�� �Դϴ�.");
				}
		}
		if(com==3){
			if(user==1){
				System.out.print("�̰���ϴ�.\n���� �ݾ��� " + df.format(money+b) + "�� �Դϴ�.");
				}
			if(user==2){
				System.out.print("�����ϴ�.\n���� �ݾ��� " + df.format(money-b) + "�� �Դϴ�.");
				}
			if(user==3){
				System.out.print("�����ϴ�.\n���� �ݾ��� " + df.format(money) + "�� �Դϴ�.");
				}
		}
	}
}
	

/*
package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      DecimalFormat df = new DecimalFormat();
      int com, user;
      int money = 1000;
      int batting;

      //����
      com = (int)(Math.random()*3) + 1; //0 ~ 2  ->  1 ~ 3
      
      System.out.print("����(1), ����(2), ��(3) �� ��ȣ�� �Է� : ");
      user = System.in.read()-48;
      System.in.read();
      System.in.read();
      System.out.print("���� �ݾ� �Է� : ");
      batting = Integer.parseInt(br.readLine());
      
      System.out.println("����� ������ �ƹ�Ű�� ��������......");
      System.in.read();
      System.in.read();
      
      if(com==1) {//��:����
         if(user==1) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�����ϴ�");
         }else if(user==2) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�̰���ϴ�");
            money += batting; //money = money+batting
         }else if(user==3) {
            System.out.println("��ǻ�� : ����, �� : ���ڱ�");
            System.out.println("�����ϴ�..�Ф�");
            money -= batting; //money = money-batting
         }
      
      }else if(com==2) {//��:����
         if(user==1) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�����ϴ�..�Ф�");
            money -= batting; //money = money-batting
         }else if(user==2) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�����ϴ�");
         }else if(user==3) {
            System.out.println("��ǻ�� : ����, �� : ���ڱ�");
            System.out.println("�̰���ϴ�");
            money += batting; //money = money+batting
         }
         
      }else if(com==3){//��:���ڱ�
         if(user==1) {
            System.out.println("��ǻ�� : ���ڱ�, �� : ����");
            System.out.println("�̰���ϴ�");
            money += batting; //money = money+batting
         }else if(user==2) {
            System.out.println("��ǻ�� : ���ڱ�, �� : ����");
            System.out.println("�����ϴ�..�Ф�");
            money -= batting; //money = money-batting
         }else if(user==3) {
            System.out.println("��ǻ�� : ���ڱ�, �� : ���ڱ�");
            System.out.println("�����ϴ�");
         }
      }//if
      
      System.out.println("���� �ݾ��� "+df.format(��)+"�� �Դϴ�.");
   }
}


		
		

		
		

		//����
		//int a = (int)(Math.random()*3) + 1;
		//System.out.println(a);

		//Random r = new Random();
		//int b = r.nextInt(3) + 1; // 0 ~ 2
	}
}
*/
		