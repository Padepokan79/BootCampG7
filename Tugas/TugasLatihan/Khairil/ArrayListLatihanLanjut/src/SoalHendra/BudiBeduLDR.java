package SoalHendra;

import java.util.*;

class BudiBeduLDR {

	public static void main(String[] args) {
		int jarakMax = 350;
		int jarakMin = 0;
		int speedBedu = 60;
		int speedBudi = 80;
		int speedBedu30 = speedBedu/2;
		int speedBudi30 = speedBudi/2;
		int waktuStart = 6;
		int papasan = 0;
		boolean meets = false;
		
		ArrayList<Integer> speed = new ArrayList<Integer>();
		speed.add(speedBedu30);
		speed.add(speedBudi30);
		
		while(meets == false) {
			jarakMin+=speed.get(0);
			jarakMax-=speed.get(1);
			
			ArrayList<Integer> jarakTrue = new ArrayList<Integer>();
			jarakTrue.add(jarakMin);
			jarakTrue.add(jarakMax);
			
			for(int jarak : jarakTrue) {
				if(jarakMin == jarakMax) {
					papasan = jarak;
					meets = true;
					System.out.println("Budi dan Bedu bertemu di km " + papasan);
				}
				else {
					System.out.println("Otw");
					meets = false;
				}
			}
		}
		
		
		double jamTemu = waktuStart + (papasan / speed.get(1));
		System.out.println("Pada pukul " + jamTemu);
	}

}
