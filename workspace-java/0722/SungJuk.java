/*
����� �̸�, ����, ����, ���� ������ �Է¹޾Ƽ� ������ ����� ���Ͻÿ�.
��) ����, ����, ������ ���ڿ��̹Ƿ� ���������� ��ȯ�ؾ� �Ѵ�. - Integer Ŭ������ �޼ҵ带 �̿�

[������]
javac SungJuk.java
java SungJuk  ȫ�浿  95   97   100

      *** ȫ�浿 ����ǥ ***
����   ����   ����   ����   ��� 
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
		int tot = sj.total(kor, eng, math); // �޼ҵ带 ���� ������ ���ؼ� �����´�.
		double avg = sj.average(kor, eng, math); // �޼ҵ带 ���� ����� ���ؼ� �����´�.

		System.out.println("\t*** " + name + " ***");
		System.out.println("����\t����\t����\t����\t���");
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

      System.out.println("\t *** " + name + " ����ǥ ***");
      System.out.println("����\t����\t����\t����\t���");
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