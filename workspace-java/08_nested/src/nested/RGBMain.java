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
		//생성
		redBtn = new Button("빨강");
		greenBtn = new Button("초록");
		blueBtn = new Button("파랑");
		can = new DrCanvas();
		
		Panel p = new Panel();
		p.add(redBtn);
		p.add(greenBtn);
		p.add(blueBtn);
		
		this.add("North", p);
		this.add("Center", can);
		

		setBounds(900,150,300,400);
		setVisible(true);
		
		// 이벤트
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 클릭");
			}
		});
		
		//WindowAdapter는 추상클래스라서 절대 new 할 수 없다
		//WindowAdapter는 추상메소드가 1도 없어요 ---> 반드시 Override 해야 할 메소드가 없다
		
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
