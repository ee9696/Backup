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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		DecimalFormat df = new DecimalFormat();

		int money = 1000;
		System.out.print("����(1), ����(2), ��(3) �� ��ȣ�� �Է� : ");
		int user  = Integer.parseInt(br.readLine());
		
		System.out.print("���� �ݾ� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("Press Enter key to continue...");
		String c = br.readLine();

		int com = (int)(Math.random()*3)+1;
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





		
		

		
		

		//����
		//int a = (int)(Math.random()*3) + 1;
		//System.out.println(a);

		//Random r = new Random();
		//int b = r.nextInt(3) + 1; // 0 ~ 2
	}
}
