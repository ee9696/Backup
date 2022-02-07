package basic;

import java.io.IOException;

public class SungJukMain {
	public static void main(String[] args) throws IOException {
		SungJuk[] ar = new SungJuk[3];
		for(int i=0; i<ar.length; i++) {
			ar[i] = new SungJuk();
		}
		
		ar[0].setData("홍길동", 90, 96, 100); //호출
		ar[1].setData("라이언", 100, 89, 75); //호출
		ar[2].setData("어피치", 75, 80, 48); //호출
		
		System.out.println("이름\t국어\t영어\t수학\t총\t평균\t학점");
		for(SungJuk s : ar) {
			s.calcTot();
			s.calcAvg();
			s.calcGrade();
			System.out.println(s.getName() + "\t"
							 + s.getKor() + "\t"
							 + s.getEng() + "\t"
							 + s.getMath() + "\t"
							 + s.getTot() + "\t"
							 + s.getAvg() + "\t"
							 + s.getGrade());
		}
	}
}