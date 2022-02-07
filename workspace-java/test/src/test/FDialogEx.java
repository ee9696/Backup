package test;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FDialogEx extends JFrame{
	Container contenPane;
	JLabel imgLbl = new JLabel();
	
	FDialogEx(){
		setTitle("�׸����� �ҷ��ͺ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contenPane = getContentPane();
		contenPane.add(imgLbl);
		MakeMenu();
		setSize(300,300);
		setVisible(true);
	}
	
	void MakeMenu() {
		JMenuBar m = new JMenuBar();
		JMenu fMnu = new JMenu("����");
		JMenuItem oItm = new JMenuItem("����");
		
		oItm.addActionListener(new OpenActionListener());
		fMnu.add(oItm);
		m.add(fMnu);
		this.setJMenuBar(m);
	}
	
	class OpenActionListener implements ActionListener{
		JFileChooser choice;
		
		OpenActionListener(){
		choice = new JFileChooser();	
		}
		
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images","gif","jpg");
			choice.setFileFilter(filter);
			
			int ret = choice.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,"������ �������� �ʾҳ׿�", "����" , JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String fPath = choice.getSelectedFile().getPath();
			imgLbl.setIcon(new ImageIcon(fPath));
			pack();
		}
	}
	public static void main(String[] args) {
		new FDialogEx();
	}
	
	
}