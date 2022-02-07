package sample06;


import java.util.List;

import lombok.Setter;

public class SalaryOutput implements Salary {
	@Setter
	private List<SalaryDTO> list;
	
	@Override
	public void execute() {
		System.out.println();
		System.out.println("이름"+"\t"+"직급"+"\t"+"기본급"+"\t"+"수당"+"\t"+"세율"+"\t"+"월급");
		for(SalaryDTO salaryDTO : list) {
			System.out.println(salaryDTO);
		}

		
	}

}
