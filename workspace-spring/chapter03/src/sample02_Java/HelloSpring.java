package sample02_Java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean = new MessageBeanImpl();
		
		MessageBean proxy = (MessageBean) Proxy.newProxyInstance(
				MessageBeanImpl.class.getClassLoader(), 
				new Class[] {MessageBean.class}, 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("입실"); //공통, 부가기능
						
						Object ob = method.invoke(messageBean, args); //핵심 사항 호출
						
						System.out.println("퇴실"); //공통, 부가기능
						
						return ob;
					}
				});
		proxy.study();
		System.out.println("----------------");
		System.out.println("결과 = " + proxy.game());
	}

}
