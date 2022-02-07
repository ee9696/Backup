import java.util.Arrays;
import java.util.Random; // default package : java.lang

class MethodTest3 {
	public static void main(String[] args) {
		System.out.println("최대값 = " + Math.max(25, 36));
		System.out.println("최소값 = " + Math.min(25.3, 36.7));

		// 난수 - 컴퓨터가 불규칙하게 발생하는 수  0<= 난수 < 1
		System.out.println("난수 = " + Math.random());

		Random r = new Random();
		System.out.println("난수 = " + r.nextDouble());

		//정렬
		int[] ar = {25,12,37,56};
		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]);

		Arrays.sort(ar);
		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]);
	}
}
