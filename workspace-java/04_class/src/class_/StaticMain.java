package class_;

public class StaticMain {
	private int a;			//필드, 인스턴스 변수
	private static int b;	//필드, 클래스 변수
	
	
	static {
		System.out.println("초기화 영역");
		b=3;
	}
	public StaticMain() {
		System.out.println("기본 생성자");
		a=3;
	}
	
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a=" + this.a + "\t b=" + b);  
	}
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a=" + this.a + "\t b=" + StaticMain.b); // static에선 this 사용불가능 error
	}
	public static void main(String[] args) {
		StaticMain st = new StaticMain();
		st.calc();
		st.disp();  // 4   1
		System.out.println();
		
		StaticMain st2 = new StaticMain();
		st2.calc();
		st2.disp(); // 4 2	
		System.out.println();
		
		StaticMain st3 = new StaticMain();
		st3.calc();
		st3.disp();
		System.out.println();
		
		//static 메소드 호출
		StaticMain.output();  //클래스명.메소드()
		output();
		st.output(); //객체.메소드()
	}   

}  //class StaticMain
