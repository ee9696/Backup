package inheritance;

import java.awt.Frame;
import java.awt.Button;

public class AwtMain3 extends Frame {
	private Button newBtn, exitBtn; //�ʵ�
	
	public void init() {
		newBtn = new Button("���θ����");
		exitBtn = new Button("����");
		
		setLayout(null);
		newBtn.setBounds(100, 100, 120, 50);
		exitBtn.setBounds(100, 170, 120, 50);
		
		add(newBtn);
		add(exitBtn);
		
		setTitle("â");
		setBounds(900, 200, 300, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AwtMain3().init();
		
		
	}
}
