package sample06;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SalaryInput implements Salary {
	@Setter
	private SalaryDTO salaryDTO;
	@Setter
	private List<SalaryDTO> list;
	
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("직급 입력 : ");
		String position = scan.next();
		System.out.print("기본급 입력 : ");
		int baseSalary = scan.nextInt();
		System.out.print("수당 입력 : ");
		int allowance = scan.nextInt();	
		
		double taxRate;
		if((baseSalary+allowance) <= 2000000) taxRate = 0.01;
		else if((baseSalary+allowance) <= 4000000) taxRate = 0.02;
		else taxRate = 0.03;
		
		int monthlyPaycheck = (int) (baseSalary + allowance - (baseSalary+allowance) * taxRate);
		
		salaryDTO.setName(name);
		salaryDTO.setPosition(position);
		salaryDTO.setBaseSalary(baseSalary);
		salaryDTO.setAllowance(allowance);
		salaryDTO.setTaxRate(taxRate);
		salaryDTO.setMonthlyPaycheck(monthlyPaycheck);
		
		list.add(salaryDTO);
		
		System.out.println(name+position+"님 데이터를 입력하였습니다.");
		
	}

}
