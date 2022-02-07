package inheritance2;

public class FinalMain {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "호랑이";
	public static final String ANIMAL2;
	
	
	static {
		ANIMAL2 = "기린";
	}
	
	public FinalMain() {
		FRUIT2 = "딸기"; //초기화
	}
	
	public static void main(String[] args) {
		
		final int AGE = 25;
		//AGE = 30; - error final 이기 때문에 변경 불가능
		System.out.println("AGE = " + AGE);
		
		final int AGE2;
		AGE2 = 30;
		System.out.println("AGE2 = " + AGE2);
		
		FinalMain aa =  new FinalMain();
		System.out.println("FRUIT = " + aa.FRUIT);
		System.out.println("FRUIT2 = " + aa.FRUIT2);
		
		System.out.println("ANIMAL = " + FinalMain.ANIMAL);
		System.out.println("ANIMAL2 = " + FinalMain.ANIMAL2);
	}

}
