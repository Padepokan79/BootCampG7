/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 9.24 AM
Updated by			:
Updated Date/hour	:

*/import java.util.Scanner;

public class RyanIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	int jmlOrang, rumah1, rumah2, maksRumah2, maksRumah1, maksKamarRumah1, maksKamarRumah2, maksOrangRumah1, maksOrangRumah2;

	System.out.print ("Jumlah orang: ");
	jmlOrang = keyboard.nextInt ();

	rumah1 = 650; // rb/kamar
	rumah2 = 350; // rb/kamar

	maksRumah1 = 4;
	maksRumah2 = 7;
	maksKamarRumah1 = 3;
	maksKamarRumah2 = 2;

	maksOrangRumah1 = 12;
	maksOrangRumah2 = 14;

	if (jmlOrang > maksOrangRumah2) {
		System.out.println("Tidak ada rumah yang cukup!");
	}
	else if ((jmlOrang <=14 && jmlOrang >=4) || (jmlOrang <=2 && jmlOrang >=1) ) {
		System.out.println("Rekomendasinya adalah Rumah 2");
	}
	else if (jmlOrang == 3) {
		System.out.println("Rekomendasinya adalah Rumah 1");

	}

}
}



/*2. Ana mempunyai 2 rumah yang akan dijadikan tempat kos dengan rincian harga dan rumah
	R1 = 650rb/kamar, ada 4 kamar, maks perkamar 3 orang
	R2 = 350rb/kamar, ada 7 kamar, maks perkamar 2 orang

buatlah algoritma yang dapat menentukan ke kosan mana orang harus ngekos dengan harga minimum */