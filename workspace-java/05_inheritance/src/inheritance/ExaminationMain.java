package inheritance;

import java.util.Scanner;

public class ExaminationMain {
	public static void main(String[] args) {
		/*
		 Examination aa = new Examination(); // �޸� ���� + ������ ȣ��
		 aa.compare();
		 System.out.print(aa.getNome() + "\t");
		 for(int i=0; i<aa.getOx().length; i++)
		 	System.out.print(aa.getOx()[i] + " ");
		 	System.out.println("\t" + aa.getScore());
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ο��� �Է� : ");
		int size = scan.nextInt();
		
		Examination[] ar = new Examination[size];
		
		for(int i=0; i<size; i++) {
			ar[i] = new Examination();
			ar[i].compare();
		}
		
		for(int k=0; k<size; k++) {
			System.out.print(ar[k].getName() + "\t");
			
			for(int i=0; i<ar[k].getOx().length; i++)
				System.out.print(ar[k].getOx()[i] + " ");
			
			System.out.println("\t" + ar[k].getScore());
		} //for k
	}
}
