package sample03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Component
public class SungJukDTO {
	private @Value("홍길동") String name;
	private int kor=97, eng=100, math=95, tot;
	private double avg;
	
	public void setName(@Value("홍길동") String name) {
		this.name = name;
	}
	
	public void setKor(@Value("97") int kor) {
		this.kor = kor;
	}


	public void setEng(@Value("100") int eng) {
		this.eng = eng;
	}


	public void setMath(@Value("95") int math) {
		this.math = math;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg);
	}



	/*
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}*/
}
