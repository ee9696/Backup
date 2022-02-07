package inheritance;

public class SuperTest {
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("SuperTest 클래스 생성자");
	}
	
	
	public SuperTest(double w, double h) {
		System.out.println("SuperTest 클래스 생성자");
		this.weight = w;
		this.height = h;
	}
	
	public void disp() {
		System.out.println("SuperTest 클래스 disp()");
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
}
