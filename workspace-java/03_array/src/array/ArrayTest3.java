package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArrayTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("�迭 ũ�� �Է� : ");
		int size = Integer.parseInt(br.readLine());
		int[] ar = new int[size];
		int sum=0;
		int max, min;
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar[" + i + "] �Է� : ");
			ar[i] = Integer.parseInt(br.readLine());
			
			sum += ar[i];
		} //for
		
		//�ִ밪
		max = min = ar[0];
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min)	min = ar[i];
		}
	
		
		for(int a : ar) {
			System.out.print(a+"  ");
		}
		System.out.println();
		System.out.println("�� = " + sum);
		System.out.println("�ִ밪 = "+ max);
		System.out.println("�ּҰ� = "+ min);
		/*
		ar[0] �Է� :
		ar[1] �Է� : 
		ar[2] �Է� : 
		*/
	}

}
