package abstract_;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowMain extends Frame {
   public WindowMain() {
      setTitle("�̹���");
      setBounds(900,200,400,400);
      setVisible(true);
   }
   
   @Override
   public void paint(Graphics g) {
      g.drawString("īī�� �̹���", 50, 80);
      
      Toolkit t = Toolkit.getDefaultToolkit(); //Ŭ���� ����
      Image img = t.getImage("study.gif");//�̹��� �ҷ�����
      //g.drawImage(img, 30, 120, this);//�̹��� �׸���
      
      //�̹��� �۰�
      g.drawImage(img,
            30, 120, 200, 300,
            0, 0, 426, 332,
            this);
      
      //�Ųٷ�
      g.drawImage(img,
            30, 120, 200, 300,
            426, 332, 0, 0,
            this);
   }

   public static void main(String[] args) {
      new WindowMain();
   }

}