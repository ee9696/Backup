class CompTest4 {
	public static void main(String[] args) {
		char ch = 'z';

		char result = ch>='A' && ch<='Z' ? (char)(ch + 32) : (char)(ch - 32);
		System.out.println(ch + " → " + result);
		// int result = ch>='A' && ch<='Z' ? ch+32 : ch-32;
		// Ssystem.out.println(ch + " → " + (char)result);

	}
}


[실행결과]

z → Z