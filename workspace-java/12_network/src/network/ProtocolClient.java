package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	private Socket socket;
	private BufferedReader br, keyboard;
	private BufferedWriter bw;
	
	public ProtocolClient() {
		try {
			socket = new Socket("172.30.1.9", 9500); //���� ����
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�");
			e.printStackTrace();
			System.exit(0);
			
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		} 
		
		String msg = null;
		String line = null;
		while(true) {
			try {
				//������ ������ ��
				System.out.print("�Է� : ");
				msg = keyboard.readLine(); //�� ��, ���� ������ �о�´�.
				
				bw.write(msg+"\n");//������ ������, "100:angel", "200:angel", "300:angel:�ȳ�"
				bw.flush();//���� ����
				
				//�޴� ��
				line = br.readLine(); // "angel�� ����", "angel�� ����", "[angel] �ȳ�"
				System.out.println(line);
				
				String[] ar = msg.split(":"); //"100","angel" �Ǵ� "200","angel"
				if(ar[0].equals("200")) {
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					
					System.exit(0);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//ProtocolClient()
	
	public static void main(String[] args) {
		new ProtocolClient();
	}
}

