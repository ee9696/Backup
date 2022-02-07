package inheritance;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {	//WindowTest is a Frame

	public WindowTest() {
		//new Frame("내가 만든 그림판").setVisible(true);
		
		super("내가 만든 그림판");  //부모 생성자 호출
		//setTitle("내가 만든 그림판");
		
		setFont(new Font("궁서체", Font.BOLD, 32));
		
		System.out.println("도형");
		setForeground(Color.WHITE);
		//setBackground(Color.YELLOW);//바탕색은 흰색, 글자색은 검정
		//setBackground( Color클래스의 생성자에 R,G,B 숫자를 넣으면 된다)
						//WindowTest(202,60,199)
		setBackground(new Color(155, 1, 55));
		
		
		//setSize(300,400);
		setBounds(900, 200, 300, 400);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) { // 구현, 어떤 때가 되면 JVM이 호출하는 메소드(콜백 메소드)
		g.drawString("도형", 100, 80);
		g.drawLine(50, 80, 200,300);
		g.drawRect(70, 130, 150, 200);
		g.drawOval(100, 130, 100, 200);
		g.fillOval(100, 130, 100, 200);
	}
	public static void main(String args[]) {
		new WindowTest();
		
	}
}
