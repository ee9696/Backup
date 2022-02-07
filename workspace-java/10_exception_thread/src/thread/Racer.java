package thread;

import java.awt.Graphics;
import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;

//말 1마리
public class Racer extends Canvas implements Runnable {
	private Image img;
	private String horseName;
	int pos;
	private static int rank=0;  // 1도 가능
	
	public Racer(String horseName) {
		img = Toolkit.getDefaultToolkit().getImage("image/horse.gif");	
		this.horseName = horseName;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, pos, 0, 25, this.getSize().height, this);
		g.drawLine(0, this.getSize().height-1, this.getSize().width, this.getSize().height-1);
		//System.out.println(horseName + ", " + pos);
		
	}
	
	@Override
	public void run() {
		for(int i=0; i<600; i+=((int)(Math.random()*10)+1)) {
			pos = i;
			repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//System.out.println(horseName + "\t" + i);
		}// for
		
		rank++;
		
		System.out.println(rank+"등 "+horseName);
	}
}
