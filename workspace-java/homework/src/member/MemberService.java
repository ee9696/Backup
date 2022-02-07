package member;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in);

	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("****************");
			System.out.println("   1. ȸ������");
			System.out.println("   2. �α���");
			System.out.println("   3. ȸ�� ����Ʈ");
			System.out.println("   4. ��");
			System.out.println("****************");
			System.out.print(" ��ȣ : ");
			num = scan.nextInt();
			if(num==4) break;
			
			if(num==1) this.writeMember();
			else if(num==2) loginMember();
			else if(num==3) listMember();
			else System.out.println("1~4���߿� �����ϼ���");
		}//while
		
	}//menu()

	private void listMember() {
		//DB
		MemberDAO dao = MemberDAO.getInstance();//�̱���
		List<MemberDTO> list = dao.listMember();
		
		for(MemberDTO dto : list) {
			System.out.println(dto);//Ŭ@16����
		}//for
	}

	public void loginMember() {
		System.out.print("���̵� �Է� : ");
		String id = scan.next();
		System.out.print("��й�ȣ �Է� : ");
		String pwd = scan.next();
		
		//DB
		MemberDAO dao = MemberDAO.getInstance();//�̱���
		String name = dao.loginMember(id, pwd);
		
		if(name == null) {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� ���� �ʽ��ϴ�");
		}else {
			System.out.println(name+"�� �α���");
		}
	}

	public void writeMember() {
		System.out.println();
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		System.out.print("���̵� �Է� : ");
		String id = scan.next();
		
		//DB
		MemberDAO dao = MemberDAO.getInstance();//�̱���
		boolean exist = dao.isExistId(id);
		if(exist) {
			System.out.println("�̹� ��� ���� ���̵��Դϴ�");
			return;
		}else {
			System.out.println("��� ������ ���̵��Դϴ�");
		}
		
		System.out.print("��й�ȣ �Է� : ");
		String pwd = scan.next();
		System.out.print("�̸��� �Է� : ");
		String email = scan.next();
		
		MemberDTO dto = new MemberDTO();
		dto.setName(name);
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setEmail(email);
		
		//DB
		dao.writeMember(dto);
		
		System.out.println("ȸ�������� �����մϴ�.");
	}
}