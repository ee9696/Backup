/*
가위 바위 보 게임

가위(1), 바위(2), 보(3)으로 인식한다
컴퓨터는 1 ~ 3사이의 난수를 발생한다.

[실행결과]
가위(1), 바위(2), 보(3) 중 번호를 입력 : 2 (System.in.read() 사용하세요)
배팅 금액 입력 : 200 (BufferedReader 사용하세요)
결과를 보려면 아무키나 누르세요......
컴퓨터 : 가위, 나 : 바위
이겼습니다.
현재 금액은 1,200원 입니다.

*/
package if_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		DecimalFormat df = new DecimalFormat();
		int com, user;
		int money = 1000;
		System.out.print("가위(1), 바위(2), 보(3) 중 번호를 입력 : ");
		user  = System.in.read()-48;
		System.in.read(); // 엔터키를 눌러도 엔터값이 입력되기때문에 이값을 없애줘야 합니다. 두개 써줍시다.
		System.in.read(); // 엔터키를 누를때 아스키코드 13번 값이 입력이되고 개행이 될때 10번이 입력이되기때문입니다.
		
		

		System.out.print("배팅 금액 입력 : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("Press Enter key to continue...");
		System.in.read(); 
		System.in.read();

		com = (int)(Math.random()*3)+1;
		if(com==1){
			System.out.print("컴퓨터 : 가위, ");
		}
		if(com==2){
			System.out.print("컴퓨터 : 바위, ");
		}
		if(com==3){
			System.out.print("컴퓨터 : 보, ");
		}
		if(user==1){
			System.out.println("나 : 가위");
		}
		if(user==2){
			System.out.println("나 : 바위");
		}
		if(user==3){
			System.out.println("나 : 보");
		}
		
		if(com==1){
			if(user==1){
				System.out.print("비겼습니다.\n현재 금액은 " + df.format(money) + "원 입니다.");
				}
			if(user==2){
				System.out.print("졌습니다.\n현재 금액은 " + df.format(money-b) + "원 입니다.");
				}
			if(user==3){
				System.out.print("이겼습니다.\n현재 금액은 " + df.format(money+b) + "원 입니다.");
				}
		}
		if(com==2){
			if(user==1){
				System.out.print("졌습니다.\n현재 금액은 " + df.format(money-b) + "원 입니다.");
				}
			if(user==2){
				System.out.print("비겼습니다.\n현재 금액은 " + df.format(money) + "원 입니다.");
				}
			if(user==3){
				System.out.print("이겼습니다.\n현재 금액은 " + df.format(money+b) + "원 입니다.");
				}
		}
		if(com==3){
			if(user==1){
				System.out.print("이겼습니다.\n현재 금액은 " + df.format(money+b) + "원 입니다.");
				}
			if(user==2){
				System.out.print("졌습니다.\n현재 금액은 " + df.format(money-b) + "원 입니다.");
				}
			if(user==3){
				System.out.print("비겼습니다.\n현재 금액은 " + df.format(money) + "원 입니다.");
				}
		}
	}
}
	

/*
package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      DecimalFormat df = new DecimalFormat();
      int com, user;
      int money = 1000;
      int batting;

      //난수
      com = (int)(Math.random()*3) + 1; //0 ~ 2  ->  1 ~ 3
      
      System.out.print("가위(1), 바위(2), 보(3) 중 번호를 입력 : ");
      user = System.in.read()-48;
      System.in.read();
      System.in.read();
      System.out.print("배팅 금액 입력 : ");
      batting = Integer.parseInt(br.readLine());
      
      System.out.println("결과를 보려면 아무키나 누르세요......");
      System.in.read();
      System.in.read();
      
      if(com==1) {//컴:가위
         if(user==1) {
            System.out.println("컴퓨터 : 가위, 나 : 가위");
            System.out.println("비겼습니다");
         }else if(user==2) {
            System.out.println("컴퓨터 : 가위, 나 : 바위");
            System.out.println("이겼습니다");
            money += batting; //money = money+batting
         }else if(user==3) {
            System.out.println("컴퓨터 : 가위, 나 : 보자기");
            System.out.println("졌습니다..ㅠㅠ");
            money -= batting; //money = money-batting
         }
      
      }else if(com==2) {//컴:바위
         if(user==1) {
            System.out.println("컴퓨터 : 바위, 나 : 가위");
            System.out.println("졌습니다..ㅠㅠ");
            money -= batting; //money = money-batting
         }else if(user==2) {
            System.out.println("컴퓨터 : 바위, 나 : 바위");
            System.out.println("비겼습니다");
         }else if(user==3) {
            System.out.println("컴퓨터 : 바위, 나 : 보자기");
            System.out.println("이겼습니다");
            money += batting; //money = money+batting
         }
         
      }else if(com==3){//컴:보자기
         if(user==1) {
            System.out.println("컴퓨터 : 보자기, 나 : 가위");
            System.out.println("이겼습니다");
            money += batting; //money = money+batting
         }else if(user==2) {
            System.out.println("컴퓨터 : 보자기, 나 : 바위");
            System.out.println("졌습니다..ㅠㅠ");
            money -= batting; //money = money-batting
         }else if(user==3) {
            System.out.println("컴퓨터 : 보자기, 나 : 보자기");
            System.out.println("비겼습니다");
         }
      }//if
      
      System.out.println("현재 금액은 "+df.format(돈)+"원 입니다.");
   }
}


		
		

		
		

		//난수
		//int a = (int)(Math.random()*3) + 1;
		//System.out.println(a);

		//Random r = new Random();
		//int b = r.nextInt(3) + 1; // 0 ~ 2
	}
}
*/
		