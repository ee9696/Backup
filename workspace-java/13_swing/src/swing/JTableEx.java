package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel{ //AbstractTableModel는 추상 클래스
//	Object[][] data = {{"Nari","마루치",new Integer(1234), "옆집친구"},
//				       {"One","오윤아",new Integer(1111),"예쁜이"},
//			           {"tow","오윤서",new Integer(2222),"귀염둥이"},
//			           {"three","아라치",new Integer(3333), "동아리 친구"}};
	
	// JDK 9부터는 Wrapper Class의 생성자가 사라지고 AutoBoxing
	Object[][] data = {{"Nari","마루치", 1234, "옆집친구"},
			           {"One","오윤아", 1111,"예쁜이"},
			           {"tow","오윤서", 2222,"귀염둥이"},
			           {"three","아라치", 3333, "동아리 친구"}};
	
	String[] name = {"아이디", "이름", "비밀번호", "구분"}; //필드명
	
	@Override
	public int getRowCount() { //행의 개수
		return data.length;
	}
	
	@Override
	public int getColumnCount() {
		return name.length;
	}
	
	@Override
	public Object getValueAt(int r, int c) {
		return data[r][c];
	}
	
	@Override
	public void setValueAt(Object ob, int r, int c) {
			data[r][c] = ob;
	}
	
	@Override
	public String getColumnName(int c) { //필드명(타이틀)
		return name[c];
	}
	@Override
	public boolean isCellEditable(int r, int c) { //편집 가능
		//조건 ? 참 : 거짓;
		return c==0 ? false : true;
	}
	
}
//----------------------------
public class JTableEx extends JFrame {
	JTable table;
	JTableModel model;
	
	public JTableEx() {
		model = new JTableModel();
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		add(scroll);
		
		this.setBounds(900, 100, 300, 300);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableEx();
	}
}
