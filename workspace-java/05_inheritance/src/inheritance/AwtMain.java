package inheritance;

import java.awt.Button;
import java.awt.Frame;

// Frame�� BorderLayout(��������)
public class AwtMain extends Frame {
	private Button northBtn=null, southBtn, eastBtn,
							westBtn, centerBtn;
	private int a = 0;
	
	
	public void init() {
			//��ư ����
		
			northBtn = new Button("����");
			southBtn = new Button("����");
			eastBtn = new Button("����");
			westBtn = new Button("����");
			centerBtn = new Button("�߾�");
			
			
			
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

		new AwtMain().init();
	}
}
		