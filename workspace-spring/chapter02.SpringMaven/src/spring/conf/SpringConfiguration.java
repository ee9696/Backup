package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample05.HelloSpring;
import sample05.SungJukDTO2;
import sample05.SungJukDelete;
import sample05.SungJukInput;
import sample05.SungJukModify;
import sample05.SungJukOutput;

@Configuration
public class SpringConfiguration {
	// sample01
	@Bean
	public MessageBeanImpl messageBeanImpl(){		//메소드명은 반드시 클래스의 객체명/bean명으로 잡아야한다.
		return new MessageBeanImpl("딸기");
	}
	// sample02
	@Bean
	public CalcAdd calcAdd (){
		return new CalcAdd(25, 36);
	}
	// sample03
	@Bean(name="calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();
	}
	// sample05
	@Bean
	public HelloSpring helloSpring() {
		return new HelloSpring();
	}
	
	@Bean
	@Scope("prototype")
	public SungJukInput sungJukInput() {
		return new SungJukInput();
	}
	
	@Bean
	public SungJukOutput sungJukOutput() {
		return new SungJukOutput();
	}
	
	@Bean
	public SungJukModify sungJukModify() {
		return new SungJukModify();
	}
	
	@Bean
	public SungJukDelete sungJukDelete() {
		return new SungJukDelete();
	}
	
	@Bean
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>();
	}
}


//return 되는 클래스를 빈으로 생성해라 