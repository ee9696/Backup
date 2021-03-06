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
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 리스트");
			System.out.println("4. 끝");
			System.out.println("*****************");
			System.out.print("  번호 입력 : ");
			num = scan.nextInt();
			
			if(num==4) break;
			if(num==1) writeMember();
			else if(num==2) loginMember();
			else if(num==3) listMember();
			else System.out.println("1~4중에 선택하세요.");
		} //while
	}// menu
	
	public void writeMember() {
		
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("아이디 입력 : ");
		id = scan.next();
		System.out.print("비밀번호 입력 : ");
		pwd = scan.next();
		System.out.print("이메일 입력 : ");
		email = scan.next();
		
		MemberDTO dto = new MemberDTO();
		dto.setName(name);
		dto.setId(id);	
		dto.setPwd(pwd);
		dto.setEmail(email);
		
		MemberDAO dao = new MemberDAO();
		dao.writeMember(dto);
		
			System.out.println("회원가입을 축하합니다.");
		
		
		}
	
	
	public void loginMember() {
		System.out.print("아이디 입력 : ");
		id = scan.next();
		System.out.print("비밀번호 입력 : ");
		pwd = scan.next();
		
		MemberDAO dao = new MemberDAO();
		String name = dao.loginMember(id, pwd);
		
		if(name == null) {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}else {
			System.out.println(name + "님 로그인");
		}
	}
	
	public void listMember() {
		System.out.println();
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.listMember();
		
		System.out.println("이름\t아이디\t비밀번호\t\t이메일");
		for(MemberDTO dto :list) {
			System.out.println(dto);
		}
		
		
	}
}
