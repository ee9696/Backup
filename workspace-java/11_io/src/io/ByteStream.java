package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
				// 문자를 숫자로 변환
		while((data=bis.read()) != -1) {	//1개의 문자씩 읽어온다(더 이상 읽을 문자가 없으면 -1)
			System.out.print((char)data);	// data = int형 값이 나온다.
		}//while
		
		bis.close();
	}
}
