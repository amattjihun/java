package Ŭ����Ȱ��;

import Ŭ����.TV;

public class TVȰ�� {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.on();
		tv.off();
		tv.shape = "�׸�";
		tv.size = 42;
		System.out.println(tv);
		
		TV tv2 = new TV();
		tv2.off();
		tv2.shape = "�׸�";
		tv.size = 55;
		System.out.println(tv2);
		
		
	}

}
