package for_;

public class FOrTest3 {

	public static void main(String[] args) {
		int rand;
		int count=0;
		rand = (int)(Math.random()*26)+65;
		
		for (int i=1; i<=100; i++) {
		rand = (int)(Math.random()*26)+65;
		System.out.println((char)rand + " ");
		
		if(i%10 ==0 ) System.out.println();
		
		if (rand=='A') count++; // 1, 2, 3 ,4 ,5
		}
		System.out.println();
		System.out.println("ÃÑ AÀÇ °³¼ö = " + count);
			
		}
	}


