package inheritance2;

class Test {
	@Override
	public String toString() {
		return getClass() + "@개바부";
	}
}
//--------------------------------------------------------------
class Sample{
	
}
//---------------------------------------------------------------

public class ObjectMain {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString()); //클@16진수
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString()); //클@16진수
		System.out.println("객체 s = " + s.hashCode()); //10진수
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 s = " + str.toString());	//문자열
		System.out.println("객체 s = " + str.hashCode()); 	//10진수 - 문자열을 다 표현해주지 못한다.
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa=bb : " + (aa == bb)); // False
		System.out.println("aa.equals(bb) : " + (aa.equals(bb))); //문자열 비교 - True
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc == dd)); //False
		System.out.println("cc.equals(dd) : " + (cc.equals(dd))); // 주소 - F
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee == ff)); // 주소 - F
		System.out.println("ee.equals(ff) : " + (ee.equals(ff))); // 문자열 - T
	}
}
