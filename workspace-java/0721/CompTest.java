class CompTest {
	public static void main(String[] args) {
		int score = 85;
		//조건                    ?  참   :   거짓;
		//score>=80 && score<=100 ? "합격" : "불합격";


	    String result = score>=80 && score<=100 ? "합격" : "불합격";
	  //System.out.println(score>=80 && score<=100 ? "합격" : "불합격" ;
	  	System.out.println("결과 = " + result);
	}
}

[실행결과]

결과 = 합격