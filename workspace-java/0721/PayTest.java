import java.text.DecimalFormat;

class PayTest {
	public static void main(String[] args) {
		char name = 'L';
		// String name = "L";

		int basePay = 2500000;
		double tax = (double)basePay * 0.033;
		double salary = (double)basePay - tax;

		// ���� 3�ڸ����� ,�� ǥ��
		DecimalFormat df = new DecimalFormat();

		System.out.println("*** " + name + "�� ���� ***");
		System.out.println("�⺻�� : " + df.format(basePay) + "��");
		System.out.println("����  : " + df.format((int)tax) + "��");
		System.out.println("����  : " + df.format((int)salary) + "��");

		
	}
}


[������]

*** L�� ���� ***
�⺻�� : 2,500,000��
����  : 82,500��
����  : 2,417,500��