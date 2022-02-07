package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame implements ActionListener {
   private List<PersonDTO> list;
   private DefaultTableModel model;
   private JTable table;
   private JButton addBtn, delBtn;
   
   public JTableEx2() {
      list = new ArrayList<PersonDTO>();
      list.add(new PersonDTO("hong","홍길동","111","010-123-1234"));
      list.add(new PersonDTO("conan","코난","333","010-777-7777"));
      
      //타이틀
      Vector vector = new Vector<String>();
      vector.addElement("아이디");
      vector.addElement("이름");
      vector.add("비밀번호");
      vector.add("핸드폰");
      
      model = new DefaultTableModel(vector, 0) {
         @Override
         public boolean isCellEditable(int row, int column) {
            //조건 ? 참 : 거짓;
            return column==0 ? false : true;
         }
      };
      table = new JTable(model);
      JScrollPane scroll = new JScrollPane(table);
      
      addBtn = new JButton("추가");
      delBtn = new JButton("삭제");
      JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      p.add(addBtn);
      p.add(delBtn);
      
      
      
      //데이터
      for(PersonDTO dto : list) {
         Vector<String> v = new Vector<String>();
         v.add(dto.getId());
         v.add(dto.getName());
         v.add(dto.getPwd());
         v.add(dto.getPhone());
         
         model.addRow(v);
      }
      
      Container c = this.getContentPane();
      c.add(scroll);
      c.add("South", p);
      
      setBounds(900, 100, 500, 400);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      //이벤트
      addBtn.addActionListener(this);
      delBtn.addActionListener(this);
   }//JTableEx2()
   
   @Override
   public void actionPerformed(ActionEvent e) {
	   if(e.getSource() == addBtn) insert(); //호출
	   else if(e.getSource() == delBtn) delete(); //삭제 
		   
   }
   
   public void delete() {
	   String name = JOptionPane.showInputDialog(this,"이름을 입력하세요");
	   if(name==null) return;
	   
	   int sw=0;
	   for(int i=0; i<model.getRowCount(); i++) {
		   if(name.equals(model.getValueAt(i, 1))) {
			   model.removeRow(i);
			   i--;
			   sw=1;
		   }
		   
	   }
	   
	   if(sw==0)
		   JOptionPane.showMessageDialog(this, "찾는 이름이 없ㅅ브니다");
	   else
		   JOptionPane.showMessageDialog(this, "삭제 완료");  
   }
   
   public void insert() {
	   String id = JOptionPane.showInputDialog(this, "아이디를 입력하세요");
	   if(id==null) {
		   JOptionPane.showMessageDialog(this, "아이디는 필수 항목입니다");
		   return;
	   }
	   
	   //중복체크
	   for(int i=0; i<model.getRowCount(); i++) {
		   if(id.equals(model.getValueAt(i, 0))) {
			   JOptionPane.showMessageDialog(this, "사용 중인 아이디입니다");
			   return;
		   }
	   }
	   
	   String name = JOptionPane.showInputDialog(this, "이름을 입력하세요.");
	   String pwd = JOptionPane.showInputDialog(this, "비밀번호를 입력하세요");
	   String phone = JOptionPane.showInputDialog(this, "전화번호를 입력하세요");
	   
	   Vector<String> v = new Vector<String>();
	   v.add(id);
	   v.add(name);
	   v.add(pwd);
	   v.add(phone);
	   
	   JOptionPane.showMessageDialog(this, "등록 완료");
	   model.addRow(v);
   }

   public static void main(String[] args) {
      new JTableEx2();
   }

}
