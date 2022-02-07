/*
실행시 이름, 국어, 영어, 수학 점수를 입력받아서 총점과 평균을 구하시오.
단) 국어, 영어, 수학은 문자열이므로 정수형으로 변환해야 한다. - Integer 클래스의 메소드를 이용

[실행결과]
javac SungJuk.java
java SungJuk  홍길동  95   97   100

      *** 홍길동 성적표 ***
국어   영어   수학   총점   평균 
95	  97    100   xxx  xx.xx
*/

//import java.lang.Integer;

class SungJuk {
	public static void main(String[] args) {

		SungJuk sj = new SungJuk();

		String name = args[0];
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int math = Integer.parseInt(args[3]);
		int tot = sj.total(kor, eng, math); // 메소드를 만들어서 총점을 구해서 가져온다.
		double avg = sj.average(kor, eng, math); // 메소드를 만들어서 평균을 구해서 가져온다.

		System.out.println("\t*** " + name + " ***");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f",avg));
	

	}
	public int total(int kor, int eng, int math) {
		return kor+eng+math;
	}

	public double average(double kor,double eng,double math) {
		return (kor+eng+math)/3;
	}
}

/*
class SungJuk {
   public static void main(String[] args) {
      SungJuk sj = new SungJuk();

      String name = args[0];
      int kor = Integer.parseInt(args[1]); 
      int eng = Integer.parseInt(args[2]);
      int math = Integer.parseInt(args[3]);

      int tot = sj.total(kor, eng, math);

      //double avg = sj.average(tot);
      String avg = sj.average(tot);

      System.out.println("\t *** " + name + " 성적표 ***");
      System.out.println("국어\t영어\t수학\t총점\t평균");
      //System.out.println(kor + "\t" + eng  + "\t" + math + "\t" + tot  + "\t" + String.format("%.2f",avg));
      System.out.println(kor + "\t" + eng  + "\t" + math + "\t" + tot  + "\t" + avg);
   }

   public int total(int kor, int eng, int math){
      return kor+eng+math;
   }

   //public double average(int tot){
   //   return tot/3.0;
   //}

   public String average(int tot){
      return String.format("%.2f", tot/3.0);
   }

}
*/