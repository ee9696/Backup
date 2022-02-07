package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {
	
	public static void main(String[] args) {
		// 3�ڸ����� , ��� �Ҽ����� 3°�ڸ�
		// NumberFormat nf = new NumberFormat(); - error
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		// ��ȿ���ڰ� �ƴ� ���� ǥ������ �ʴ´�.
		NumberFormat nf2 = new DecimalFormat("#,###.##��");
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		//������ 0�� ǥ��
		NumberFormat nf3 = new DecimalFormat("#,###.00��");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//�߻�Ŭ������ �޼ҵ带 �̿��Ͽ� ����
		// 3�ڸ�����, ��� �Ҽ����� 3°�ڸ�
		//NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf5 = NumberFormat.getInstance();
		nf5.setMaximumFractionDigits(2); // �Ҽ����� 2°�ڸ�
		nf5.setMinimumFractionDigits(2); // ������ 0�� ǥ��
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		//NumberFormat nf6 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		nf6.setMaximumFractionDigits(2);	// �Ҽ� ���� 2°�ڸ�
		nf6.setMinimumFractionDigits(2);	// ������ 0�� ǥ��
		System.out.println(nf6.format(12345678.456789));
		System.out.println(nf6.format(12345678));
		System.out.println();
	}
}
