package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionMain {

	public static void main(String[] args) { // 구현
		
		//ArrayIndexOutOfBj
		if(args.length >= 1) System.out.println("args[0] = " + args[0]);
		
		ExceptionMain em = new ExceptionMain();
		em.sub(); // sub() 호출 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		try {
			System.out.print("정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			
			System.out.print("정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			
			System.out.println(a + " / " + b + " = " + a/b);
		}catch(IOException e) {
	
			e.printStackTrace();
		}catch(NumberFormatException e) {
			System.out.println("숫자 형태만 입력하세요");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다");
			e.printStackTrace();
		}finally {
			System.out.println("error가 있건 없건 무조건 실행!!");
		}
	}
	
	public void sub() {//구현
		System.out.println("호호호");
	}
}
