package inheritance;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// Frame�� BorderLayout(��������)
public class SwingMain extends JFrame {
	private JButton northBtn=null, southBtn, eastBtn, westBtn, centerBtn;
	private int a = 0;
	
	
	public void init() {
			//��ư ����
		
			northBtn = new JButton("����");
			southBtn = new JButton("����");
			eastBtn = new JButton("����");
			westBtn = new JButton("����");
			centerBtn = new JButton(new ImageIcon("a.gif"));
			
			
			
			//��ġ
			add("North", northBtn);
			add("South", southBtn);
			add("East", eastBtn);
			add("West", westBtn);
			add("Center", centerBtn);
			
			setBounds (900, 200, 300, 400); //ȣ��		
			setVisible(true); // ȣ��
			
	}
	public static void main(String[]args) {

	new SwingMain().init();
	}
}