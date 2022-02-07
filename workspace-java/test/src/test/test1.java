package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¼·¾¾ ¿Âµµ ÀÔ·Â : ");
		String F = scan.next();
		
		double F1 = Double.parseDouble(F);
		
		double C = (F1-32)/1.8;
		
		System.out.printf("È­¾¾ %.1fµµ´Â ¼·¾¾·Î %.1fµµ ÀÔ´Ï´Ù!", F1, C);
	}
}
