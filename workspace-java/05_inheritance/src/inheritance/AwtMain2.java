package inheritance;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;

//Frame�� BorderLayout(��������) - �������Ͽ��� 1���� ��ư�� ���� �� �ִ�.
public class AwtMain2 extends Frame {
	private Button newBtn, exitBtn, aBtn, bBtn;	//�ʵ�
	
	public void init() {
		newBtn = new Button("���θ����");
		exitBtn = new Button("����");
		aBtn    = new Button("a");
		bBtn    = new Button("b");
		
		Panel p = new Panel();	//FlowLayout - ����� �߽����� ������� ��ġ
		p.setLayout(new GridLayout(3,4,10,0));	//�յ�, �࿭ ��ġ
		p.setBackground(new Color(255,0,255));
		p.add(newBtn);
		p.add(exitBtn);
		p.add(aBtn);
		p.add(bBtn);
		
		add("North", p);
		
		setTitle("â");
		setBounds (900, 200, 300, 400);	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AwtMain2().init();
	}
}
