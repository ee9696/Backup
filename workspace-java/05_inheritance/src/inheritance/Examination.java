package inheritance;
import java.util.Scanner;

public class Examination {
	private static final String JUNG = "11111"; //����, ���ȭ
	
	private String name = null;
	private String dap;
	private char[] ox = null;
	private int score;
	
	public Examination() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("�� �Է� : ");
		dap = scan.next();
		
		ox = new char[5];
	}
	
	public void compare() {
		for(int i=0; i<ox.length; i++) {
			if(JUNG.charAt(i) == dap.charAt(i)) {
				ox[i] = '0';
				score += 20;
			} else {
				ox[i] = 'x';
			}
		} //for
	}
	
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
}
