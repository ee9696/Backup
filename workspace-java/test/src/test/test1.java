package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �µ� �Է� : ");
		String F = scan.next();
		
		double F1 = Double.parseDouble(F);
		
		double C = (F1-32)/1.8;
		
		System.out.printf("ȭ�� %.1f���� ������ %.1f�� �Դϴ�!", F1, C);
	}
}
