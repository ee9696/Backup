class HelloTest {
	public static void main(String[ ] args) {
		System.out.print("?ȳ??ϼ???.\n");
		System.out.println("?ݰ????ϴ?.");
		System.out.println("????\t????\t????");
		System.out.println();
		System.out.println(25+36);		// 61
		System.out.println("25+36");	  	// 25+36
		System.out.println("25" + "36");    	// 2536
		System.out.println("25 + 36 = " + 25 + 36);	// 25 + 36 = 2536
		System.out.println("25 + 36 = " + (25 + 36));	// 25 + 36 = 61
	}
}

[????????]
D:\java_se>javac HelloTest.java

D:\java_se>java HelloTest
?ȳ??ϼ???.
?ݰ????ϴ?.
????    ????    ????

61
25+36
2536
25 + 36 = 2536
25 + 36 = 61
