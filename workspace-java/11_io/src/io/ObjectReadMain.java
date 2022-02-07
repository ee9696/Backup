package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadMain {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
				
		PersonDTO dto = (PersonDTO)ois.readObject();	// �ڽ� = (�ڽ�)�θ�
		
				
				
		System.out.println("�̸� = "+ dto.getName());
		System.out.println("���� = "+ dto.getAge());
		System.out.println("Ű = " + dto.getHeight());
	}

}
