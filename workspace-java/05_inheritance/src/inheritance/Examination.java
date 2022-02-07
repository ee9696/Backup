package inheritance;
import java.util.Scanner;

public class Examination {
	private static final String JUNG = "11111"; //정답, 상수화
	
	private String name = null;
	private String dap;
	private char[] ox = null;
	private int score;
	
	public Examination() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("답 입력 : ");
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
