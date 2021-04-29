package chat.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
	private ServerSocket ss;
	static Set<ChatServerThread> clients = new HashSet<>();
	private void startServer(){
		try{
			// 서버소켓 생성
			ss = new ServerSocket(1234);
			System.out.println("서버 구동 완료. 1234");
			
			while(true) {
				// 클라이언트 접속 대기
				Socket s = ss.accept();
				System.out.println("클라이언트 접속. " + s.getInetAddress().getHostAddress());
				ChatServerThread st = new ChatServerThread(s);				
				st.start();
				
				synchronized(ChatServer.clients){
					clients.add(st);
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChatServer().startServer();
	}
}





















