package interface_;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class ImageMove extends Frame implements ActionListener, KeyListener, WindowListener {
   private Button initBtn, leftBtn, upBtn, downBtn, rightBtn;
   private int x=100, y=100;
   
   public ImageMove() {
      initBtn = new Button("초기화");
      leftBtn = new Button("  ←  ");
      upBtn = new Button("  ↑  ");
      downBtn = new Button("  ↓  ");
      rightBtn = new Button("  →  ");
      
      Panel p = new Panel();
      p.add(initBtn);
      p.add(leftBtn);
      p.add(upBtn);
      p.add(downBtn);
      p.add(rightBtn);
      
      this.add("North", p);
      
      this.setBounds(700, 150, 500, 500);
      this.setVisible(true);
      
      //이벤트   
      this.addWindowListener(this);
      
      initBtn.addActionListener(this);
      leftBtn.addActionListener(this);
      upBtn.addActionListener(this);
      downBtn.addActionListener(this);
      rightBtn.addActionListener(this);

      initBtn.addKeyListener(this);
      leftBtn.addKeyListener(this);
      upBtn.addKeyListener(this);
      downBtn.addKeyListener(this);
      rightBtn.addKeyListener(this);

   }//ImageMove()
   
   @Override
   public void paint(Graphics g) {
      Toolkit t = Toolkit.getDefaultToolkit(); //메소드 이용하여 생성
      Image img = t.getImage("image/강아지.gif");//이미지 불러오기
      g.drawImage(img, x, y, this);//이미지 그리기
   }
   

   //ActionListener Override
   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == initBtn) {
         x = y = 100;
      }else if(e.getSource() == leftBtn) {
         x -= 10;
         if(x<-50) x=470;
      }else if(e.getSource() == upBtn) {
         y -= 10;
         if(y<0) y=470;
      }else if(e.getSource() == downBtn) {
         y += 10;
         if(y>470) y=0;
      }else if(e.getSource() == rightBtn) {
         x += 10;
         if(x>470) x=-50;
      }
      
      System.out.println("x="+x+", y="+y);
      repaint(); //JVM에 의해서 paint() 호출
   }
   
   //WindowListener Override
   @Override
   public void windowOpened(WindowEvent e) {}

   @Override
   public void windowClosing(WindowEvent e) {
      System.out.println("프로그램 종료");
      System.exit(0);//프로그램 강제 종료
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

   //KeyListener Override
   @Override
   public void keyTyped(KeyEvent e) {}

   @Override
   public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
         System.exit(0);
      }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
         x -= 10;
         if(x<-50) x=470;
      }else if(e.getKeyCode() == KeyEvent.VK_UP) {
         y -= 10;
         if(y<0) y=470;
      }else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
         y += 10;
         if(y>470) y=0;
      }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
         x += 10;
         if(x>470) x=-50;
      }
      
      System.out.println("x="+x+", y="+y);
      repaint(); //JVM에 의해서 paint() 호출
   }

   @Override
   public void keyReleased(KeyEvent e) {}
}
//--------------
public class WindowMain2 {

   public static void main(String[] args) {
      new ImageMove();
   }

}