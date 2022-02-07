package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadMain {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
				
		PersonDTO dto = (PersonDTO)ois.readObject();	// 자식 = (자식)부모
		
				
				
		System.out.println("이름 = "+ dto.getName());
		System.out.println("나이 = "+ dto.getAge());
		System.out.println("키 = " + dto.getHeight());
	}

}
