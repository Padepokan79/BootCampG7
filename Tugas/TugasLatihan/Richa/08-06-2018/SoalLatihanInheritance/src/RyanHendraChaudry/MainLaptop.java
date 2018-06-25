/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 11.27 AM
Updated by			:
Updated Date/hour	:
*/

package RyanHendraChaudry;

public class MainLaptop {

	public static void main(String[] args) {
		
		Asus as = new Asus("RX-208", 9800000, 2.9, 5, 4, "Asus", "Intel core duo", 3.2 , 'Y');
		MacBook mb = new MacBook("Touchbar", 11200000, 2.3, 4, 3, "Macbook pro", "NVDIA", 1.2 , 'N');
		
		System.out.println(as.toString());
		as.setClockSpeed(23);
		as.setUkuranHD(7);
		as.setUkuranRAM(3);
		System.out.println(as.toString());
		System.out.println(mb.toString());
		mb.setClockSpeed(22);
		mb.setUkuranHD(5);
		mb.setUkuranRAM(2);
		System.out.println(mb.toString());

	}

}
