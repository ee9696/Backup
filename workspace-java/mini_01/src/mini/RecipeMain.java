package mini;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RecipeMain extends JFrame implements ActionListener, MouseListener{
	private LoginPanel loginPanel = new LoginPanel(this);
	private SearchPanel searchPanel = new SearchPanel(this, loginPanel);
	private HomePanel homePanel = new HomePanel(this, searchPanel);
	private WritePanel writePanel = new WritePanel(this);
	private MyPagePanel myPagePanel = new MyPagePanel(this, searchPanel);
	private UpdatePanel updatePanel = new UpdatePanel(this);
	private DetailPanel detailPanel = new DetailPanel(this, loginPanel);
	private DeletePanel deletePanel = new DeletePanel(this);
	private RecipeWritePanel recipeWritePanel = new RecipeWritePanel(this, loginPanel);
	private RecipeUpdatePanel recipeUpdatePanel = new RecipeUpdatePanel(this, detailPanel);		
	
	private Icon home = new ImageIcon("image/home.png");
	private Icon myPage = new ImageIcon("image/my.png");
	private Icon pImg = new ImageIcon("image/��������1.png");
	private JRadioButton[] RBtn = new JRadioButton[2];
	private ButtonGroup group = new ButtonGroup();
	private JButton writeBtn, loginBtn, logoutBtn;
	private CardLayout card;
	private JPanel btnP, centerP;
	
	private Icon deco1Img = new ImageIcon("image/��Ʈpink.png");              //0906  �ǿ���
	private JButton[] decoBtn;
	private MouseListener listener; 																		// �������
   
	int x = 10;                             // 0906 9�� ������ �õ� �ǿ���
	int y = 10;
	int s_x = 10;
	int s_y = 10;
	int width = 80;
	int height = 70;                    //�������
//	
	public RecipeMain() { //������
//		
		decoBtn = new JButton[4];																	//0906 �ǿ���
		decoBtn[0] = new JButton(deco1Img);
		decoBtn[1] = new JButton(deco1Img);
		decoBtn[2] = new JButton(deco1Img);
		decoBtn[3] = new JButton(deco1Img);
		for(int i = 0; i<4; i++) {
			decoBtn[i] = new JButton(deco1Img);
			decoBtn[i].setBounds(((int)(Math.random()*300)+20)+20, (int)(Math.random()*400)+20, 80, 70);
			this.add(decoBtn[i]);
			decoBtn[i].setBorderPainted(false);
			decoBtn[i].setContentAreaFilled(false);
			decoBtn[i].setToolTipText("��ưx ������ ������.......");
			decoBtn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));	//0906 �ǿ���

		}

			decoBtn[0].addMouseMotionListener(new MouseMotionAdapter() {   // 0906 �ǿ���
			public void mouseDown(MouseEvent ev, int x, int y) {
			}
			public void mouseDragged(MouseEvent ev) {
				int tem_x = ev.getX()-(width/2);
				int tem_y = ev.getY()-(height/2);
				
				x = x+tem_x;
				y= y+tem_y;
				decoBtn[0].setBounds(x,y,width,height);
			}
		});																																	//0906 �ǿ���
			decoBtn[1].addMouseMotionListener(new MouseMotionAdapter() {   // 0906 �ǿ���
			public void mouseDown(MouseEvent ev, int x, int y) {
			}
			public void mouseDragged(MouseEvent ev) {
				int tem_x = ev.getX()-(width/2);
				int tem_y = ev.getY()-(height/2);
				
				x = x+tem_x;
				y= y+tem_y;
				decoBtn[1].setBounds(x,y,width,height);
			}
		});																																	//0906 �ǿ���
			decoBtn[2].addMouseMotionListener(new MouseMotionAdapter() {   // 0906 �ǿ���
			public void mouseDown(MouseEvent ev, int x, int y) {
			}
			public void mouseDragged(MouseEvent ev) {
				int tem_x = ev.getX()-(width/2);
				int tem_y = ev.getY()-(height/2);
				
				x = x+tem_x;
				y= y+tem_y;
				decoBtn[2].setBounds(x,y,width,height);
			}
		});																																	//0906 �ǿ���
			decoBtn[3].addMouseMotionListener(new MouseMotionAdapter() {   // 0906 �ǿ���
			public void mouseDown(MouseEvent ev, int x, int y) {
			}
			public void mouseDragged(MouseEvent ev) {
				int tem_x = ev.getX()-(width/2);
				int tem_y = ev.getY()-(height/2);
				
				x = x+tem_x;
				y= y+tem_y;
				decoBtn[3].setBounds(x,y,width,height);
			}
		});		
		
		
		//JRadioButton ����		
		RBtn[0] = new JRadioButton("HOME", home);
		RBtn[1] = new JRadioButton("MY", myPage);
		
		for(int i=0; i<RBtn.length; i++) {
			RBtn[i].setVerticalTextPosition(JRadioButton.BOTTOM);
			RBtn[i].setHorizontalTextPosition(JRadioButton.CENTER);
			group.add(RBtn[i]);
		}//for

		//JButton ����
		writeBtn = new JButton("SIGN UP");
		loginBtn = new JButton("LOGIN");
		logoutBtn = new JButton("LOGOUT");
		
		logoutBtn.setVisible(false);
		
		//CardLayout ����
		card = new CardLayout();
		
		//JPanel ���� - 4�� ��ư �г�
		btnP = new JPanel() {
	  		public void paintComponent(Graphics g) {  //JPanel�� �̹��� ����
				g.drawImage(((ImageIcon) pImg).getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		btnP.add(RBtn[0]); //Ȩ
	    btnP.add(writeBtn); //ȸ������
	    btnP.add(loginBtn); //�α���
	    btnP.add(RBtn[1]); //����������
	    btnP.add(logoutBtn); //�α׾ƿ�
	    writeBtn.setBackground(Color.white); 	// ��ư ������
	    loginBtn.setBackground(Color.white);	
	    logoutBtn.setBackground(Color.white);	
	    RBtn[0].setOpaque(false);		// ��ư �����ϰ�
	    writeBtn.setOpaque(false);	
	    loginBtn.setOpaque(false);
	    RBtn[1].setOpaque(false);
	    logoutBtn.setOpaque(false);
		
		//JPanel ���� - ī�� ���̾ƿ� �г�
		centerP = new JPanel();
		centerP.setLayout(card);
		centerP.add("home", homePanel);
		centerP.add("write", writePanel);
		centerP.add("login", loginPanel);
		centerP.add("myPage", myPagePanel);
		centerP.add("update", updatePanel);
		centerP.add("search", searchPanel);
		centerP.add("detail", detailPanel);
		centerP.add("delete", deletePanel);
		centerP.add("recipeWrite", recipeWritePanel);
		centerP.add("recipeUpdate", recipeUpdatePanel);

		Container C = this.getContentPane();
		C.add("North", btnP);
		C.add("Center", centerP);

		setBounds(800, 200, 400, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�̺�Ʈ
		RBtn[0].addActionListener(this); //Ȩ
	    RBtn[0].setCursor(new Cursor(Cursor.HAND_CURSOR));
	    writeBtn.addActionListener(this); //ȸ������
	    writeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    loginBtn.addActionListener(this); //�α���
	    loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    RBtn[1].addActionListener(this); //����������
	    RBtn[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
	    logoutBtn.addActionListener(this); //�α׾ƿ�
	    logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}//RecipeMain()
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//RecipeMain
		if(e.getActionCommand() == "HOME") { //Ȩ
			card.show(centerP,"home");
			
			homePanel.getSearchT().setText("");
		}else if(e.getActionCommand() == "SIGN UP") { //ȸ������
			card.show(centerP,"write"); 
			
			writePanel.getNameT().setText("");
			writePanel.getIdT().setText("");
			writePanel.getEmailT().setText("");
			writePanel.getEmailNumT().setText("");
			writePanel.getPwdT().setText("");
		}else if(e.getActionCommand() == "LOGIN") { //�α���
			card.show(centerP,"login"); 
			
			loginPanel.getIdT().setText("");
			loginPanel.getPwdT().setText("");
		}else if(e.getActionCommand() == "MY") { //����������
			if(loginPanel.getId() != null) {
				card.show(centerP,"myPage");
			
				recipeWritePanel.getRecipeNameT().setText("");
				recipeWritePanel.getImgT().setText("");
				recipeWritePanel.getRecipedatailTA().setText("");
				
				updatePanel.getIdT().setText("");
				updatePanel.getPwdT().setText("");
				updatePanel.getEmailT().setText("");
				
				deletePanel.getNameT().setText("");
				deletePanel.getIdT().setText("");
				deletePanel.getPwdT().setText("");
			}else 
				JOptionPane.showMessageDialog(this, "�α����� �ʿ��� �����Դϴ�");
		}else if(e.getActionCommand() == "LOGOUT") {
			card.show(centerP,"home");
			
			writeBtn.setVisible(true);
			loginBtn.setVisible(true);
			logoutBtn.setVisible(false);
			
			loginPanel.setId(null);
		}
		//-----------------------------------------------
		//HomePanel
		if(e.getActionCommand() == "�˻�") { // �����Ǹ� �˻� (�˻�â)
			int sw = homePanel.recipeNameSearch();
			if(sw == 1) card.show(centerP, "search");
		}else if(e.getActionCommand() == "�ѽ�") { // ī�װ��� �˻�
			String category = "�ѽ�";
	        int sw = homePanel.categorySearch(category);
	           if(sw == 1) card.show(centerP, "search");
		}else if(e.getActionCommand() == "���") {
			String category = "���";
	        int sw = homePanel.categorySearch(category);
	           if(sw == 1) card.show(centerP, "search");
		}else if(e.getActionCommand() == "�߽�") {
			String category = "�߽�";
	        int sw = homePanel.categorySearch(category);
	           if(sw == 1) card.show(centerP, "search");
		}else if(e.getActionCommand() == "�Ͻ�") {
			String category = "�Ͻ�";
	        int sw = homePanel.categorySearch(category);
	           if(sw == 1) card.show(centerP, "search");
		}
		//-----------------------------------------------
		//WritePanel
		if(e.getActionCommand() == "ȸ������") {
			if(writePanel.getIdCheck()==true && writePanel.getEmailCheck()==true && writePanel.getNameT().getText() != null) { //ȸ������ ����
				card.show(centerP, "home"); 
				JOptionPane.showMessageDialog(this, "ȸ�������� �����մϴ�!");
			}else if(writePanel.getIdCheck()==false){ //ȸ������ ����
				card.show(centerP, "write");	
				JOptionPane.showMessageDialog(this, "���̵� �ߺ�üũ�� �Ϸ����ּ���");
			}else if(writePanel.getEmailCheck()==false){ //ȸ������ ����
				card.show(centerP, "write");	
				JOptionPane.showMessageDialog(this, "�̸��� ������ �Ϸ����ּ���");
			}else if(writePanel.getNameT().getText() == null){ //ȸ������ ����
				card.show(centerP, "write");	
				JOptionPane.showMessageDialog(this, "��� �׸��� �Է����ּ���");
			}
		}
		//-----------------------------------------------
		//LoginPanel
		if(e.getActionCommand() == "�α���") {
			if(loginPanel.getLoginCheck() != null) { // �α��� ����
				card.show(centerP, "home"); 
				JOptionPane.showMessageDialog(this, "�α��� ����!");
			
				writeBtn.setVisible(false);
		        loginBtn.setVisible(false);
		        logoutBtn.setVisible(true);
			}else { //�α��� ����
				card.show(centerP, "login");
				JOptionPane.showMessageDialog(this, "�α��� ����! ���̵�� ��й�ȣ�� Ȯ���ϼ���");
			}
		}
		//-----------------------------------------------
		//MyPagePanel
		if(e.getActionCommand() == "������ ���") {
			card.show(centerP, "recipeWrite"); 
			recipeWritePanel.lbupdate();
		}else if(e.getActionCommand() == "�� ������ ����") {
			int sw = myPagePanel.idSearch(loginPanel.getId());
			if (sw == 1)
				card.show(centerP, "search");
		}else if(e.getActionCommand() == "ȸ�� ��������") {
			card.show(centerP, "update");
		}
		//------------------------------------------------------
		//DeletePanel
		if(e.getActionCommand() == "ȸ�� Ż��") {
			card.show(centerP, "delete");
		}else if(e.getActionCommand() == "Ż�� �Ϸ�") {
			String pwdCheck = JOptionPane.showInputDialog("��й�ȣ�� �ٽ��ѹ� �Է����ּ���");
			int su = deletePanel.deleteMember(pwdCheck);
			if(su>0) { // Ż�� �Ϸ�
				card.show(centerP, "home");
				JOptionPane.showMessageDialog(this, "ȸ��Ż�� �Ϸ�");
			
				writeBtn.setVisible(true);
	            loginBtn.setVisible(true);
	            logoutBtn.setVisible(false);

	            loginPanel.setId(null);
	            
			} else { // Ż�� ����
				card.show(centerP, "delete");
				JOptionPane.showMessageDialog(this, "�ش� ȸ�������� �������� �ʽ��ϴ�");
			}
		}
		//-----------------------------------------------
		//UpdatePanel
		if(e.getActionCommand() == "���� �Ϸ�") {
			String pwdCheck = JOptionPane.showInputDialog("���� ��й�ȣ�� �ٽ��ѹ� �Է����ּ���");
			int su = updatePanel.updateMember(pwdCheck);
			if(su>0) { // ���� ����
				card.show(centerP, "home"); 
				JOptionPane.showMessageDialog(this, "ȸ������ ���� �Ϸ�");
			}else { // ���� ����
				card.show(centerP, "update");	
				JOptionPane.showMessageDialog(this, "�ش� ȸ�������� �����ϴ�");
			}
		}		
		//-----------------------------------------------
		//DetailPanel
		if(e.getActionCommand() == "����") { 
			// �α����� ���̵� = �˻��ȷ����ǵ���Ѿ��̵� ��ġ�ؾ� ����â ���� ����
			if(loginPanel.getId() != null) { // �α��� �� ���
				if(loginPanel.getId().equals(detailPanel.getDetailId())) {
					recipeUpdatePanel.lbupdate();
					card.show(centerP, "recipeUpdate");
				}else JOptionPane.showMessageDialog(this, "���� ����� �����Ǹ� ���� �����մϴ�");
			}else JOptionPane.showMessageDialog(this, "�α����� �ʿ��� �����Դϴ�");
		
		
		}else if(e.getActionCommand() == "����") {
			// �α����� ���̵� = �˻��ȷ����ǵ���Ѿ��̵� ��ġ�ؾ� ���������ϵ��� �ؾ���!!
			if(loginPanel.getId() != null) { // �α��λ��¿����� ����
			int su = detailPanel.recipeDelete();
				if(su>0) {
					JOptionPane.showMessageDialog(this, "������ ���� �Ϸ�");
					card.show(centerP, "myPage");
				}
				else if(su==0) 
					JOptionPane.showMessageDialog(this, "���� ����� �����Ǹ� ���� �����մϴ�");
			}else // �α��� ���ѻ���
				JOptionPane.showMessageDialog(this, "�α����� �ʿ��� �����Դϴ�");
		}
		
		//-----------------------------------------------
		//RecipeWritePanel
		if(e.getActionCommand() == "���") {
			int sw = recipeWritePanel.recipeWrite();
			
			//��� ������
			if(sw==1) {
	            myPagePanel.idSearch(loginPanel.getId());
	            card.show(centerP, "search");    
	         }
		}
		//-------------------------------------------------
		//RecipeUpdatePanel
		if(e.getActionCommand() == "����") {
				int ans = JOptionPane.showConfirmDialog(this, "������ �����Ͻðڽ��ϱ�?");
				if(ans == JOptionPane.YES_OPTION) {
					int sw = recipeUpdatePanel.recipeUpdate();
		            //��� ������
		            if(sw==1) {
		                myPagePanel.idSearch(loginPanel.getId());
		                card.show(centerP, "search");    
		            }
		            JOptionPane.showMessageDialog(this, "���� �Ϸ�");
		        }
		}
	}//actionPerformed(ActionEvent e)
//===============================================================
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel lb = (JLabel)e.getSource();
		detailPanel.detailPrint(lb.getText());
		card.show(centerP, "detail");
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
//========================================================================
	public static void main(String[] args) {
		new RecipeMain();
	}
	
}
















