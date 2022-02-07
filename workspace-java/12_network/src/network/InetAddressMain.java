package network;

import java.net.InetAddress;  //�߻� Ŭ���� X �⺻ ������ X
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("NAVER IP = " + naver.getHostAddress());
		System.out.println();
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("localhost IP = " + local.getHostAddress());
		System.out.println();
		
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net");
		for(InetAddress ia : daum) {
			System.out.println("DAUM IP = " + ia.getHostAddress());
		}//for
	}
}
