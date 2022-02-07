/*
10진ㅅ누를 2진수, 8진수, 16진수로 변환하시오.
단) Integer안에 메소드 사용하시오
*/

class Jinsu {
	public static void main(String[] args) {
		int dec = 250;
		String binary = Integer.toBinaryString(dec);
		String octal = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);

		System.out.println("10진수 = " + dec);
		System.out.println("2진수 = " + binary);
		System.out.println("8진수 = " + octal);
		System.out.println("16진수 = " + hexa);
	}
}
