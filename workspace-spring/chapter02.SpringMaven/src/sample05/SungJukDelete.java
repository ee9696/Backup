package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

//@Component
public class SungJukDelete implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\n" + "삭제할 이름 입력 : ");
		String name = scan.next();
		
		Iterator<SungJukDTO2> it = list.iterator();
		int sw=0;
		while(it.hasNext()) { //항목이 있으면 T, 없으면 F
			if(it.next().getName().equals(name)) {  //it.next = 항목을 꺼내서 저장하고 다음 항목으로 이동
				sw=1;
				it.remove();
				System.out.println(name + "님 데이터를 삭제하였습니다");
				
				//return;
			}//if
		}//while
		
		//System.out.println("찾고자하는 이름이 없습니다.");
	}

}
