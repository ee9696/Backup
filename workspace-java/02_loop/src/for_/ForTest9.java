package for_;


import java.io.IOException;

public class ForTest9 {

	public static void main(String[] args) throws IOException {
		int x=0;
		int mul=1;
		int i;
		
		System.out.print("x값 입력 : ");
		x = System.in.read()-'0';
		System.out.print(x + "! = ");
		for( i=1; i<=x; i++) {
			mul *= i;
			if(i < x)
				System.out.print(i+" * ");
			else
				System.out.print(i+" = ");
		}  
		System.out.println(mul);
	}
}

/*
public class ForTest9 {

public static void main(String[] args) throws IOException {
   System.out.print("x값 입력 : ");
   int x = System.in.read()-'0';
   
   //7! = 1*2*3*4*5*6*7 = 5040
   int mul=1;
   System.out.print(x + "!=");
   for(int i=1; i<=x; i++) {
      mul *= i;
      
      if(i < x)
         System.out.print(i+"*");
      else
         System.out.print(i+"=");
   }//for
   
   System.out.println(mul);

}

}
*/
