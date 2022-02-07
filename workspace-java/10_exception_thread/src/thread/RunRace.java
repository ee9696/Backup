package thread;

import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunRace extends JFrame implements ActionListener{
	private int count;
	private JButton btn;
	private Racer[] racer;
	
	
	public RunRace(int count) {
		this.count = count;
		
		btn = new JButton("����");
		JPanel southP = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		southP.add(btn);
		
		Scanner scan = new Scanner(System.in);
		JPanel centerP = new JPanel(new GridLayout(count, 1)); //FlowLayout
		racer = new Racer[count];
		String horseName = null;
		for(int i=0; i<count; i++) {
			System.out.print("�� �̸� �Է� : ");
			horseName = scan.next();
			
			racer[i]= new Racer(horseName);  // ������ ����
			centerP.add(racer[i]);
		}
		this.add("Center", centerP);
		this.add("South", southP);
		
		setBounds(900,200,600,400);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�̺�Ʈ
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);
		
		Thread[] t = new Thread[count];
		for(int i=0; i<count; i++) {
			t[i] = new Thread(racer[i]);//������ ����
		
			// �켱 ���� 1~10
			int num = (int)(Math.random() * 10) + 1;
			t[i].setPriority(num);	
			
			t[i].start(); // ������ ����
		}//for
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� �Է� : ");
		int count = scan.nextInt();
		
		new RunRace(count);
	}
}
