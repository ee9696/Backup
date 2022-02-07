class  Variable2 {
	int a;	//필드, 초기화, 인스터스 변수
	static int b; //필드, 초기화, 클래스 변수

	public static void main(String[] args) {
		int a = 10;	//지역변수, 쓰레기
		System.out.println("지역변수 a = " + a);

		Variable2 v = new Variable2(); //생성
		//System.out.println("필드 a = " + Variable2.a);
        System.out.println("필드 b = " + Variable2.b);
		System.out.println("필드 b = " + b);
	}
}//Variable2


[실행결과]

지역변수 a = 10
필드 b = 0
필드 b = 0