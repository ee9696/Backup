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

//Frame은 BorderLayout(동서남북)
//동서남북에는 1개의 Button만 올릴 수 있다.
class WindowTest extends Frame implements ActionListener, MouseListener {
	private Button newBtn, exitBtn;
	private TextArea area;
	
	public void init() {
		newBtn = new Button("새로만들기");
		exitBtn = new Button("종료");
		area = new TextArea();
		
		Panel p = new Panel(); //FlowLayout (중앙- 순서 배치)
		p.add(newBtn);
		p.add(exitBtn);
		
		this.add("North", p);
		this.add("Center", area);
		
		this.setBounds(900,100,300,400);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(new WindowExit()); // 내가 모든 것을 Override를 했다.. JVM 사건에 맞게 호출해라
		this.addMouseListener(this);
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
	} // init()
	
	
	//ActionListener Override
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newBtn) {
			area.setText(" ");
			area.setText(""); // 초기화
		}else if(e.getActionCommand()=="종료") {
			System.exit(0); //프로그램 강제 종료
		}
	}
	
	//MouseListener Override
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭!!");
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
