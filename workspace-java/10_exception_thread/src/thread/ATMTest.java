package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ATMTest implements Runnable {
	private long depositeMoney=100000; // �ܾ�
	private long balance; // ã���� �ϴ� �ݾ�

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		
		Thread mom = new Thread(atm, "����"); // ������ ����
		Thread son = new Thread(atm, "�Ƶ�");
		
		//mom.setName("����");
		//son.setName("�Ƶ�");
		
		mom.start();// ������ ����
		son.start();// ������ �밡
	}
	
	@Override
	public synchronized void run() {
		System.out.println("�ȳ��ϼ��� " + Thread.currentThread().getName() + "��");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("ã���� �ϴ� �ݾ� �Է� : ");
			balance = Long.parseLong(br.readLine());
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// �ܾ� ���
		if(depositeMoney >= balance) {
			if(balance%10000 == 0) {
				depositeMoney = depositeMoney - balance;
				System.out.println("�ܾ��� " + new DecimalFormat().format(depositeMoney) + "�� �Դϴ�");
			}else {
				System.out.println("���� ������ �Է��ϼ���");
			}
		}else {
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
}
