package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean messageBean =  (MessageBean) context.getBean("messageBean"); //부모 = 자식
		messageBean.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class);
		messageBean2.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean3 = context.getBean("messageBean", MessageBean.class);
		messageBean3.sayHello("Spring");
		System.out.println();
	}

}
