package 배열고급;

import java.util.ArrayList;

public class 배열문제3 {

	public static void main(String[] args) {
		ArrayList bag = new ArrayList();
		bag.add("필통");
		bag.add("휴대폰");
		bag.add(1000);
		System.out.println(bag);
		
		
		bag.add("2000");
		System.out.println(bag);
		
		
		bag.remove("필통");
		System.out.println(bag);
		
		
		System.out.println(bag.size());
		
	}

}
