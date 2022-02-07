package basic;

public class ComputeMain2 {

	public static void main(String[] args) {
		Compute[] ar = new Compute[3]; //객체 배열
		for(int i=0; i<ar.length; i++) {
			ar[i] = new Compute();
		}
		ar[0] = new Compute();	//클래스 생성
		ar[1] = new Compute();
		ar[2] = new Compute();
		
		ar[0].setX(320);
		ar[0].setY(258);
		
	    ar[1].setX(236);
	    ar[1].setY(125);
	      
	    ar[2].setX(539);
	    ar[2].setY(327);
		
		for (int i=0; i<ar.length; i++) {
			ar[i].calc();
		System.out.println(ar[i].getX() + "\t" 
				+ ar[i].getY() + "\t" 
				+ ar[i].getSum() + "\t" 
				+ ar[i].getSub() + "\t" 
				+ ar[i].getMul() + "\t" 
				+ String.format("%.2f", ar[i].getDiv()));
		}
	}
}
