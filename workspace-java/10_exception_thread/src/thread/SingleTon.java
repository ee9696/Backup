package thread;

public class SingleTon {
	private int num=3;
	private static SingleTon instance= null; // �ʱ�ȭ, 1��
	

	public static SingleTon getInstance() {
		if(instance == null) {
			synchronized(SingleTon.class) {						
				instance = new SingleTon();  // 1��
			}
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = a" + aa);  //Ŭ@16����
		System.out.println("num = " + aa.num); // 4
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = " + bb);  //Ŭ@16����
		System.out.println("num " + bb.num);
		System.out.println();
		
		System.out.println("--- �̱��� ---");
		SingleTon cc = SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = " + cc);  //Ŭ@16����
		System.out.println("num = " + cc.num); //4
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = " + dd);	//Ŭ@16����
		System.out.println("num = " + dd.num);	//4
		System.out.println();
	}
}
