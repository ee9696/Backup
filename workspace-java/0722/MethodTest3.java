import java.util.Arrays;
import java.util.Random; // default package : java.lang

class MethodTest3 {
	public static void main(String[] args) {
		System.out.println("�ִ밪 = " + Math.max(25, 36));
		System.out.println("�ּҰ� = " + Math.min(25.3, 36.7));

		// ���� - ��ǻ�Ͱ� �ұ�Ģ�ϰ� �߻��ϴ� ��  0<= ���� < 1
		System.out.println("���� = " + Math.random());

		Random r = new Random();
		System.out.println("���� = " + r.nextDouble());

		//����
		int[] ar = {25,12,37,56};
		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]);

		Arrays.sort(ar);
		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]);
	}
}
