package homework;

import java.awt.Frame;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MemberMain extends Frame {
	private Frame frame;
	private CardLayout card;
	private Button hBtn, wBtn, lBtn;
	

	
	public MemberMain() {
			
		Frame f = new Frame();
		card = new CardLayout();
						
		Panel p = new Panel();
		Panel p1 = new Panel();
		p1.setLayout(card);
		Button hBtn = new Button("홈");
		Button wBtn = new Button("회원가입");
		Button lBtn = new Button("로그인");
		
		p.add(hBtn);
		p.add(wBtn);
		p.add(lBtn);
		
		HomePanel home = new HomePanel();
		WritePanel write = new WritePanel();
		LoginPanel login = new LoginPanel();
		
		f.add("North", p);
		f.add("Center", p1);
		p1.add("1",home.homp);
		p1.add("2",write.wrip);
		p1.add("3",login.logp);
		
		f.setBounds(700, 300, 600, 400);
		f.setResizable(false);
		f.setVisible(true);
		
		hBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(p1, "1");
			}
		});
		wBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(p1, "2");
			}
		});
		lBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(p1, "3");
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
	public static void main(String[] args) {
		new MemberMain();
		
	}

}
