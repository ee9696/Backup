package collection;

import static java.lang.System.out;
import java.util.LinkedList;

public class QueueMain {
	
	public static void main(String[] args) {
		String[] item = {"�ҳ�Ÿ", "������", "���Ծ�"};
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n : item)
			q.offer(n); //��� �߰�
		
		out.println("q�� ũ�� : "+q.size()+"\n");
		
		String data = "";
		
		while((data=q.poll()) != null) {
			out.println(data+" ����!");
			out.println("q�� ũ�� : "+q.size()+"\n");
		} //while
	}

}
