package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	 // ↓Component를 빈으로 생성 시킨다.
public class SungJukImpl implements SungJuk {
	//private String name;
	//private int kor, eng, math, tot;
	//private double avg;
	@Autowired   // @AAutowired - @Component로 생성된 스프링 빈들중에서 자동으로 매핑해라
 	private SungJukDTO sungJukDTO;
	Scanner scan = new Scanner(System.in);
	
	//public SungJukImpl(SungJukDTO sungJukDTO) {
	//	this.sungJukDTO = sungJukDTO;
	//}

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());			
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);		
	}

	@Override
	public void display() {
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
		System.out.println(sungJukDTO); //클래스명@16진수
	}

	@Override
	public void modify() {
		
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
		
	}

}
