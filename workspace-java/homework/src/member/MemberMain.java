package member;

public class MemberMain {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		service.menu();
		System.out.println("프로그램 종료합니다");
	}

}