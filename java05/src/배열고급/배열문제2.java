package 배열고급;

import java.util.Random;

public class 배열문제2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		double[] n = new double[500];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextDouble();
		}
		
		double min = n[0];
		for (int i = 0; i < n.length; i++) {
			
			if (min > n[i]) {
				min = n[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if(min == n[i]); {
				count++;
			}
		}
		System.out.println(count);
		
		
		double[] n2 = new double[500];
		n2[0] = r.nextDouble();
		
		
		for (int i = 0; i < n2.length; i++) {
			
			}
		}
	
		int count2 = 0;
	

}
