/*
	 Program     : Soal 2 - Ryan
     Creator     : Khairil
     Created At  : 16 Mei 2018 19:20 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RyanIfElse2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String r1, r2;
		int inputJumOrang, harga1, harga2, total1, total2;

		r1 = "650rb/kamar, ada 4 kamar, maks perkamar 3 orang";
		r2 = "350rb/kamar, ada 7 kamar, maks perkamar 2 orang";

		harga1 = 650000;
		harga2 = 350000;

		total1 = 0;
		total2 = 0;

		System.out.print("Input Jumlah Orang (Max : 14) : ");
		inputJumOrang = keyboard.nextInt();

		if(inputJumOrang == 1 || inputJumOrang == 2 ) {
			total1 = harga1;
			total2 = harga2;
		} 
		else if(inputJumOrang == 3) {
			total1 = harga1;
			total2 = 2 * harga2;
		}
		else if(inputJumOrang == 4 ) {
			total1 = 2 * harga1;
			total2 = 2 * harga2;	
		}
		else if(inputJumOrang == 5 || inputJumOrang == 6 ) {
			total1 = 2 * harga1;
			total2 = 3 * harga2;	
		}
		else if(inputJumOrang == 7 || inputJumOrang == 8 ) {
			total1 = 3 * harga1;	
			total2 = 4 * harga2;
		}
		else if(inputJumOrang == 9) {
			total1 = 3 * harga1;
			total2 = 5 * harga2;
		}
		else if(inputJumOrang == 10) {
			total1 = 4 * harga1;
			total2 = 5 * harga2;
		}
		else if(inputJumOrang == 11 || inputJumOrang == 12) {
			total1 = 4 * harga1;
			total2 = 6 * harga2;
		}
		else if(inputJumOrang == 13 || inputJumOrang == 14) {
			total2 = 7 * harga2;
		}

		System.out.println("Kosan 1 : " + total1 );
		System.out.println("Kosan 2 : " + total2 );
		System.out.println("Termurah");

		if(total1 < total2) {
			if(inputJumOrang < 13) {
				System.out.println(r1);			
			}
			else {
				System.out.println(r2);	
				System.out.println("Kosan 1 tidak mencukupi");
			}
		}
		else if (total2 < total1) {
			System.out.println(r2);
		}
	}
}



//2. Ana mempunyai 2 rumah yang akan dijadikan tempat kos dengan rincian harga dan rumah