package sample04;

import lombok.AllArgsConstructor;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String phone;
	private Outputter outputter;;
	
	
	public MessageBeanImpl() {
		System.out.println("MessageBeanImpl 기본 생성자");
	}
	
	public MessageBeanImpl(String name) {
		System.out.println("1. MessageBeanImpl 생성자");
		this.name = name;
	}

	public void setPhone(String phone) {
		System.out.println("4. setPhone(String phone)");
		this.phone = phone;
	}
	
	public void setOutputter(Outputter outputter) {
		System.out.println("5. setOutputter(outputter outputter");
		this.outputter = outputter;
		
	}
	
	@Override
	public void helloCall() {
		outputter.output("이름 = " + name +", 핸드폰 = " + phone);
	}

}
