package thread;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;



public class Packman extends Frame implements KeyListener, Runnable {
	
	private Image img, foodImg;
	int select = 2;
	int x=225, y=255, mx, my;
	private int[] foodX, foodY;
	
	public Packman() {
		img = Toolkit.getDefaultToolkit().getImage("image/packman.png");
		foodImg = Toolkit.getDefaultToolkit().getImage("image/food.gif");	
		
		//먹이
		foodX = new int[5];
		foodY = new int[5];
		
		for(int i=0; i<foodX.length; i++) {
			foodX[i] = (int)(Math.random()*461) + 20;  // 20 ~ 480
			foodY[i] = (int)(Math.random()*461) + 20;
		} //for
		
		setBounds(900,200,500,500);
		setResizable(false);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
				@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//이벤트
		this.addKeyListener(this);
		
		Thread t = new Thread(this); //스레드 생성 
		t.start(); // 스레드 시작 - 스레드 실행(run())
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		System.out.println(x + "," +y);
		g.drawImage(img,
				x, y, x+50, y+50,  // 화면 위치
				select*50, 0, select*50+50, 50, // 이미지 위치
				this);
		
		//먹이
		for(int i=0; i<foodX.length; i++) {
		g.drawImage(foodImg, foodX[i], foodY[i], this);
		}
	}
	
	@Override
    public void run() {
		while(true) {
			repaint();
			
			if(select%2==0) select++;
			else select--;
			
			//좌표 이동
			x = x + mx;
			y = y + my;
			
			if(x>500) x=0;
			else if(x<0) x=500;
			else if(y>500) y=0;
			else if(y<0) y=500;
				
			try {
				Thread.sleep(100); // 단위 : 1/1000초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//밥 묵자
			for(int i=0; i<foodX.length; i++) {
				if(x+25 >= foodX[i]-10 && y+25 >= foodY[i]-10 
					&& x+25 <= foodX[i]+30 && y+25 <= foodY[i]+30) foodX[i] = foodY[i] = -10;
				//ystem.out.println(foodX[i] + ", " + foodY[i]);
			}// for		
			//System.out.println("----------------");
		} //while
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			select=0;
			mx=-10; my=0;
			
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			select=4;
			mx=0; my=-10;
			
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			select=6;
			mx=0; my=10;
			
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			select=2;
			mx=10; my=0;
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	public static void main(String args[]) {
		new Packman();
	}
}
