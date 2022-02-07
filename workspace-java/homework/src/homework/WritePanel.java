package homework;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WritePanel extends Panel {
   public Panel wrip, wrip1;
   private Label l1, l2, l3, l4;
   private TextField t1, t2, t3;
   private Button b1, b2;
   
   private Connection conn;
   private PreparedStatement ps;
   private ResultSet rs;
   
   private String driver = "oracle.jdbc.driver.OracleDriver";
   private String url="jdbc:oracle:thin:@localhost:1521:xe";
   private String username="c##java";
   private String password="bit";
   
   public WritePanel(){
	   wrip = new Panel();
	   wrip1 = new Panel();
	   wrip.setLayout(null);
	   wrip1.setLayout(null);
      
      l1 = new Label("아이디");
      l2 = new Label("비밀번호");
      l3 = new Label("");
      l4 = new Label("이름");
      t1 = new TextField();
      t2 = new TextField();
      t3 = new TextField();
      b1 = new Button("등 록");
      b2 = new Button("다시작성");
      
      l1.setBounds(15, 45, 50, 50);
      l2.setBounds(10, 82, 50, 50);
      l3.setBounds(165, 250, 200, 30); // 로그인 성공 or 실패
      l4.setBounds(20, 10, 50, 50);
      t1.setBounds(70, 55, 100, 30);
      t2.setBounds(70, 90, 100, 30);
      t3.setBounds(70, 20, 100, 30);
      b1.setBounds(30, 150, 70, 30);
      b2.setBounds(110, 150, 70, 30);

      wrip1.add(l1);
      wrip1.add(l2);
      wrip1.add(l3);
      wrip1.add(l4);
      wrip1.add(t1);
      wrip1.add(t2);
      wrip1.add(t3);
      wrip1.add(b1);
      wrip1.add(b2);
      wrip.add("Center",wrip1);
      wrip1.setBounds(200,50,200,200);
      
      wrip.setBackground(Color.BLUE);
      wrip1.setBackground(Color.LIGHT_GRAY);
   }
}
