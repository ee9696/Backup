package class_;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.Math.*; // * : ���ϵ�ī��(��� ��)
import static java.lang.System.out;

import java.util.Random;

public class ImportStatic {
	
	public static void main(String[] args) {
		System.out.println("���� = " + Math.random());	// 0<=����<1
		
		Random r = new Random();
		System.out.println("���� = " + r.nextDouble());	//0<=����<1
		System.out.println("������ ���� = " + r.nextInt());
		System.out.println("������ ���� = " + (r.nextInt(100) + 1)); //1~100
		
		System.out.println("2�� 5�� = " + Math.pow(2, 5));
	}
}
