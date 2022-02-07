package constructor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryDTO {
	private int empId;
	private String name;
	private String position;
	private int basePay;
	private int benefit;
	private double taxRate;
	private int tax;
	private int salary;
	
	private DecimalFormat df = new DecimalFormat();
	
	public SalaryDTO() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����ȣ �Է� : ");
		empId = scan.nextInt();
		System.out.print("����� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		position = scan.next();
		System.out.print("�⺻�� �Է� : ");
		basePay = scan.nextInt();
		System.out.print("���� �Է� : ");
		benefit = scan.nextInt();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}
	
	public void calc() {
		int total = basePay + benefit;
		
		if(total <= 2000000) taxRate = 0.01;
		else if(total <= 4000000) taxRate = 0.02;
		else taxRate = 0.03;
		
		tax = (int)(total * taxRate);
		salary = total - tax;
	}
	
	public int getEmpId(){
		return empId;
	}
	public String getName(){
		return name;
	}
	public String getPosition(){
		return position;
	}
	public String getBasePay(){
		return df.format(basePay);
	}
	public int getBenefit(){
		return benefit;
	}
	public double getTaxRate(){
		return taxRate;
	}
	public int getTax(){
		return tax;
	}
	public int getSalary(){
		return salary;
	}
}









