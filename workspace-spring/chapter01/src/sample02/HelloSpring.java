package sample02;

public class HelloSpring implements MessageBean {

	@Override
	public void sayHello(String name) {
//		MessageBeanEn messageBeanEn = new MessageBeanEn(); //결합도 100%, 1:1관계
		MessageBean messageBean = new MessageBeanKo(); //결합도 낮추기, 부모=자식
									//MessageBeanEn 클래스를 변경하려면 코드를 바꿔야 한다.
		
		messageBean.sayHello("Spring");	
		
	}

}
