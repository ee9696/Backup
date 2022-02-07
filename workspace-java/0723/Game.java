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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		DecimalFormat df = new DecimalFormat();

		int money = 1000;
		System.out.print("가위(1), 바위(2), 보(3) 중 번호를 입력 : ");
		int user  = Integer.parseInt(br.readLine());
		
		System.out.print("배팅 금액 입력 : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("Press Enter key to continue...");
		String c = br.readLine();

		int com = (int)(Math.random()*3)+1;
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





		
		

		
		

		//난수
		//int a = (int)(Math.random()*3) + 1;
		//System.out.println(a);

		//Random r = new Random();
		//int b = r.nextInt(3) + 1; // 0 ~ 2
	}
}
