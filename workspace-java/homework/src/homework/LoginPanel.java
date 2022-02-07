package homework;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JOptionPane;

public class LoginPanel extends Panel {
   public Panel logp, logp1;
   private Label l1, l2, l3;
   private TextField t1, t2;
   private Button b1, b2;
    
   public LoginPanel(){
	   logp = new Panel();
	   logp1 = new Panel();
	   logp.setLayout(null);
	   logp1.setLayout(null);
      
      l1 = new Label("아이디");
      l2 = new Label("비밀번호");
      l3 = new Label("");
      t1 = new TextField();
      t2 = new TextField();
      b1 = new Button("로그인");
      b2 = new Button("다시작성");
      
      l1.setBounds(15, 45, 50, 50);
      l2.setBounds(10, 82, 50, 50);
      l3.setBounds(165, 250, 200, 30); // 로그인 성공 or 실패
      t1.setBounds(70, 55, 100, 30);
      t2.setBounds(70, 90, 100, 30);
      b1.setBounds(30, 150, 70, 30);
      b2.setBounds(110, 150, 70, 30);

      logp1.add(l1);
      logp1.add(l2);
      logp1.add(l3);
      logp1.add(t1);
      logp1.add(t2);
      logp1.add(b1);
      logp1.add(b2);
      logp.add("Center",logp1);
      logp1.setBounds(200,50,200,200);
      
      logp.setBackground(Color.YELLOW);
      logp1.setBackground(Color.LIGHT_GRAY);
      
      b1.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  // 데이터
    		  String id = t1.getText();
    		  String pwd = t2.getText();
    		  
    		  MemberDAO dao = new MemberDAO();
    		  String name = dao.loginMember(id, pwd);
    		  
    		  if(name == null) {
    			  JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 틀립니다.");
    		  }else {
    			  JOptionPane.showMessageDialog(null, name + "님 로그인");
    		  }
    	  }
      });
      
      b2.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  t1.setText("");
    		  t2.setText("");
    	  }
      });
   }
}
   

 
