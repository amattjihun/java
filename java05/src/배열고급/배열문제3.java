package �迭���;

import java.util.ArrayList;

public class �迭����3 {

	public static void main(String[] args) {
		ArrayList bag = new ArrayList();
		bag.add("����");
		bag.add("�޴���");
		bag.add(1000);
		System.out.println(bag);
		
		
		bag.add("2000");
		System.out.println(bag);
		
		
		bag.remove("����");
		System.out.println(bag);
		
		
		System.out.println(bag.size());
		
	}

}
