package class_;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.Math.*; // * : 와일드카드(모든 것)
import static java.lang.System.out;

import java.util.Random;

public class ImportStatic {
	
	public static void main(String[] args) {
		System.out.println("난수 = " + Math.random());	// 0<=난수<1
		
		Random r = new Random();
		System.out.println("난수 = " + r.nextDouble());	//0<=난수<1
		System.out.println("정수형 난수 = " + r.nextInt());
		System.out.println("정수형 난수 = " + (r.nextInt(100) + 1)); //1~100
		
		System.out.println("2의 5승 = " + Math.pow(2, 5));
	}
}
