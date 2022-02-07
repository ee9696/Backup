package sample03_Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAroundAdvice implements MethodInterceptor {

	@Override							   //arg0
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//공통
		System.out.println("Around --- 입실체크");
		long start = System.currentTimeMillis();
		
		Object ob = invocation.proceed();//핵심 사항 호출
		
		//공통
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000 + "초");
		System.out.println("Around --- 퇴실체크");
		return ob;
	}

}
