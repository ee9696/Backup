package homework;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

public class HomePanel extends Panel {
   public Panel homp, homp1;
   private Label l1, l2;

   
   public HomePanel(){
	   homp = new Panel();
	   homp1 = new Panel();
	   homp.setLayout(null);
	   homp1.setLayout(null);
      
      l1 = new Label("�ȳ��ϼ���");
      l2 = new Label("�������");
      
      l1.setBounds(60, 45, 100, 50);
      l2.setBounds(60, 80, 100, 50);


      homp1.add(l1);
      homp1.add(l2);

      homp.add("Center",homp1);
      homp1.setBounds(200,50,200,200);
      
      homp.setBackground(Color.RED);
      homp1.setBackground(Color.LIGHT_GRAY);
   }
}