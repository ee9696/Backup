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
			System.out.println("   1. 회원가입");
			System.out.println("   2. 로그인");
			System.out.println("   3. 회원 리스트");
			System.out.println("   4. 끝");
			System.out.println("****************");
			System.out.print(" 번호 : ");
			num = scan.nextInt();
			if(num==4) break;
			
			if(num==1) this.writeMember();
			else if(num==2) loginMember();
			else if(num==3) listMember();
			else System.out.println("1~4번중에 선택하세요");
		}//while
		
	}//menu()

	private void listMember() {
		//DB
		MemberDAO dao = MemberDAO.getInstance();//싱글톤
		List<MemberDTO> list = dao.listMember();
		
		for(MemberDTO dto : list) {
			System.out.println(dto);//클@16진수
		}//for
	}

	public void loginMember() {
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		
		//DB
		MemberDAO dao = MemberDAO.getInstance();//싱글톤
		String name = dao.loginMember(id, pwd);
		
		if(name == null) {
			System.out.println("아이디 또는 비밀번호가 맞지 않습니다");
		}else {
			System.out.println(name+"님 로그인");
		}
	}

	public void writeMember() {
		System.out.println();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		
		//DB
		MemberDAO dao = MemberDAO.getInstance();//싱글톤
		boolean exist = dao.isExistId(id);
		if(exist) {
			System.out.println("이미 사용 중인 아이디입니다");
			return;
		}else {
			System.out.println("사용 가능한 아이디입니다");
		}
		
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		System.out.print("이메일 입력 : ");
		String email = scan.next();
		
		MemberDTO dto = new MemberDTO();
		dto.setName(name);
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setEmail(email);
		
		//DB
		dao.writeMember(dto);
		
		System.out.println("회원가입을 축하합니다.");
	}
}