package inheritance;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {	//WindowTest is a Frame

	public WindowTest() {
		//new Frame("���� ���� �׸���").setVisible(true);
		
		super("���� ���� �׸���");  //�θ� ������ ȣ��
		//setTitle("���� ���� �׸���");
		
		setFont(new Font("�ü�ü", Font.BOLD, 32));
		
		System.out.println("����");
		setForeground(Color.WHITE);
		//setBackground(Color.YELLOW);//�������� ���, ���ڻ��� ����
		//setBackground( ColorŬ������ �����ڿ� R,G,B ���ڸ� ������ �ȴ�)
						//WindowTest(202,60,199)
		setBackground(new Color(155, 1, 55));
		
		
		//setSize(300,400);
		setBounds(900, 200, 300, 400);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) { // ����, � ���� �Ǹ� JVM�� ȣ���ϴ� �޼ҵ�(�ݹ� �޼ҵ�)
		g.drawString("����", 100, 80);
		g.drawLine(50, 80, 200,300);
		g.drawRect(70, 130, 150, 200);
		g.drawOval(100, 130, 100, 200);
		g.fillOval(100, 130, 100, 200);
	}
	public static void main(String args[]) {
		new WindowTest();
		
	}
}
