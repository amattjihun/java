package 클래스활용;

import 클래스.TV;

public class TV활용 {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.on();
		tv.off();
		tv.shape = "네모";
		tv.size = 42;
		System.out.println(tv);
		
		TV tv2 = new TV();
		tv2.off();
		tv2.shape = "네모";
		tv.size = 55;
		System.out.println(tv2);
		
		
	}

}
