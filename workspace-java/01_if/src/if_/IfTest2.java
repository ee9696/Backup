/*
3����(a,b,c)�� ������ �Է¹޾Ƽ� �հ����� ���հ����� ����Ͻÿ�
�հ��� ����� 60�� �̻��̾�� �ϰ� �� ������ 40�� �̻��̾�� �Ѵ�

[������]
ù��° ���� ���� : 85
�ι�° ���� ���� : 80
����° ���� ���� : 65
�հ�

ù��° ���� ���� : 100
�ι�° ���� ���� : 90
����° ���� ���� : 35
�������� ���հ�

ù��° ���� ���� : 62
�ι�° ���� ���� : 60
����° ���� ���� : 45
���հ�
*/

package if_;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class IfTest2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù��° ���� ���� : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� ���� : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("����° ���� ���� : ");
		int c = Integer.parseInt(br.readLine());

		if(a<=40) System.out.println("�������� ���հ�");
		else if(b<=40) System.out.println("�������� ���հ�");
		else if(c<=40) System.out.println("�������� ���հ�");
		else if((a+b+c)/3>=60) System.out.println("�հ�");
		else System.out.println("���հ�");
	}
}
/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IfTest2 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("ù��° ���� ���� �Է� : ");
      int a = Integer.parseInt(br.readLine());
      System.out.print("�ι�° ���� ���� �Է� : ");
      int b = Integer.parseInt(br.readLine());
      System.out.print("����° ���� ���� �Է� : ");
      int c = Integer.parseInt(br.readLine());
      
      double avg = (double)(a+b+c)/3;

      if(avg>=60)
         if(a>=40 && b>=40 && c>=40) System.out.println("�հ�");
         else System.out.println("�������� ���հ�");
      else System.out.println("���հ�");
   }
}
*/
