/*


*/
package if_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IfTest3 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("ù��° �Է� : ");
      int a = Integer.parseInt(br.readLine());
      System.out.print("�ι�° �Է� : ");
      int b = Integer.parseInt(br.readLine());
      System.out.print("����° �Է� : ");
      int c = Integer.parseInt(br.readLine());

      if(a<b && a<c) {
         if(b<c) System.out.println(a+", "+b+", "+c);
         else System.out.println(a+", "+c+", "+b);

      }else if(b<c){
         if(a<c) System.out.println(b+", "+a+", "+c);
         else System.out.println(b+", "+c+", "+a);

      }else{
         if(a<b) System.out.println(c+", "+a+", "+b);
         else System.out.println(c+", "+b+", "+a);
      }
   }
}