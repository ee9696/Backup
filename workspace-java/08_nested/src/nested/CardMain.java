package nested;



import java.awt.event.WindowListener;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CardMain {
	private Frame frame;
	private CardLayout card;
	
	public CardMain() {
		frame = new Frame();
		card = new CardLayout();
		
		frame.setLayout(card);
		
		//Panel 7�� ���� - �迭
		Panel[] ar = new Panel[7];
		Color[] color = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW,
						 Color.MAGENTA, Color.CYAN, Color.ORANGE};
		String[] title = {"����", "�ʷ�", "�Ķ�", "���", "����", "�ϴ�", "��Ȳ"};
		for(int i=0; i<ar.length; i++) {
			ar[i] = new Panel();
			ar[i].setBackground(color[i]);
			
			frame.add(ar[i], title[i]);
		} //for
		
		// �̺�Ʈ
		for(int i=0; i<ar.length; i++) {
			ar[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//card.show(frame, "����");
					card.next(frame);
				}
			});	
			
		}
	
		
		
		
		frame.setBounds(900,250,200,200);
		frame.setVisible(true);		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new CardMain();
	}
}


/*
Frame / JFrame - BorderLayout (��������)
Panel 		   - FlowLayout(�߾� , ���� ��ġ)
				 GridLayout(�࿭��ġ)
Canvas           null
				 CardLayout()
*/