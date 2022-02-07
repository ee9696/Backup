package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("���� �� = ");
		for(String str : ar) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		
		System.out.print("���� �� - ");
		for(String str : ar) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		PersonDTO aa = new PersonDTO("ȫ�浿",25);
		PersonDTO bb = new PersonDTO("���̾�",30);
		PersonDTO cc = new PersonDTO("����ġ",28);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("���� ��");
		System.out.println(list);
		System.out.println();
		
		Collections.sort(list);
		System.out.println("���̷� �������� : ");
		System.out.println(list);
		System.out.println();
		
		System.out.println("�̸����� ��������");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {;
		@Override
		public int compare(PersonDTO dto1, PersonDTO dto2) {
			//��������
//			return dto1.getName().compareTo(dto2.getName());
			//������
//			return dto2.getName().compareTo(dto1.getName());
			return dto1.getName().compareTo(dto2.getName()) * -1;
		}
	};
	
	Collections.sort(list, com);
	System.out.println(list);
	System.out.println();
	}
}
