class NumberTest {
	public static void main(String[ ] args) {
		System.out.println("'A' + 3 = " + ('A' + 3));
		System.out.println("\"A\" + 3 = " + ("A"+3));
		System.out.println("'a' - 32 = " + ('a'-32));
		System.out.println("'a' - 32 = " + (char)('a'-32));	// A, 형변환(casting)
		System.out.println("25 / 3 = " + (25/3));	// 정수 / 정수 => 정수
		System.out.println("25. / 3 = " + (25./3));	// 실수 / 정수 => 실수
		System.out.println("(double)25. / 3 = " + ((double)25/3));	// 실수 / 정수 => 실수
		System.out.println("25. / 3 = " + String.format("%.2f",25./3));
		System.out.printf("25. / 3 = %.2f\n", (25./3));
	}
}


[실행결과]

'A' + 3 = 68
"A" + 3 = A3
'a' - 32 = 65
'a' - 32 = A
25 / 3 = 8
25. / 3 = 8.333333333333334
(double)25. / 3 = 8.333333333333334
25. / 3 = 8.33
25. / 3 = 8.33