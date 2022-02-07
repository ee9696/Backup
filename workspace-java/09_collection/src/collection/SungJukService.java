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
		list = new ArrayList<SungJukDTO>(); //�θ� = �ڽ�
	}

	public void menu() {
		int num;
		while(true) {
			System.out.println();
			System.out.println("****************");
			System.out.println("   1. �Է�");
			System.out.println("   2. ���");
			System.out.println("   3. �˻�");
			System.out.println("   4. ����");
			System.out.println("   5. ����");
			System.out.println("   6. ��");
			System.out.println("****************");
			System.out.print(" ��ȣ : ");
			num = scan.nextInt();
			  
			if(num==6) break;
			if(num==1) insertArticle();
			else if(num==2) printArticle();
			else if(num==3) searchArticle();
			else if(num==4) deleteArticle();
			else if(num==5) sortArticle();
			else System.out.println("1~6�߿� �����ϼ���");
		}//while
	}//menu()

	private void sortArticle() {
		System.out.println();
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("*********************");
			System.out.println("   1. �̸����� ��������");
			System.out.println("   2. �������� ��������");
			System.out.println("   3. �����޴�");
			System.out.println("*********************");
			System.out.print(" ��ȣ : ");
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
						//���ǿ�����  : ���� ? �� : ����;
						//return s1.getTot() > s2.getTot() ? 1 : -1; - ��������
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
		System.out.print("������ �̸� �Է� : ");
		String name = scan.next();
		int sw=0;
		
		Iterator<SungJukDTO> it = list.iterator(); //����
		while(it.hasNext()) { //�׸��� ������ T, ������ F
			SungJukDTO dto = it.next(); //�׸��� ������ �������� �̵�
			
			if(dto.getName().equals(name)) {
				it.remove(); //it�� ����Ű�� ���� ��ġ�� ����°� �ƴ϶� �ٷ� ������ �������� DTO�� �����
				sw=1;
			}
		}//while
		
		if(sw==0) 
			System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
		else
			System.out.println("�����͸� �����Ͽ����ϴ�.");
	}//deleteArticle()

	private void searchArticle() {
		System.out.println();
		System.out.print("�˻� �� �̸� �Է� : ");
		String findName = scan.next();
		int sw=0;
		
		for(SungJukDTO dto : list) {
			if(findName.equals(dto.getName())) {
				if(sw==0) System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
				System.out.println(dto);
				sw=1;
			}
		}//for
		
		if(sw==0) 
			System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
		
	}//searchArticle()

	private void printArticle() {
		System.out.println();
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for(SungJukDTO dto : list) {
			System.out.println(dto);
		}
		
	}

	private void insertArticle() {
		System.out.println();
		System.out.print("��ȣ �Է� : ");
		int num = scan.nextInt();
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		System.out.print("���� �Է� : ");
		int kor = scan.nextInt();
		System.out.print("���� �Է� : ");
		int eng = scan.nextInt();
		System.out.print("���� �Է� : ");
		int math = scan.nextInt();

		SungJukDTO dto = new SungJukDTO(num, name, kor, eng, math);
		dto.calc();//����, ��� ���
		
		list.add(dto);
		//System.out.println(list); //Ŭ@16���� --> [~,~,]
		
		System.out.println("��� �Ϸ�");
		
	}//insertArticle()
	
	
}
 








