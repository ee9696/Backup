/*
x=320, y=258 °ª·Î ÇÕ, Â÷, °ö, ¸òÀ» ±¸ÇÏ½Ã¿À.

Class : compute
ÇÊµå   : x, y, sum, sub, mul, div
setter: setX, setY
°è»ê   : calc() - ÇÕ, Â÷, °ö, ¸ò
getter: getX, getY, getSum, getSub, getMul, getDiv
 */

package basic;

public class ComputeMain {

	public static void main(String[] args) {
		System.out.println("X\tY\tSum\tSub\tMul\tDiv");
		
		Compute aa = new Compute();
		Compute bb = new Compute(); 
		Compute cc = new Compute();
		aa.setX(320);
		aa.setY(258);		
		aa.calc();		
		System.out.println(aa.getX() + "\t" 
							+ aa.getY() + "\t" 
							+ aa.getSum() + "\t" 
							+ aa.getSub() + "\t" 
							+ aa.getMul() + "\t" 
							+ String.format("%.2f", aa.getDiv()));
		bb.setX(236);
		bb.setY(125);		
		bb.calc();		
		System.out.println(bb.getX() + "\t" 
							+ bb.getY() + "\t" 
							+ bb.getSum() + "\t" 
							+ bb.getSub() + "\t" 
							+ bb.getMul() + "\t" 
							+ String.format("%.2f", bb.getDiv()));
		cc.setX(539);
		cc.setY(327);		
		cc.calc();		
		System.out.println(cc.getX() + "\t" 
							+ cc.getY() + "\t" 
							+ cc.getSum() + "\t" 
							+ cc.getSub() + "\t" 
							+ cc.getMul() + "\t" 
							+ String.format("%.2f", cc.getDiv()));

	}

}
