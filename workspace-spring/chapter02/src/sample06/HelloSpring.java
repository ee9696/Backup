package sample06;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		helloSpring.menu(context);
		System.out.println("프로그램을 종료합니다.");
	}
	public void menu(ApplicationContext context) {
		Scanner scan = new Scanner(System.in);
		int num;
		Salary salary = null;
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 등록");
			System.out.println(" 2. 출력");
			System.out.println(" 3. 끝 ");
			System.out.println("************");
			System.out.print("  입력 : ");
			num = scan.nextInt();
			
			if(num == 3) break;
			
			if(num == 1) salary = (Salary) context.getBean("salaryInput");
			else if(num == 2) salary = (Salary) context.getBean("salaryOutput");
			
			salary.execute();
			
		}
	}
}
