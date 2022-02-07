package collection;

import java.util.ArrayList;

public class PersonMain {
	public ArrayList<PersonDTO> init() { // 구현
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("라이언", 30);
		PersonDTO cc = new PersonDTO("어피치", 28);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
		
		
	} //init
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		ArrayList<PersonDTO> list = pm.init(); //호출
		System.out.println("list = " + list);  // [~~~]
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName() + "\t"
					          + "나이 = : " + list.get(i).getAge());
		}
		
		System.out.println();
		
		for(PersonDTO dto : list) {
			System.out.println("이름 = " + dto.getName() + "\t나이 = " + dto.getAge());
		}
		
		System.out.println();
	}
}
