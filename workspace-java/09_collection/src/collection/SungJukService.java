package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SungJukService {
	Scanner scan = new Scanner(System.in);
	private List<SungJukDTO> list;
	
	public SungJukService() {
		list = new ArrayList<SungJukDTO>(); //부모 = 자식
	}

	public void menu() {
		int num;
		while(true) {
			System.out.println();
			System.out.println("****************");
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 검색");
			System.out.println("   4. 삭제");
			System.out.println("   5. 정렬");
			System.out.println("   6. 끝");
			System.out.println("****************");
			System.out.print(" 번호 : ");
			num = scan.nextInt();
			  
			if(num==6) break;
			if(num==1) insertArticle();
			else if(num==2) printArticle();
			else if(num==3) searchArticle();
			else if(num==4) deleteArticle();
			else if(num==5) sortArticle();
			else System.out.println("1~6중에 선택하세요");
		}//while
	}//menu()

	private void sortArticle() {
		System.out.println();
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("*********************");
			System.out.println("   1. 이름으로 오름차순");
			System.out.println("   2. 총점으로 내림차순");
			System.out.println("   3. 이전메뉴");
			System.out.println("*********************");
			System.out.print(" 번호 : ");
			num = scan.nextInt();
			if(num==3) break;
			
			if(num==1) {
//				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
//					@Override
//					public int compare(SungJukDTO s1, SungJukDTO s2) {
//						return s1.getName().compareTo(s2.getName());
//					}
//				};
//				
//				Collections.sort(list, com);
//				printArticle();
				
				Collections.sort(list);
				printArticle();
				
			}else if(num==2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						//조건연산자  : 조건 ? 참 : 거짓;
						//return s1.getTot() > s2.getTot() ? 1 : -1; - 오름차순
						return s1.getTot() > s2.getTot() ? -1 : 1;
					}
				};
				
				Collections.sort(list, com);
				printArticle();
			}
		}//while
	}//sortArticle()

	private void deleteArticle() {
		System.out.println();
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		int sw=0;
		
		Iterator<SungJukDTO> it = list.iterator(); //생성
		while(it.hasNext()) { //항목이 있으면 T, 없으면 F
			SungJukDTO dto = it.next(); //항목을 꺼내서 다음으로 이동
			
			if(dto.getName().equals(name)) {
				it.remove(); //it가 가리키는 현재 위치를 지우는게 아니라 바로 위에서 꺼내놓은 DTO를 지운다
				sw=1;
			}
		}//while
		
		if(sw==0) 
			System.out.println("찾고자 하는 이름이 없습니다.");
		else
			System.out.println("데이터를 삭제하였습니다.");
	}//deleteArticle()

	private void searchArticle() {
		System.out.println();
		System.out.print("검색 할 이름 입력 : ");
		String findName = scan.next();
		int sw=0;
		
		for(SungJukDTO dto : list) {
			if(findName.equals(dto.getName())) {
				if(sw==0) System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(dto);
				sw=1;
			}
		}//for
		
		if(sw==0) 
			System.out.println("찾고자 하는 이름이 없습니다.");
		
	}//searchArticle()

	private void printArticle() {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO dto : list) {
			System.out.println(dto);
		}
		
	}

	private void insertArticle() {
		System.out.println();
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();

		SungJukDTO dto = new SungJukDTO(num, name, kor, eng, math);
		dto.calc();//총점, 평균 계산
		
		list.add(dto);
		//System.out.println(list); //클@16진수 --> [~,~,]
		
		System.out.println("등록 완료");
		
	}//insertArticle()
	
	
}
 








