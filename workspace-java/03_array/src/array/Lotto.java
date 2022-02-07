/*
 * 1~45사이의 난수를 6개 발생하시오
 * -중복된 숫자 없어야 한다.
 * -오름차순
 * 
 * [실행결과]
 * 7 12 25 36 37 42
 * 
 * 첫번 째 결과가 잘 나오면 두 번째로 수정 하시오.
 * 
 * 돈 입력 : 7000
 */


package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Lotto {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] lotto =new int[6];
			int temp;
			int money;
			int a;
			int count=0;
			
			System.out.print("돈 입력 : ");
			money = Integer.parseInt(br.readLine());
			money /= 1000;

			for(a=1; a<=money; a++) {
				for(int i=0; i<lotto.length; i++) {
					lotto[i] = (int)(Math.random()*45)+1;
					for (int j=0; j<i; j++) {
						if(lotto[i] == lotto[j]) {
							i--;
							break;
							
						}
					}
				}
			/*for(int i=0; i<lotto.length; i++) {
				for (int j=0; j<i; j++) {
					if(lotto[i] < lotto[j]) {
						temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;	
					}
				}
			} */
				
				Arrays.sort(lotto);
			//출력
				for(int x : lotto) {
					System.out.print(String.format("%5d",x));
			}
				System.out.println();
				
				if(a%5==0) System.out.println();
			} //for a
	}
}




/*
/*
로또 - 자동
1~45사이의 난수를 6개 발생하시오
- 중복된 숫자 없어야 한다.
- 오름차순
- 5줄씩 끊어서 출력

[실행결과]
 7 12 25 36 37 42
 
첫번째 결과가 잘 나오면 두번째로 수정하시오

돈 입력 : 7000

    9   10   14   19   22   30
    1   17   21   31   34   36
   10   20   22   27   33   39
   20   23   28   31   36   38
    1   11   12   26   27   31

   11   13   20   33   37   40
    5   15   17   23   35   38
 

package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lotto {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[] lotto = new int[6];
      int money;
      
      System.out.print("돈 입력 : ");
      money = Integer.parseInt(br.readLine());
      
      for(int k=1; k<=money/1000; k++) {
         for(int i=0; i<lotto.length; i++) {
            lotto[i] = (int)(Math.random()*45) + 1; //난수 발생
            
            //중복 비교
            for(int j=0; j<i; j++){
               if(lotto[i] == lotto[j]) {
                  i--;//4
                  break; //for j를 벗어나라
               }
            }//for j
         }//for i
      
         int temp;
         for(int i=0; i<lotto.length-1; i++) {
            for(int j=i+1; j<lotto.length; j++) {
               if(lotto[i] > lotto[j]) {
                  temp = lotto[i];
                  lotto[i] =  lotto[j];
                  lotto[j] = temp;
               }
            }
         }
      
         //출력
         for(int data : lotto){
            System.out.print(String.format("%5d", data));
         }
         System.out.println();
         
         if(k%5==0) System.out.println();
      }//for k

   }

}

*/