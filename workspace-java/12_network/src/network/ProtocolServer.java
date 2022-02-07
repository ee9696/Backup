package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	
	public ProtocolServer() {
		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("서버준비완료");
			
			socket = serverSocket.accept();//낚아채서 클라이언트와 연결할 소켓을 만들어준다
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
		
		String line = null;
		while(true) {
			//받는 쪽
			try {
				line = br.readLine(); //한 줄, 엔터 전까지 읽어온다.
				                      //"100:angel", "200:angel", "300:angel:안녕"
				
				//보내는 쪽
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) { //"angel님 입장",
					bw.write(ar[1]+"님 입장\n");
					bw.flush();
				
				}else if(ar[0].equals(Protocol.EXIT)) { //"angel님 퇴장"
					bw.write(ar[1]+"님 퇴장\n");
					bw.flush();
					
					br.close();
					bw.close();
					socket.close();
					
					System.exit(0);
					
				}else if(ar[0].equals(Protocol.SEND_MESSAGE)) { //"[angel] 안녕"
					bw.write("["+ar[1]+"] "+ar[2]+"\n");
					bw.flush();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}//while
	}//ProtocolServer()
	
	public static void main(String[] args) {
		new ProtocolServer();
	}

}




