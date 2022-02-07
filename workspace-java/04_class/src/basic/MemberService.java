package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberService {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	MemberDTO[] ar = new MemberDTO[5];
	
	public void menu() throws IOException { //구현
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("*********************");
			System.out.println("      1. 가입");
			System.out.println("      2. 출력");
			System.out.println("      3. 수정");
			System.out.println("      4. 탈퇴");
			System.out.println("      5. 끝내기");
			System.out.println("*********************");
			System.out.print("    번호 : ");
			num = Integer.parseInt(br.readLine());
			if(num==5) break;
			
			if(num==1) insertMember();
			else if(num==2) list();
			else if(num==3) updateMember();
			else if(num==4) deleteMember();
		} //while
	}
	
	public void deleteMember() throws IOException {
		System.out.print("핸드폰 번호 입력 : ");
		String phone = br.readLine();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) break;
			} //if
		} // for
		
		if(i==ar.length) {
			System.out.println("찾고자 하는 회원이 없습니다");
			
		}else {
			ar[i] = null;
			System.out.println("탈퇴 완료...");
		}
	}
	
	public void updateMember() throws IOException {
		System.out.print("핸드폰 번호 입력 : ");
		String phone = br.readLine();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) break;
			} //if
		}// for
		
		if(i==ar.length) {
			System.out.println("찾고자 하는 회원이 없습니다.");
			return;
		}
		System.out.println(ar[i].getName() + "\t"
						 + ar[i].getAge() + "\t"
						 + ar[i].getPhone()+ "\t"
						 + ar[i].getAddress());
		
		System.out.print("이름 입력 : ");
		ar[i].setName(br.readLine());
		System.out.print("나이 입력 : ");
		ar[i].setAge(Integer.parseInt(br.readLine()));
		System.out.print("핸드폰 입력 : ");
		ar[i].setPhone(br.readLine());
		System.out.print("주소 입력 : ");
		ar[i].setAddress(br.readLine());
		
		System.out.println();
		System.out.println("수정 완료...");
		
	}
	public void list() {
		System.out.println();
		System.out.println("이름\t나이\t핸드폰\t\t주소");
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
			System.out.println("정원 초과..");
			return; //메소g드를 벗어나라
		}
		
		ar[i] = new MemberDTO();
		
		System.out.print("이름 입력 : ");
		ar[i].setName(br.readLine());
		System.out.print("나이 입력 : ");
		ar[i].setAge(Integer.parseInt(br.readLine()));
		System.out.print("핸드폰 입력 : ");
		ar[i].setPhone(br.readLine());
		System.out.print("주소 입력 : ");
		ar[i].setAddress(br.readLine());
		
		int count = 0;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) count++;
		}
		System.out.println();
		System.out.println("등록 완료...");
		System.out.println(count + "자리가 남았습니다.");
	}
}
