package abstract_;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowMain extends Frame {
   public WindowMain() {
      setTitle("이미지");
      setBounds(900,200,400,400);
      setVisible(true);
   }
   
   @Override
   public void paint(Graphics g) {
      g.drawString("카카오 이미지", 50, 80);
      
      Toolkit t = Toolkit.getDefaultToolkit(); //클래스 생성
      Image img = t.getImage("study.gif");//이미지 불러오기
      //g.drawImage(img, 30, 120, this);//이미지 그리기
      
      //이미지 작게
      g.drawImage(img,
            30, 120, 200, 300,
            0, 0, 426, 332,
            this);
      
      //거꾸로
      g.drawImage(img,
            30, 120, 200, 300,
            426, 332, 0, 0,
            this);
   }

   public static void main(String[] args) {
      new WindowMain();
   }

}