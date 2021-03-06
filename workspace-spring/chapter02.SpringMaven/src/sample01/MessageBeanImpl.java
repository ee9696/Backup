package sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component
@ComponentScan("spring.conf")
public class MessageBeanImpl implements MessageBean {
	
	private String fruit;
	
	private int cost, qty;
	
	/*
	public MessageBeanImpl() { 
		System.out.println("MessageBeanImpl 기본 생성자"); 
	}
	*/
	
	//constructor injection
	public MessageBeanImpl(@Value("딸기") String fruit) {
		this.fruit = fruit;
	}
	
	//Setter Injection
	@Autowired
	public void setCost(@Value("12000") int cost) {
		this.cost = cost;
	}
	@Autowired
	public void setQty(@Value("5") int qty) {
		this.qty = qty;
	}
	
	@Override
	public void sayHello() {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
		
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
		
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
		
	}

}
