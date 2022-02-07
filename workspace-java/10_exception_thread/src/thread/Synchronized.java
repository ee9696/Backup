package thread;

public class Synchronized extends Thread {
	private static int count;
	
	public Synchronized() {
		System.out.println("this = " + this);
	}
	
	public static void main(String argsp[]) {
		Synchronized aa = new Synchronized(); //������ ����
		Synchronized bb = new Synchronized(); //������ ����
		Synchronized cc = new Synchronized(); //������ ����
		
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");
		
		aa.start(); //������ ����
		bb.start(); //������ ����
		cc.start(); //������ ����
	}
	
	@Override
	//public synchronized void run() {  - ����ȭ X
	public void run() {
		
		//synchronized(this){ - ����ȭ X
		synchronized(Synchronized.class) {
		for(int i=1; i<=5; i++) {
			count++;
			System.out.println(Thread.currentThread().getName()+" : count =" + count);
		}
		}
	}
}
