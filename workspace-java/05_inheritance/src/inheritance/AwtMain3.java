package inheritance;

import java.awt.Frame;
import java.awt.Button;

public class AwtMain3 extends Frame {
	private Button newBtn, exitBtn; //필드
	
	public void init() {
		newBtn = new Button("새로만들기");
		exitBtn = new Button("종료");
		
		setLayout(null);
		newBtn.setBounds(100, 100, 120, 50);
		exitBtn.setBounds(100, 170, 120, 50);
		
		add(newBtn);
		add(exitBtn);
		
		setTitle("창");
		setBounds(900, 200, 300, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AwtMain3().init();
		
		
	}
}
