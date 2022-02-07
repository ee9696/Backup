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
	
	public void menu() { //구현
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
			System.out.println("     1. 사원 등록");
			System.out.println("     2. 전체 출력");
			System.out.println("     3. 사원 정보 수정");
			System.out.println("     4. 퇴사");
			System.out.println("     5. 끝내기");
			System.out.println("********************");
			System.out.print("     번호 : ");
			num = scan.nextInt();
			if(num==5) break;
			
			if(num==1) insertEmp();
			else if(num==2) display();
			else if(num==3) updateEmp();
			else if(num==4) deleteEmp();
		}//while
	}

	private void deleteEmp() {
		System.out.print("사원번호 입력 : ");
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
			System.out.println("찾고자 하는 사원이 없습니다");
			return; 
		}
		
		ar[i] = null;
		
		System.out.println();
		System.out.println("삭제 완료...");
		
	}

	public void updateEmp() {
		System.out.print("사원번호 입력 : ");
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
			System.out.println("찾고자 하는 사원이 없습니다");
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
		System.out.print("수정할 사원명 입력 : ");
		ar[i].setName(scan.next());
		System.out.print("직급 입력 : ");
		ar[i].setPosition(scan.next());
		System.out.print("기본급 입력 : ");
		ar[i].setBasePay(scan.nextInt());
		System.out.print("수당 입력 : ");
		ar[i].setBenefit(scan.nextInt());
		
		ar[i].calc();
		
		System.out.println();
		System.out.println("수정 완료...");
	}

	public void display() {
		System.out.println();
		System.out.println("사원번호\t이름\t직급\t기본급\t\t수당\t세율\t세금\t월급");
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
			System.out.println("정원 초과..");
			return; //메소드를 벗어나라
		}
		
		ar[i] = new SalaryDTO();
		ar[i].calc();
		
		System.out.println();
		System.out.println("등록 완료...");
	}
	
}













