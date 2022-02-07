package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ATMTest implements Runnable {
	private long depositeMoney=100000; // 잔액
	private long balance; // 찾고자 하는 금액

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		
		Thread mom = new Thread(atm, "엄마"); // 스레드 생성
		Thread son = new Thread(atm, "아들");
		
		//mom.setName("엄마");
		//son.setName("아들");
		
		mom.start();// 스레드 시작
		son.start();// 스레드 싲가
	}
	
	@Override
	public synchronized void run() {
		System.out.println("안녕하세요 " + Thread.currentThread().getName() + "님");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("찾고자 하는 금액 입력 : ");
			balance = Long.parseLong(br.readLine());
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// 잔액 계산
		if(depositeMoney >= balance) {
			if(balance%10000 == 0) {
				depositeMoney = depositeMoney - balance;
				System.out.println("잔액은 " + new DecimalFormat().format(depositeMoney) + "원 입니다");
			}else {
				System.out.println("만원 단위로 입력하세요");
			}
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
}
