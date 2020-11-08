package 네트워크;
import java.io.IOException;
import java.net.ServerSocket;

public class 네트워크서버 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버 시작. 요청 승인 대기중..");
		int count = 0;
		while (true) {
			server.accept();//승인함
			count++;
			System.out.println(count + ": 요청 승인");
		}
	}

}
