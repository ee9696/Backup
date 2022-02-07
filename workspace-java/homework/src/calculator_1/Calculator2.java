package calculator_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator2 extends Frame implements WindowListener, ActionListener{
   private Label dispL, inputL; 
   private Button [] btn;
   String [] button_value= {"��","C","7","8","9","/","4","5","6","*","1","2",
         "3","-",".","0","=","+"};;

   StringBuffer buffer = new StringBuffer();
         
   public void init() {
      
      
      dispL = new Label("");
      inputL = new Label("0",Label.RIGHT);

      
      Button [] btn =  new Button[18];; 
//      String [] button_value = {"��","C","7","8","9","/","4","5","6","*","1","2",
//            "3","-",".","0","=","+"};
//      
      
      for(int i = 0; i<18; i++) {
         btn[i] = new Button(button_value[i]);
      }
      
      setLayout(null);
      setLayout(new GridLayout(7,1,5,5));

//      Panel p = new Panel();
//      p.setLayout(new GridLayout(1,1,5,5));

//   setLayout(null);//�յ�, �࿭ ��ġ - 1�� 2ĭ ���ο��� 10 ���ο��� 0  
      dispL.setBounds(5,50,287,50);
      inputL.setBounds(5,105,287,50);
      dispL.setBackground(new Color(141,184,197));
      inputL.setBackground(new Color(141,184,197));
      add(dispL);
      add(inputL);
   
      
      Panel p = new Panel();
      p.setLayout(new GridLayout(1,2,5,5));
      for(int i = 0; i<2; i++) {
         p.add(btn[i]);}
      add(p);
      
      Panel p2 = new Panel();
      p2.setLayout(new GridLayout(1,4,5,5));
      for(int i = 2; i<6; i++) {
      p2.add(btn[i]);
      }
      add(p2);
      
      Panel p3 = new Panel();
      p3.setLayout(new GridLayout(1,4,5,5));
      for(int i = 6; i<10; i++) {
      p3.add(btn[i]);
      }
      add(p3);
      
      Panel p4 = new Panel();
      p4.setLayout(new GridLayout(1,4,5,5));
      for(int i = 10; i<14; i++) {
      p4.add(btn[i]);
      }
      add(p4);
      
      Panel p5 = new Panel();
      p5.setLayout(new GridLayout(1,4,5,5));
      for(int i = 14; i<18; i++) {
      p5.add(btn[i]);
      }
      add(p5);
      
   
      setTitle("����");
      setBounds(900,200,300,400);
      setVisible(true);
         
      this.addWindowListener(this);
      
      //�̺�Ʈ 
      for(int i = 0; i<btn.length; i++) {
         btn[i].addActionListener(this);
      }
      
      
   }

   public static void main(String[] args) {
      new Calculator2().init();

   }
   @Override
   public void actionPerformed(ActionEvent e) {

      if(e.getActionCommand() == "C") {
          inputL.setText("0");
          buffer.delete(0, buffer.length());
      }else if(buffer.length() == 0 && e.getActionCommand()=="0") {
          return;
      }else {
          buffer.append(e.getActionCommand());
          inputL.setText(buffer.toString());
      }
   }
   
   /*
    *    if(e.getActionCommand() == "C") {
         inputL.setText("0");
         buffer.delete(0, buffer.length());
      }
      else if(e.getActionCommand()=="1") { 
         buffer.append("1");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="2") {
         buffer.append("2");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="3") {
         buffer.append("3");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="4") {
         buffer.append("4");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="5") {
         buffer.append("5");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="6") {
         buffer.append("6");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="7") {
         buffer.append("7");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="8") {
         buffer.append("8");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="9") {
         buffer.append("9");
         inputL.setText(buffer.toString());
      }else if(e.getActionCommand()=="0") {
         
         buffer.append("0");
         inputL.setText(buffer.toString());
         }  
   }
    */
   @Override
   public void windowOpened(WindowEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void windowClosing(WindowEvent e) {
      System.exit(0);
   }
   @Override
   public void windowClosed(WindowEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void windowIconified(WindowEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void windowDeiconified(WindowEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void windowActivated(WindowEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void windowDeactivated(WindowEvent e) {
      // TODO Auto-generated method stub
      
   }



}