package nested;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;

public class RGBMain extends Frame {
	private Button redBtn, greenBtn, blueBtn;
	private DrCanvas can;
	
	public RGBMain() {
		//����
		redBtn = new Button("����");
		greenBtn = new Button("�ʷ�");
		blueBtn = new Button("�Ķ�");
		can = new DrCanvas();
		
		Panel p = new Panel();
		p.add(redBtn);
		p.add(greenBtn);
		p.add(blueBtn);
		
		this.add("North", p);
		this.add("Center", can);
		

		setBounds(900,150,300,400);
		setVisible(true);
		
		// �̺�Ʈ
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("���콺 Ŭ��");
			}
		});
		
		//WindowAdapter�� �߻�Ŭ������ ���� new �� �� ����
		//WindowAdapter�� �߻�޼ҵ尡 1�� ����� ---> �ݵ�� Override �ؾ� �� �޼ҵ尡 ����
		
		redBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(Color.RED);
			}
		});
		greenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(Color.GREEN);
			}
		});
		blueBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(Color.BLUE);
			}
		});
		
	} // RGBMain()	

	class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255,200,255));
		}
	}
	
	public static void main(String[] args) {
		new RGBMain();
	}
}