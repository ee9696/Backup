package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
				// ���ڸ� ���ڷ� ��ȯ
		while((data=bis.read()) != -1) {	//1���� ���ھ� �о�´�(�� �̻� ���� ���ڰ� ������ -1)
			System.out.print((char)data);	// data = int�� ���� ���´�.
		}//while
		
		bis.close();
	}
}
