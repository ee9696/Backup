
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Parking {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int menu;
		boolean[] ar = new boolean[5];
		int index;
		
		while(true) {
			System.out.println("**************");
			System.out.println("	1. ����");
			System.out.println("	2. ����");
			System.out.println("	3. ����Ʈ");
			System.out.println("	4. ����");			
			System.out.println("**************");
			System.out.print("�޴� : ");
			menu = Integer.parseInt(br.readLine());
			if(menu==4) break;
			
			if(menu==1) { 
				System.out.print("��ġ �Է� : ");
				index = Integer.parseInt(br.readLine());
				if(ar[index-1] == true)
					System.out.println("�̹� �����Ǿ� �ֽ��ϴ�.");
				else {
					System.out.println(index + "��ġ�� ����");
					ar[index-1] = true;
				}
			}	
			else if(menu==2) {
				System.out.print("��ġ �Է� : ");
				index = Integer.parseInt(br.readLine());
				if(ar[index-1] == false)
					System.out.println("�����Ǿ� ���� �ʽ��ϴ�.");
				else {
					System.out.println(index + "��ġ�� ����");
					ar[index-1] = false;
				}
			}
			else if(menu==3) {
				for(int i=0; i<ar.length; i++) 
					System.out.println((i+1) + "��ġ" + ar[i]);
			}else
				System.out.println("1~4�������� �Է��ϼ���.");
		}//while
	      System.out.println("���α׷� �����մϴ�.");

	}
}


			


