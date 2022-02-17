package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemberService {
	Scanner scan = new Scanner(System.in);
	private String name, id, pwd, email;
	private List<MemberDTO> list;
	
	public MemberService() {
		list = new ArrayList<MemberDTO>();
	}

	public void menu() {
		int num;
		while(true) {		
			System.out.println();
			System.out.println("*****************");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ȸ�� ����Ʈ");
			System.out.println("4. ��");
			System.out.println("*****************");
			System.out.print("  ��ȣ �Է� : ");
			num = scan.nextInt();
			
			if(num==4) break;
			if(num==1) writeMember();
			else if(num==2) loginMember();
			else if(num==3) listMember();
			else System.out.println("1~4�߿� �����ϼ���.");
		} //while
	}// menu
	
	public void writeMember() {
		
		
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���̵� �Է� : ");
		id = scan.next();
		System.out.print("��й�ȣ �Է� : ");
		pwd = scan.next();
		System.out.print("�̸��� �Է� : ");
		email = scan.next();
		
		MemberDTO dto = new MemberDTO();
		dto.setName(name);
		dto.setId(id);	
		dto.setPwd(pwd);
		dto.setEmail(email);
		
		MemberDAO dao = new MemberDAO();
		dao.writeMember(dto);
		
			System.out.println("ȸ�������� �����մϴ�.");
		
		
		}
	
	
	public void loginMember() {
		System.out.print("���̵� �Է� : ");
		id = scan.next();
		System.out.print("��й�ȣ �Է� : ");
		pwd = scan.next();
		
		MemberDAO dao = new MemberDAO();
		String name = dao.loginMember(id, pwd);
		
		if(name == null) {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
		}else {
			System.out.println(name + "�� �α���");
		}
	}
	
	public void listMember() {
		System.out.println();
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.listMember();
		
		System.out.println("�̸�\t���̵�\t��й�ȣ\t\t�̸���");
		for(MemberDTO dto :list) {
			System.out.println(dto);
		}
		
		
	}
}