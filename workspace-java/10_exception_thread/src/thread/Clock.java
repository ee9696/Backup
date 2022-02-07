package thread;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Clock extends JFrame implements Runnable {
	private JLabel timeL;
	
	public Clock() {
		timeL = new JLabel("", JLabel.CENTER);
		timeL.setFont(new Font("Arial", Font.BOLD, 36));
		timeL.setForeground(Color.RED);
		
		add("Center", timeL);
		
		setTitle("시계");

		setBounds(900,200,400,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Thread t = new Thread(this); //스레드 생성
		t.start();//스레드 시작 - 스레드 실행(run())
	}
	@Override
	public void run() {
		while(true) {
			repaint();//paint() 호출
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 단위 1/1000초
		} //while		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
			//Calendar cal = new GregorianCalendar();
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);
			
			String time = String.format("%2d : %2d : %2d", hour, minute, second);
			timeL.setText(time);
	}
	
	

	public static void main(String[] args) {
		new Clock();
		
	}


}
