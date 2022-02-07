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
      initBtn = new Button("�ʱ�ȭ");
      leftBtn = new Button("  ��  ");
      upBtn = new Button("  ��  ");
      downBtn = new Button("  ��  ");
      rightBtn = new Button("  ��  ");
      
      Panel p = new Panel();
      p.add(initBtn);
      p.add(leftBtn);
      p.add(upBtn);
      p.add(downBtn);
      p.add(rightBtn);
      
      this.add("North", p);
      
      this.setBounds(700, 150, 500, 500);
      this.setVisible(true);
      
      //�̺�Ʈ   
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
      Toolkit t = Toolkit.getDefaultToolkit(); //�޼ҵ� �̿��Ͽ� ����
      Image img = t.getImage("image/������.gif");//�̹��� �ҷ�����
      g.drawImage(img, x, y, this);//�̹��� �׸���
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
      repaint(); //JVM�� ���ؼ� paint() ȣ��
   }
   
   //WindowListener Override
   @Override
   public void windowOpened(WindowEvent e) {}

   @Override
   public void windowClosing(WindowEvent e) {
      System.out.println("���α׷� ����");
      System.exit(0);//���α׷� ���� ����
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
      repaint(); //JVM�� ���ؼ� paint() ȣ��
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