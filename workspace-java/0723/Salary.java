/*
월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000 만원 이상이면 3% 아니면 2%로 한다 (조건연산자 - 조건 ? 참 : 거짓)

급여 = 기본급 + 수당
세금 = 급여 * 세율
월급 = 급여 - 세금

세금은 calcTax() 메소드 구하여 가져온다 (return)
월급은 calcSalary()  메소드 구하여 가져온다 (return)

[실행결과]
이름 입력  : 홍길동
직급 입력  : 부장
기본급 입력 : 4500000
수당 입력 : 200000

         *** 홍길동 월급 명세서 ***
직급 : 부장
기본급          수당         급여         세율      세금      월급
4,500,000     200,000     4,700,000   3%      xxxxx   xxxxxxx
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Salary {
   public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Salary sal = new Salary();

		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("직급 입력 : ");
		String a = br.readLine();
		System.out.print("기본급 입력 : ");
		int baseSalary = Integer.parseInt(br.readLine());
		System.out.print("수당 입력 : ");
		int allowance = Integer.parseInt(br.readLine());
		//int pay = baseSalary + allowance;
		//double taxRate = baseSalary >= 4000000 ? 0.03 : 0.02;
		//int tax = (int)(baseSalary * taxRate);
		//int monthlyPaycheck = (int)(pay - tax);

		int pay = sal.pa(baseSalary, allowance);
		double taxRate = sal.tr(baseSalary);
		int tax = (int)sal.ta(baseSalary, taxRate);
		int monthlyPaycheck = (int)sal.monthPay(pay, tax);

		System.out.println();

		DecimalFormat df = new DecimalFormat();

		System.out.println("\t *** " + name + " 월급 명세서 ***");
		System.out.println("직급 : " + a);
		System.out.println(" 기본급\t\t 수당\t  급여\t\t세율\t세금\t월급");
		System.out.println(df.format(baseSalary) + "\t" + df.format(allowance) + "\t" + df.format(pay) + "\t" + (int)(taxRate*100) + "%" + "\t" + df.format(tax) + "\t" + df.format(monthlyPaycheck));
		//System.out.println(df.format(baseSalary) + "\t" + df.format(allowance) + "\t" + df.format(pay) + "\t" + (int)(taxRate*100) + "%" + "\t" + df.format(tax) + "\t" + df.format(monthlyPaycheck));
	}
	public int pa (int baseSalary, int allowance) {
			return baseSalary + allowance;
	}
	public int ta (int baseSalary, double taxRate){
			return (int)(baseSalary * taxRate);
	}
	public double tr (int baseSalary){
		return baseSalary >= 4000000 ? 0.03 : 0.02; 
	}
	public double monthPay (int pay, double tax){
		return pay - tax;
	}
	
}