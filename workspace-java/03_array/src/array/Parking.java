
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Parking {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int menu;
		boolean[] ar = new boolean[5];
		int index;
		
		while(true) {
			System.out.println("**************");
			System.out.println("	1. 입차");
			System.out.println("	2. 출차");
			System.out.println("	3. 리스트");
			System.out.println("	4. 종료");			
			System.out.println("**************");
			System.out.print("메뉴 : ");
			menu = Integer.parseInt(br.readLine());
			if(menu==4) break;
			
			if(menu==1) { 
				System.out.print("위치 입력 : ");
				index = Integer.parseInt(br.readLine());
				if(ar[index-1] == true)
					System.out.println("이미 주차되어 있습니다.");
				else {
					System.out.println(index + "위치에 입차");
					ar[index-1] = true;
				}
			}	
			else if(menu==2) {
				System.out.print("위치 입력 : ");
				index = Integer.parseInt(br.readLine());
				if(ar[index-1] == false)
					System.out.println("주차되어 있지 않습니다.");
				else {
					System.out.println(index + "위치에 출차");
					ar[index-1] = false;
				}
			}
			else if(menu==3) {
				for(int i=0; i<ar.length; i++) 
					System.out.println((i+1) + "위치" + ar[i]);
			}else
				System.out.println("1~4번까지만 입력하세요.");
		}//while
	      System.out.println("프로그램 종료합니다.");

	}
}


			


