package thread;

class JoinTest implements Runnable { // �����尡 �ǰ� �ʹ�
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("i = " + i);
		}
		
	}
	
}
public class JoinMain {
	
	public static void main(String args[]) {
		JoinTest jt = new JoinTest(); //������ ����? - �ƴϴ�
		Thread t = new Thread(jt); // jt(JoinTest)�� ������ ����
		
		System.out.println("������ ����");
		t.start(); //������ ���� - ������ ����(run())
		try {
			t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
	}

	//������ ������ ������� ������� �ʴ´�.
	//������ ����Ǿ ��׶��忡�� ������� ���ư���.
}
