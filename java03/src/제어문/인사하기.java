package Á¦¾î¹®;

import java.util.Date;

public class ÀÎ»çÇÏ±â {

	public static void main(String[] args) {
		Date date = new Date();
		
		int time = date.getHours();
		System.out.println("ÇöÀç ½Ã°¢Àº " + time + "½Ã ÀÔ´Ï´Ù.");
		if (time < 10) {
			System.out.println("±Â¸ğ´×");
		}else if (time < 17) {
			System.out.println("±Â¿¡ÇÁÅÍ´«");
		}else if (time < 21) {
			System.out.println("±ÂÀÌºê´×");
		}else {
			System.out.println("±Â³ªÀÕ");
			
		}
	}

}
