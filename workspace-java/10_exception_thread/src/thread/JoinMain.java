package thread;

class JoinTest implements Runnable { // 스레드가 되고 싶다
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("i = " + i);
		}
		
	}
	
}
public class JoinMain {
	
	public static void main(String args[]) {
		JoinTest jt = new JoinTest(); //스레드 생성? - 아니다
		Thread t = new Thread(jt); // jt(JoinTest)를 스레드 생성
		
		System.out.println("스레드 시작");
		t.start(); //스레드 시작 - 스레드 실행(run())
		try {
			t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
	}

	//메인이 끝나도 스레드는 종료되지 않는다.
	//메인이 종료되어도 백그라운드에서 스레드는 돌아간다.
}
