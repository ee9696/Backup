package class_;

import java.util.Scanner;

public class StringMain2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index = 0;
		int count = 0;
		
		System.out.print("���ڿ� �Է� : ");
		String str = scan.next();
		
		System.out.print("���� ���ڿ� �Է� : ");
		String target = scan.next();
		
		System.out.print("�ٲ� ���ڿ� �Է� : ");
		String replacing = scan.next();
		
		if(str.length() < target.length())
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
		else {
			
			while( (index = str.indexOf(target, index)) != -1) {
				count++;
				index += target.length();
			}//while
			
			System.out.println(str.replace(target, replacing));
			System.out.println(count+"�� ġȯ");
		}
	}
		

}
