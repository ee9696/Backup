package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberService {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	MemberDTO[] ar = new MemberDTO[5];
	
	public void menu() throws IOException { //����
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("*********************");
			System.out.println("      1. ����");
			System.out.println("      2. ���");
			System.out.println("      3. ����");
			System.out.println("      4. Ż��");
			System.out.println("      5. ������");
			System.out.println("*********************");
			System.out.print("    ��ȣ : ");
			num = Integer.parseInt(br.readLine());
			if(num==5) break;
			
			if(num==1) insertMember();
			else if(num==2) list();
			else if(num==3) updateMember();
			else if(num==4) deleteMember();
		} //while
	}
	
	public void deleteMember() throws IOException {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phone = br.readLine();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) break;
			} //if
		} // for
		
		if(i==ar.length) {
			System.out.println("ã���� �ϴ� ȸ���� �����ϴ�");
			
		}else {
			ar[i] = null;
			System.out.println("Ż�� �Ϸ�...");
		}
	}
	
	public void updateMember() throws IOException {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phone = br.readLine();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) break;
			} //if
		}// for
		
		if(i==ar.length) {
			System.out.println("ã���� �ϴ� ȸ���� �����ϴ�.");
			return;
		}
		System.out.println(ar[i].getName() + "\t"
						 + ar[i].getAge() + "\t"
						 + ar[i].getPhone()+ "\t"
						 + ar[i].getAddress());
		
		System.out.print("�̸� �Է� : ");
		ar[i].setName(br.readLine());
		System.out.print("���� �Է� : ");
		ar[i].setAge(Integer.parseInt(br.readLine()));
		System.out.print("�ڵ��� �Է� : ");
		ar[i].setPhone(br.readLine());
		System.out.print("�ּ� �Է� : ");
		ar[i].setAddress(br.readLine());
		
		System.out.println();
		System.out.println("���� �Ϸ�...");
		
	}
	public void list() {
		System.out.println();
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getName() + "\t"
						         + ar[i].getAge() + "\t"
						         + ar[i].getPhone() + "\t"
						         + ar[i].getAddress());
			}
		}
	}
	
	public void insertMember() throws IOException {
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) break;
		}
		
		if(i==ar.length) {
			System.out.println("���� �ʰ�..");
			return; //�޼�g�带 �����
		}
		
		ar[i] = new MemberDTO();
		
		System.out.print("�̸� �Է� : ");
		ar[i].setName(br.readLine());
		System.out.print("���� �Է� : ");
		ar[i].setAge(Integer.parseInt(br.readLine()));
		System.out.print("�ڵ��� �Է� : ");
		ar[i].setPhone(br.readLine());
		System.out.print("�ּ� �Է� : ");
		ar[i].setAddress(br.readLine());
		
		int count = 0;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) count++;
		}
		System.out.println();
		System.out.println("��� �Ϸ�...");
		System.out.println(count + "�ڸ��� ���ҽ��ϴ�.");
	}
}
