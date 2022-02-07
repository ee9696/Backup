package inheritance;

class AA {
	public int a = 3;
	
	public void disp() {
		a += 5;
		System.out.print("AA + " + a + " ");
	}
}
//----------------------------------
class BB extends AA {
	public int a = 8;
	
	
	public void disp() {
		this.a += 5; // this.a = this.a + 5
		System.out.print("BB : " + a + " ");
	}
}
public class TestMain2 {
	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp(); // BB: 13
		System.out.println("aa : " + aa.a);  // 13
		System.out.println();
		
		AA bb = new BB();	//�θ� = �ڽ� - ������
		bb.disp();  //  BB : 13
		System.out.println("bb : " + bb.a);	//13(�ʵ�� Override ������ ����)
		System.out.println();
		
		AA cc = new AA();
		cc.disp();
		System.out.println("cc : " + cc.a);	// 8 
		System.out.println();
		
		BB dd = (BB)bb;	//�ڽ� = (�ڽ�)�θ� - Casting(����ȯ)
		dd.disp();
		System.out.println("dd : " + dd.a);
		System.out.println();
	}
}
