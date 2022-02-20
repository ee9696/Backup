package constructor;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InputMain {
   private int x;
   private double y;
   
   public InputMain() throws FileNotFoundException {
      Scanner scan = new Scanner(System.in);
      System.out.print("정수 입력 : ");
      x = scan.nextInt();
      System.out.print("실수 입력 : ");
      y = scan.nextDouble();
      
      //Scanner scan = new Scanner(new File("data.txt"));
      //x = scan.nextInt();
      //y = scan.nextDouble();
   }
   
   public void output() {
      System.out.println("x=" + this.x + "\t y=" + this.y);
   }
   
   public static void main(String[] args) throws FileNotFoundException {
      InputMain aa = new InputMain();
      aa.output();
      }

}
