package switch_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SwitchTest2 {
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("연산자(+,-,*,/) : ");
		int op = br.read(); //int op = System.in.read(); - 1개 문자
		//String op = br.readLine();

      switch(op){
         case '+' : System.out.println(a + " + " + b + " = " + (a+b)); break;
         case '-' : System.out.println(a + " - " + b + " = " + (a-b)); break;
         case '*' : System.out.println(a + " * " + b + " = " + (a*b)); break;
         case '/' : System.out.println(a + " / " + b + " = " + ((double)a/b)); break;

         //case "+" : System.out.println(a + " + " + b + " = " + (a+b)); break;
         //case "-" : System.out.println(a + " - " + b + " = " + (a-b)); break;
         //case "*" : System.out.println(a + " * " + b + " = " + (a*b)); break;
         //case "/" : System.out.println(a + " / " + b + " = " + ((double)a/b)); break;
		 
         default : System.out.println("연산자 error");
      }//switch
   }
}