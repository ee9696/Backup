package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dec; //4byte - 32bit
		int[] binary = new int[32];
		
		while(true) {
			System.out.print("10진수 입력 : ");
			dec = Integer.parseInt(br.readLine());
			if(dec==0) break;
			if(dec<0) continue;
			
			//만약에 5를 2진수로 변환
			int i;
			for(i=0; dec!=0; i++) {
				//System.out.println("i=" + i);
			binary[i] = dec%2;
			dec/=2; //몫
			} //for
			//System.out.println("탈출 i=" + i);
			
			//거꾸로 출력
			for(int k=i-1; k>=0; k--) {
				System.out.print(binary[k]);
				if(k%4==0) System.out.print(" ");
			}
			System.out.println("\n");
		} //while
		System.out.println("프로그램을 종료합니다.");
	}
}
