class  Variable2 {
	int a;	//�ʵ�, �ʱ�ȭ, �ν��ͽ� ����
	static int b; //�ʵ�, �ʱ�ȭ, Ŭ���� ����

	public static void main(String[] args) {
		int a = 10;	//��������, ������
		System.out.println("�������� a = " + a);

		Variable2 v = new Variable2(); //����
		//System.out.println("�ʵ� a = " + Variable2.a);
        System.out.println("�ʵ� b = " + Variable2.b);
		System.out.println("�ʵ� b = " + b);
	}
}//Variable2


[������]

�������� a = 10
�ʵ� b = 0
�ʵ� b = 0