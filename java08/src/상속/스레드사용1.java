package 상속;

public class 스레드사용1 {

	public static void main(String[] args) {
		Counter c = new Counter();
		날짜 d = new 날짜();
		이미지 i = new 이미지();
		c.start();
		d.start();
		i.start();
	}

}
