package calculator_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryService1 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	SalaryDTO1[] ar = new SalaryDTO1[5];
	
	public void menu() throws IOException {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println(" 1. ���");
			System.out.println(" 2. ���");
			System.out.println(" 3. ����");
			System.out.println(" 4. �˻�");
			System.out.println(" 5. ����");
			System.out.print(  "��ȣ : ");
			num = Integer.parseInt(br.readLine());
			if(num==5) break;

			if(num==1) insertEmp();
			if(num==2) display();
			if(num==3) updateEmp();
			if(num==4) serchEmp();
		}
	}
	public void updateEmp() throws IOException {
		System.out.print("������ �̸�?");
		String name = br.readLine();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getName().equals(name)) {
					break;
				}
			}
		}
		if(i==ar.length) {
			System.out.println("ã���� �ϴ� ����� �����ϴ�");
			return; 
		}
		// name cannot be resolved to a variable
		System.out.println(ar[i].getName()+"\t"
				 + ar[i].getPosition()+"\t"
				 + ar[i].getBasePay()+"\t"
				 + ar[i].getBenefit()+"\t"
				 + ar[i].getTaxRate()+"\t"
				 + ar[i].getSalary());
		
		System.out.println();
		System.out.print("��  �� : ");
		ar[i].setName(br.readLine());
		System.out.print("��  �� : ");
		ar[i].setPosition(br.readLine());
		System.out.print("�⺻�� �Է� : ");
		ar[i].setBasePay(Integer.parseInt(br.readLine()));
		System.out.print("��  �� �Է� : ");
		ar[i].setBenefit(Integer.parseInt(br.readLine()));
		
		ar[i].calc();
		
		System.out.println();
		
	}
	
	public void insertEmp() throws IOException {
		int i;
		for(i=0; i<ar.length; i++) {
		if(ar[i]==null) break;
		}
		
		ar[i] = new SalaryDTO1();
		
		
		System.out.print("��  �� : ");
		ar[i].setName(br.readLine());
		System.out.print("��  �� : ");
		ar[i].setPosition(br.readLine());
		System.out.print("�⺻�� �Է� : ");
		ar[i].setBasePay(Integer.parseInt(br.readLine()));
		System.out.print("��  �� �Է� : ");
		ar[i].setBenefit(Integer.parseInt(br.readLine()));
		
		ar[i].calc();
		
		int count = 0;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) count++;
		}
		
	}
	public void display() {
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getName() + "\t"
								 + ar[i].getPosition() + "\t"
								 + ar[i].getBasePay() + "\t"
								 + ar[i].getBenefit() + "\t"
								 + ar[i].getTaxRate() + "\t"
								 + ar[i].getSalary());
			}
		}
	}
	public void serchEmp() throws IOException {
		System.out.print("�˻��� �̸�?");
		String name = br.readLine();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getName().equals(name)) {
					break;
				}
			}
		}
		if(i==ar.length) {
			System.out.println("ã���� �ϴ� ����� �����ϴ�");
			return; 
			
			
		}
		System.out.println(ar[i].getName()+"\t"
				 + ar[i].getPosition()+"\t"
				 + ar[i].getBasePay()+"\t"
				 + ar[i].getBenefit()+"\t"
				 + ar[i].getTaxRate()+"\t"
				 + ar[i].getSalary());
	}
}
