package interface_;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExit implements WindowListener {

	//WindowListener Override
	@Override
	public void windowOpened(WindowEvent e) {}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("프로그램 종료");
		System.exit(0); //프로그램 강제 종료
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
}
