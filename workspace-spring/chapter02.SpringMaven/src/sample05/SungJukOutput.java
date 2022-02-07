package sample05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

//@Component
public class SungJukOutput implements SungJuk {
	
	
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;
	
	
//	public void setList(List<SungJukDTO2> list) {
//	this.list = list;
//}
	
	@Override
	public void execute() {
		System.out.println();
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
		for(SungJukDTO2 sungJukDTO2: list) {
			System.out.println(sungJukDTO2);
		}
	}



}
