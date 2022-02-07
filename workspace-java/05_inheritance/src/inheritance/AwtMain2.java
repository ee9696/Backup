package inheritance;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;

//Frame은 BorderLayout(동서남북) - 동서남북에는 1개의 버튼만 넣을 수 있다.
public class AwtMain2 extends Frame {
	private Button newBtn, exitBtn, aBtn, bBtn;	//필드
	
	public void init() {
		newBtn = new Button("새로만들기");
		exitBtn = new Button("종료");
		aBtn    = new Button("a");
		bBtn    = new Button("b");
		
		Panel p = new Panel();	//FlowLayout - 가운데를 중심으로 순서대로 배치
		p.setLayout(new GridLayout(3,4,10,0));	//균등, 행열 배치
		p.setBackground(new Color(255,0,255));
		p.add(newBtn);
		p.add(exitBtn);
		p.add(aBtn);
		p.add(bBtn);
		
		add("North", p);
		
		setTitle("창");
		setBounds (900, 200, 300, 400);	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AwtMain2().init();
	}
}
