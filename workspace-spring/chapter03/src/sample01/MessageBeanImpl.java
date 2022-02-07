package sample01;

public class MessageBeanImpl implements MessageBean {
	private String str;
	
	//target
	public void setStr(String str) {
		this.str = str;
	}
	
	
	
	@Override
	public void showPrintBefore() {
		System.out.println("showPrintBefore 메세지 = " + str);
		
	}

	@Override
	public void viewPrintBefore() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintBefore = " + str);
		
	}

	@Override
	public void showPrintAfter() {
		System.out.println("showPrintAfter 메세지 = " + str);
		
	}

	@Override
	public void viewPrintAfter() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintAfter = " + str);
		
	}
	
	@Override
	public String showPrint() {
		System.out.println("showPrint 메세지 = " + str);
		return "오늘 하늘이 참 이뻐용";
		
	}

	@Override
	public void viewPrint() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrint = " + str);
		
	}
	
	@Override
	public void display() {
		System.out.println("display 메세지 = " + str);
		
	}

}
