package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {
	
	public static void main(String[] args) {
		// 3자리마다 , 찍고 소수이하 3째자리
		// NumberFormat nf = new NumberFormat(); - error
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		// ㅇ효숫자가 아닌 것은 표현하지 않는다.
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		//강제로 0을 표시
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//추상클래스를 메소드를 이용하여 생성
		// 3자리마다, 찍고 소수이하 3째자리
		//NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf5 = NumberFormat.getInstance();
		nf5.setMaximumFractionDigits(2); // 소수이하 2째자리
		nf5.setMinimumFractionDigits(2); // 강제로 0을 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		//NumberFormat nf6 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		nf6.setMaximumFractionDigits(2);	// 소수 이하 2째자리
		nf6.setMinimumFractionDigits(2);	// 강제로 0을 표시
		System.out.println(nf6.format(12345678.456789));
		System.out.println(nf6.format(12345678));
		System.out.println();
	}
}
