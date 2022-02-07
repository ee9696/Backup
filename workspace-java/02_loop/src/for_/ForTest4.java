package for_;

public class ForTest4 {
	
	public static void main(String args[]) {
		int i, sum = 0, mul = 1;
		
		for (i=1; i<=10; i++) {
		System.out.println(i + "\t\t" + (sum+=i) + "\t\t" + (mul*=i));	
		}
	}

}
