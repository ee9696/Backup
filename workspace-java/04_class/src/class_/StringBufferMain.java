package class_;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	public StringBufferMain() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan = scan.nextInt();
	}
	
	public void display() {
		StringBuffer buffer = new StringBuffer();
		for(int i=1; i<=10; i++) {
			//System.out.println(dan + "*" + i + "=" + dan*i);
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString()); //StringBuffer -> String 변환
			buffer.delete(0, buffer.length());
		} //for
	}
	public static void main(String[] args) {
		StringBufferMain main = new StringBufferMain();
		main.display();

	}

}
