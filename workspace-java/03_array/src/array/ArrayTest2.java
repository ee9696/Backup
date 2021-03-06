package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException {
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = " + args[i]);
			System.out.println("args["+i+"] 문자열 크기 = " + args[i].length());
			System.out.println("args["+i+"] 첫번째 문자 = " + args[i].charAt(0));
			System.out.println();

		}
		System.out.println("확장 for");
		for(String data : args) {
			System.out.println(data);
			System.out.println("문자열 크기 = " + data.length());
			System.out.println("첫번째 문자 = " + data.charAt(0));
			System.out.println();
		}
		/* 
		 * 문자열을 입력받아서 가운데 위치한 문자를 출력하시오
		 * 
		 * [실행결과]
		 * 문자열 입력 : 코끼리     문자열 입력 :바다코끼리     문자열 입력 : 나무늘보
		 * 가운데 문자 = 끼		가운데 문자 = 코		   가운데 문자 = 늘
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력 : ");
		String str = br.readLine();
		
		int index = str.length() / 2;
		
		System.out.println("가운데 문자 = " + str.charAt(index));
	}

}
