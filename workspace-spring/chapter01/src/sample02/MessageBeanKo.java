package sample02;
								//인터페이스 상속함으로써 인터페이스와 구현 부분을 분리
public class MessageBeanKo implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요 "+name+"!!");
		
	}

}
