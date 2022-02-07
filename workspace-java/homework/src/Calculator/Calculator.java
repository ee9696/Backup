package Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

public class Calculator extends Frame implements WindowListener, ActionListener {
	private Button[] btn;
	private String[] st = {"7", "8", "9", "/",
						   "4", "5", "6", "*",
						   "1", "2", "3", "-",
						   ".", "0", "=", "+",
						   "←", "C"};
	private Label dispL, inputL;
	private StringBuffer dispBuffer = new StringBuffer();
	private StringBuffer inputBuffer = new StringBuffer();
	private double result;
	private char op;  // '+':43, '-':45, '*':42, '/':47
	private DecimalFormat df = new DecimalFormat("#,###.########");

	
	public void init() {
		Button[] btn = new Button[18];	
		setLayout(null);
			
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new Button(st[i]);
		}
			
		dispL = new Label("", Label.RIGHT);
		dispL.setFont(new Font("고딕",Font.BOLD,20));
			
		inputL = new Label("0" , Label.RIGHT);
		inputL.setFont(new Font("고딕",Font.BOLD,50));
			
		add(dispL);
		add(inputL);
			
		dispL.setBounds(1, 30, 317, 40);
		inputL.setBounds(1, 71, 317, 90);
			
		Panel p = new Panel();
		p.setLayout(new GridLayout(4, 4, 2, 2));
			
		for(int i = 0; i < st.length - 2; i++) {
			p.add(btn[i]);
		}
			
		p.setBounds(10, 250, 318, 250);
		add(p);
			
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(1, 2, 2, 2));
						
		p2.add(btn[16]);
		p2.add(btn[17]);
			
		p2.setBounds(10, 190, 318, 60);
		add(p2);		
			
		setTitle("계산기");
		setBounds(900, 200, 335, 510);
		setVisible(true);
	
	
		
		this.addWindowListener(this);
	
		for(int i = 0;	 i<btn.length; i++) {
			btn[i].addActionListener(this);
		}
		
	}
	 @Override
	   public void paint(Graphics g) {
	      
	      Toolkit t = Toolkit.getDefaultToolkit(); //클래스 생성
	      Image img = t.getImage("1.jpg");//이미지 불러오기
	      //g.drawImage(img, 30, 120, this);//이미지 그리기
	      
	      //이미지 작게
	      g.drawImage(img,
	            30, 120, 200, 300,
	            0, 0, 426, 332,
	            inputL);
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//숫자
		if(	e.getActionCommand() == "1"||
			e.getActionCommand() == "2"||
			e.getActionCommand() == "3"||
			e.getActionCommand() == "4"||
			e.getActionCommand() == "5"||
			e.getActionCommand() == "6"||
			e.getActionCommand() == "7"||
			e.getActionCommand() == "8"||
			e.getActionCommand() == "9"||
			e.getActionCommand() == "0") {
			
			if(inputBuffer.length()==1 && inputBuffer.toString().equals("0")) {
			inputBuffer.delete(0, 1);
			}
			
			inputBuffer.append(e.getActionCommand());
			inputL.setText(inputBuffer+"");
			inputL.setText(inputBuffer.toString());
		
		}else if(e.getActionCommand() == "C") {
			dispBuffer.delete(0, dispBuffer.length());
			inputBuffer.delete(0, inputBuffer.length());
			
			dispL.setText("");
			inputL.setText("0");
			
			result = op = 0;
			
		}else if(e.getActionCommand() == ".") {
			if(inputBuffer.indexOf(".") == -1) {
			   inputBuffer.append(".");
			}
			inputL.setText(inputBuffer+"");
		
		}else if(e.getActionCommand() == "←") {
			inputBuffer.delete(inputBuffer.length()-1, inputBuffer.length());
			if(inputBuffer.length() == 0)
				inputBuffer.append("0");
			
			inputL.setText(inputBuffer+"");
		}else if(e.getActionCommand() == "+") {
			//계산
			calc();			
			op='+';
			
			dispBuffer.append(inputBuffer + " + ");
			
			dispL.setText(dispBuffer+"");
			inputL.setText(df.format(result));
			
			inputBuffer.delete(0, inputBuffer.length());
			
			
		}else if(e.getActionCommand() == "-") {
			//계산
			calc();			
			op='-';
			
			dispBuffer.append(inputBuffer + " - ");
			
			dispL.setText(dispBuffer+"");
			inputL.setText(df.format(result));
			
			inputBuffer.delete(0, inputBuffer.length());
		}else if(e.getActionCommand() == "*") {
			//계산
			calc();			
			op='*';
			
			dispBuffer.append(inputBuffer + " * ");
			
			dispL.setText(dispBuffer+"");
			inputL.setText(df.format(result));
			
			inputBuffer.delete(0, inputBuffer.length());
		}else if(e.getActionCommand() == "/") {
			//계산
			calc();			
			op='/';
			
			dispBuffer.append(inputBuffer + " / ");
			
			dispL.setText(dispBuffer+"");
			inputL.setText(df.format(result));
			
			inputBuffer.delete(0, inputBuffer.length());
		}else if(e.getActionCommand() == "=") {
			//계산
			calc();			
			op=0;
			
			dispBuffer.append(inputBuffer + " = ");
			
			dispL.setText(dispBuffer+"");
			inputL.setText(df.format(result));
			
			dispBuffer.delete(0, dispBuffer.length());
			inputBuffer.delete(0, inputBuffer.length());
		}
		
	}// actionPerformed(ActionEvent e)
	public void calc() {
		//계산 - result에는 처음 값과 중간 결과 
		if(op==0) result = Double.parseDouble(inputBuffer+"");
		else if(op == '+') result += Double.parseDouble(inputBuffer+"");
		else if(op == '-') result -= Double.parseDouble(inputBuffer+"");
		else if(op == '*') result *= Double.parseDouble(inputBuffer+"");
		else if(op == '/') result /= Double.parseDouble(inputBuffer+"");
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override   
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	
	public static void main (String[] args) {
		new Calculator().init();
	}
}
