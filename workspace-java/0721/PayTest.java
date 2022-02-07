import java.text.DecimalFormat;

class PayTest {
	public static void main(String[] args) {
		char name = 'L';
		// String name = "L";

		int basePay = 2500000;
		double tax = (double)basePay * 0.033;
		double salary = (double)basePay - tax;

		// 숫자 3자리마다 ,를 표시
		DecimalFormat df = new DecimalFormat();

		System.out.println("*** " + name + "의 월급 ***");
		System.out.println("기본급 : " + df.format(basePay) + "원");
		System.out.println("세금  : " + df.format((int)tax) + "원");
		System.out.println("월급  : " + df.format((int)salary) + "원");

		
	}
}


[실행결과]

*** L의 월급 ***
기본급 : 2,500,000원
세금  : 82,500원
월급  : 2,417,500원