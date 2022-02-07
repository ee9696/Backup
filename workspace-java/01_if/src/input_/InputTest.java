package input_;
import java.io.IOException;
class InputTest {
		public static void main(String[] args) throws IOException {
			System.out.print("데이터 : ");
			int a = System.in.read(); // 1개 문자
			System.in.read(); //flush
			System.in.read(); //flush

			System.out.print("데이터 : ");
			int b = System.in.read(); //1개 문자

			System.out.println("결과 = " + a + ", " + b);
	}
}
