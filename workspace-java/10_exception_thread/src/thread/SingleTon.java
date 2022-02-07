package thread;

public class SingleTon {
	private int num=3;
	private static SingleTon instance= null; // 초기화, 1번
	

	public static SingleTon getInstance() {
		if(instance == null) {
			synchronized(SingleTon.class) {						
				instance = new SingleTon();  // 1번
			}
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = a" + aa);  //클@16진수
		System.out.println("num = " + aa.num); // 4
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = " + bb);  //클@16진수
		System.out.println("num " + bb.num);
		System.out.println();
		
		System.out.println("--- 싱글톤 ---");
		SingleTon cc = SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = " + cc);  //클@16진수
		System.out.println("num = " + cc.num); //4
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = " + dd);	//클@16진수
		System.out.println("num = " + dd.num);	//4
		System.out.println();
	}
}
