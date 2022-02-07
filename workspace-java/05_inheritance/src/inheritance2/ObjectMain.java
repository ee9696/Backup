package inheritance2;

class Test {
	@Override
	public String toString() {
		return getClass() + "@���ٺ�";
	}
}
//--------------------------------------------------------------
class Sample{
	
}
//---------------------------------------------------------------

public class ObjectMain {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��ü t = " + t);
		System.out.println("��ü t = " + t.toString()); //Ŭ@16����
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("��ü s = " + s.toString()); //Ŭ@16����
		System.out.println("��ü s = " + s.hashCode()); //10����
		System.out.println();
		
		String str = "apple";
		System.out.println("��ü s = " + str.toString());	//���ڿ�
		System.out.println("��ü s = " + str.hashCode()); 	//10���� - ���ڿ��� �� ǥ�������� ���Ѵ�.
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa=bb : " + (aa == bb)); // False
		System.out.println("aa.equals(bb) : " + (aa.equals(bb))); //���ڿ� �� - True
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc == dd)); //False
		System.out.println("cc.equals(dd) : " + (cc.equals(dd))); // �ּ� - F
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee == ff)); // �ּ� - F
		System.out.println("ee.equals(ff) : " + (ee.equals(ff))); // ���ڿ� - T
	}
}
