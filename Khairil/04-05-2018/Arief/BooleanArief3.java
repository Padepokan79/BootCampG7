/*
	 Program     : Boolean Arief 3 / Spesifikasi Laptop
     Creator     : Khairil
     Created At  : 3 Mei 2018 14:45 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanArief3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputRam, ram;
		double inputHD, hd, inputProc, procMin, procMax; 
		boolean specLaptop;

		System.out.print( "Input kapasitas RAM :  " );
		inputRam = keyboard.nextInt();

		System.out.print( "Input kapasitas harddisk :  " );
		inputHD = keyboard.nextDouble();

		System.out.print( "Input kapasitas processor  :  " );
		inputProc = keyboard.nextDouble();

		ram = 8;
		hd = 1;
		procMin = 3.0;
		procMax = 4.5;

		specLaptop = ( inputRam >= ram && inputHD >= hd && (inputProc >= procMin && inputProc <= procMax ) );

		System.out.println( "Terpenuhi ?  : " + specLaptop );		
	}
}