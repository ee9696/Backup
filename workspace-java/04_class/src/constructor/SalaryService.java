package constructor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryService {
	private SalaryDTO[] ar;
	private Scanner scan = new Scanner(System.in);
	private DecimalFormat df = new DecimalFormat();
	
	
	public SalaryService(SalaryDTO[] ar) {
		this.ar = ar;
	}
	
	public void menu() { //����
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
			System.out.println("     1. ��� ���");
			System.out.println("     2. ��ü ���");
			System.out.println("     3. ��� ���� ����");
			System.out.println("     4. ���");
			System.out.println("     5. ������");
			System.out.println("********************");
			System.out.print("     ��ȣ : ");
			num = scan.nextInt();
			if(num==5) break;
			
			if(num==1) insertEmp();
			else if(num==2) display();
			else if(num==3) updateEmp();
			else if(num==4) deleteEmp();
		}//while
	}

	private void deleteEmp() {
		System.out.print("�����ȣ �Է� : ");
		int empId = scan.nextInt();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getEmpId() == empId) {
					break;
				}
			}//if
		}//for
		
		if(i==ar.length) {
			System.out.println("ã���� �ϴ� ����� �����ϴ�");
			return; 
		}
		
		ar[i] = null;
		
		System.out.println();
		System.out.println("���� �Ϸ�...");
		
	}

	public void updateEmp() {
		System.out.print("�����ȣ �Է� : ");
		int empId = scan.nextInt();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getEmpId() == empId) {
					break;
				}
			}//if
		}//for
		
		if(i==ar.length) {
			System.out.println("ã���� �ϴ� ����� �����ϴ�");
			return; 
		}
		
		System.out.println(ar[i].getEmpId()+"\t"
				 + ar[i].getName()+"\t"
				 + ar[i].getPosition()+"\t"
				 + ar[i].getBasePay()+"\t"
				 + df.format(ar[i].getBenefit())+"\t"
				 + (int)(ar[i].getTaxRate()*100)+"%\t"
				 + df.format(ar[i].getTax())+"\t"
				 + df.format(ar[i].getSalary()));
		
		System.out.println();
		System.out.print("������ ����� �Է� : ");
		ar[i].setName(scan.next());
		System.out.print("���� �Է� : ");
		ar[i].setPosition(scan.next());
		System.out.print("�⺻�� �Է� : ");
		ar[i].setBasePay(scan.nextInt());
		System.out.print("���� �Է� : ");
		ar[i].setBenefit(scan.nextInt());
		
		ar[i].calc();
		
		System.out.println();
		System.out.println("���� �Ϸ�...");
	}

	public void display() {
		System.out.println();
		System.out.println("�����ȣ\t�̸�\t����\t�⺻��\t\t����\t����\t����\t����");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getEmpId()+"\t"
								 + ar[i].getName()+"\t"
								 + ar[i].getPosition()+"\t"
								 + ar[i].getBasePay()+"\t"
								 + df.format(ar[i].getBenefit())+"\t"
								 + (int)(ar[i].getTaxRate()*100)+"%\t"
								 + df.format(ar[i].getTax())+"\t"
								 + df.format(ar[i].getSalary()));
			}//if
		}//for
	}

	public void insertEmp() {
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) break;
		}
		
		if(i==ar.length) {
			System.out.println("���� �ʰ�..");
			return; //�޼ҵ带 �����
		}
		
		ar[i] = new SalaryDTO();
		ar[i].calc();
		
		System.out.println();
		System.out.println("��� �Ϸ�...");
	}
	
}













