package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest5 {
	
	public static void main(String args[]) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���۰� �Է� : ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		int end = Integer.parseInt(br.readLine());
		int sum = 0;
		int count = 0;
		
		for (int i = start; i<=end; i++) {
			sum += i;
			System.out.print(i + " ");
			count++;
			if(count%5==0) System.out.println();
		}
		System.out.println();
		System.out.println(start + "���� " + end + "������ �� : " + sum);
	}

}
