package class_;

import java.util.Scanner;

public class StringMain2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index = 0;
		int count = 0;
		
		System.out.print("문자열 입력 : ");
		String str = scan.next();
		
		System.out.print("현재 문자열 입력 : ");
		String target = scan.next();
		
		System.out.print("바꿀 문자열 입력 : ");
		String replacing = scan.next();
		
		if(str.length() < target.length())
			System.out.println("입력한 문자열의 크기가 작습니다.");
		else {
			
			while( (index = str.indexOf(target, index)) != -1) {
				count++;
				index += target.length();
			}//while
			
			System.out.println(str.replace(target, replacing));
			System.out.println(count+"개 치환");
		}
	}
		

}
