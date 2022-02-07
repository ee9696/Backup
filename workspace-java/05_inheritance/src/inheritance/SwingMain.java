package inheritance;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// Frame은 BorderLayout(동서남북)
public class SwingMain extends JFrame {
	private JButton northBtn=null, southBtn, eastBtn, westBtn, centerBtn;
	private int a = 0;
	
	
	public void init() {
			//버튼 생성
		
			northBtn = new JButton("북쪽");
			southBtn = new JButton("남쪽");
			eastBtn = new JButton("동쪽");
			westBtn = new JButton("서쪽");
			centerBtn = new JButton(new ImageIcon("a.gif"));
			
			
			
			//배치
			add("North", northBtn);
			add("South", southBtn);
			add("East", eastBtn);
			add("West", westBtn);
			add("Center", centerBtn);
			
			setBounds (900, 200, 300, 400); //호출		
			setVisible(true); // 호출
			
	}
	public static void main(String[]args) {

	new SwingMain().init();
	}
}