package 네트워크;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class 네트워크고객 {

	public static void main(String[] args) throws IOException{
		for (int i = 0; i < 1000; i++) {
			Socket 고객 = new Socket("localhost", 9100);
			System.out.println(i+ "번 고객이 요청함.");
		}
		
	}

}
