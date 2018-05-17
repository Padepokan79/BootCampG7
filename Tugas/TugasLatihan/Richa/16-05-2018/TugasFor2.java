/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 10.45 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class TugasFor2 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	int waktu, kue, jualKue;

	kue = 200;
	jualKue = 3; //per 15 menit
	waktu = (8*60) + 30; // menit

	for (; waktu >= 0 ; waktu-=15) {
		kue = kue - jualKue;
		System.out.println("Sisa "+ kue + " kue");
		 	}
	}
}
/*Seorang Pedagang kue, setiap harinya membawa 200 potong kue untuk di jual.
Setiap 15 menit penjual tersebut berhasil menjual 3 potong kue.
Berapakah kue yang tersisa jika si penjual berjualan selama 8 jam 30 menit? */