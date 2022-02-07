package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
	private JPanel p;

	public Test()  {
		ArrayList<JPanel> list = new ArrayList<JPanel>();
		setLayout(new GridLayout(0,1));
		this.add(list);
		this.add(list);
		this.add(list);
		this.add(list);
		this.add(list);
		this.add(list);
		this.add(list);
		
		this.add(list);
		this.add(list);
		this.add(list);
		this.add(list);
		this.setBounds(700,300,600,600);
		this.setVisible(true);
		
	}
	private void add(ArrayList<JPanel> list) {
		JButton btn = new JButton();
		
		JPanel p = new JPanel();
		p.add(btn);
		p.setPreferredSize(new Dimension(50,50));
		p.setBackground(new Color(251,169,134));
		this.add(p);
		
	}
	public static void main(String args[]) {
		new Test();
	}
}
