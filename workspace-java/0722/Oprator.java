class Oprator {
	public static void main(String[] args) {
		int a = 5;
		a+=2; //a=a+2
		a*=3; //a=a*3
		System.out.println("a = " + a);  // 21

		a++; // a += 1, a = a + 1
		System.out.println("a = " + a);  // 22

		int b = a++;
		System.out.println("a = " + a + "\t b = " + b); // a=23 b=22

		System.out.println("a++ = " + a++);  // 23
		// 1. System.out.println("a++ = " + a);
		// 2. a++;
		System.out.println("a = " + a);  // 24

		int c = a++ - --b;
		System.out.println("a = " + a + "\t b = " + b + "\t c = " + c); // a=25, b=21, C=3
	
	}
}
