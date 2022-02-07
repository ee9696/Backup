package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//CalcAdd calcAdd = new CalcAdd(25, 36);
		
		//CalcMul calcMul = new CalcMul();
		//calcMul.setX(25);
		//calcMul.setY(36);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Calc calc;
		calc = (Calc) context.getBean("calcAdd");
		calc.calculate();
		
		calc = context.getBean("calcMul", Calc.class);
		calc.calculate();
	}

}
