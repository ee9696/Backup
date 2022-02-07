package test;

public class A {
	
	private String field;
	
	public A() {
		
	}
	
	private void method() {
		System.out.println("클래스 A의 method");
	}
	
	String getField() {
		return field;
	}
	void setField(String field) {
		this.field = field;
	}

}

class A1{
	void method() {
		A a = new A();
		a.setField("value");
		System.out.println(a.getField());
	}
}
