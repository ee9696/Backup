package input_;
import java.io.IOException;
class InputTest {
		public static void main(String[] args) throws IOException {
			System.out.print("������ : ");
			int a = System.in.read(); // 1�� ����
			System.in.read(); //flush
			System.in.read(); //flush

			System.out.print("������ : ");
			int b = System.in.read(); //1�� ����

			System.out.println("��� = " + a + ", " + b);
	}
}
