package interface_;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Frame�� BorderLayout(��������)
//�������Ͽ��� 1���� Button�� �ø� �� �ִ�.
class WindowTest extends Frame implements ActionListener, MouseListener {
	private Button newBtn, exitBtn;
	private TextArea area;
	
	public void init() {
		newBtn = new Button("���θ����");
		exitBtn = new Button("����");
		area = new TextArea();
		
		Panel p = new Panel(); //FlowLayout (�߾�- ���� ��ġ)
		p.add(newBtn);
		p.add(exitBtn);
		
		this.add("North", p);
		this.add("Center", area);
		
		this.setBounds(900,100,300,400);
		setVisible(true);
		
		//�̺�Ʈ
		this.addWindowListener(new WindowExit()); // ���� ��� ���� Override�� �ߴ�.. JVM ��ǿ� �°� ȣ���ض�
		this.addMouseListener(this);
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
	} // init()
	
	
	//ActionListener Override
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newBtn) {
			area.setText(" ");
			area.setText(""); // �ʱ�ȭ
		}else if(e.getActionCommand()=="����") {
			System.exit(0); //���α׷� ���� ����
		}
	}
	
	//MouseListener Override
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��!!");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}

public class WindowMain {
	
	public static void main(String[] args) {
		new WindowTest().init();
	}

}
