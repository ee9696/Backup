package abc;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		int A, B, C;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("a = ");
		A = scan.nextInt();
		System.out.print("b = ");
		B = scan.nextInt();
		System.out.print("c = ");
		C = scan.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println((A%C)+(B%C)%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}

}
