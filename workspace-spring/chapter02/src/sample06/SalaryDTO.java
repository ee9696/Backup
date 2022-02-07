package sample06;

import java.text.DecimalFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SalaryDTO {
	private String name, position;
	private int baseSalary, allowance, monthlyPaycheck;
	private double taxRate;
	
	
	@Override
	public String toString() {
		return name + "\t" + position + "\t" + baseSalary + "\t" + allowance + "\t" + (int)(taxRate*100)+"%" + "\t" + monthlyPaycheck;
	}

	
	
}
