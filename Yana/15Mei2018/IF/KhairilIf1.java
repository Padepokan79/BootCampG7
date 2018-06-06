/*
Created by	: Yana
Time		: 15 Mei 2018 20.05
*/

import java.util.Scanner;

public class KhairilIf1{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int inputan, daduA1, daduA2, daduA3, daduA4, daduA5, daduA6,
			daduB1, daduB2, daduB3, daduB4, daduB5, daduB6,
			daduC1, daduC2, daduC3, daduC4, daduC5, daduC6;

		daduA1	= 1;
		daduA2	= 2;
		daduA3	= 3;
		daduA4	= 4;
		daduA5	= 5;
		daduA6	= 6;
		daduB1	= 1;
		daduB2	= 2;
		daduB3	= 3;
		daduB4	= 4;
		daduB5	= 5;
		daduB6	= 6;
		daduC1	= 1;
		daduC2	= 2;
		daduC3	= 3;
		daduC4	= 4;
		daduC5	= 5;
		daduC6	= 6;

		System.out.print("Inputan : ");
		inputan = keyboard.nextInt();

		if ( inputan < 3 || inputan > 18) {
			System.out.println("Nilai tidak dalam lingkup 3 dadu");
		}
		else{
			System.out.println("Peluang dadu adalah: ");
			if ( inputan == 3 ) {
				System.out.println(daduA1+ " | " +daduB1+ " | " +daduC1);
			}
			else if ( inputan == 4 ) {
				System.out.println(daduA2+ " | " +daduB1+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB2+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB1+ " | " +daduC2);
			}
			else if ( inputan == 5 ) {
				System.out.println(daduA3+ " | " +daduB1+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB3+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB1+ " | " +daduC3);
				System.out.println(daduA1+ " | " +daduB2+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB1+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB2+ " | " +daduC1);
			}
			else if ( inputan == 6 ) {
				System.out.println(daduA4+ " | " +daduB1+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB4+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB1+ " | " +daduC4);
				System.out.println(daduA2+ " | " +daduB2+ " | " +daduC2);
			}
			else if ( inputan == 7 ) {
				System.out.println(daduA5+ " | " +daduB1+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB5+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB1+ " | " +daduC5);
				System.out.println(daduA3+ " | " +daduB2+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB3+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB2+ " | " +daduC3);
				System.out.println(daduA1+ " | " +daduB3+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB1+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB3+ " | " +daduC1);
			}
			else if ( inputan == 8 ) {
				System.out.println(daduA6+ " | " +daduB1+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB6+ " | " +daduC1);
				System.out.println(daduA1+ " | " +daduB1+ " | " +daduC6);
				System.out.println(daduA4+ " | " +daduB2+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB4+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB2+ " | " +daduC4);
				System.out.println(daduA2+ " | " +daduB3+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB2+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB3+ " | " +daduC2);
			}
			else if ( inputan == 9 ) {
				System.out.println(daduA5+ " | " +daduB2+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB5+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB2+ " | " +daduC5);
				System.out.println(daduA3+ " | " +daduB3+ " | " +daduC3);
				System.out.println(daduA1+ " | " +daduB4+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB1+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB4+ " | " +daduC1);
			}
			else if ( inputan == 10 ) {
				System.out.println(daduA6+ " | " +daduB2+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB6+ " | " +daduC2);
				System.out.println(daduA2+ " | " +daduB2+ " | " +daduC6);
				System.out.println(daduA4+ " | " +daduB3+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB4+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB3+ " | " +daduC4);
				System.out.println(daduA2+ " | " +daduB4+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB2+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB4+ " | " +daduC2);
			}
			else if ( inputan == 11 ) {
				System.out.println(daduA5+ " | " +daduB3+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB5+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB3+ " | " +daduC5);
				System.out.println(daduA3+ " | " +daduB4+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB3+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB4+ " | " +daduC3);
				System.out.println(daduA1+ " | " +daduB5+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB1+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB5+ " | " +daduC1);
			}
			else if ( inputan == 12 ) {
				System.out.println(daduA6+ " | " +daduB3+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB6+ " | " +daduC3);
				System.out.println(daduA3+ " | " +daduB3+ " | " +daduC6);
				System.out.println(daduA4+ " | " +daduB4+ " | " +daduC4);
				System.out.println(daduA2+ " | " +daduB5+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB2+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB5+ " | " +daduC2);
			}
			else if ( inputan == 13 ) {
				System.out.println(daduA5+ " | " +daduB4+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB5+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB4+ " | " +daduC5);
				System.out.println(daduA3+ " | " +daduB5+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB3+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB5+ " | " +daduC3);
				System.out.println(daduA1+ " | " +daduB6+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB1+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB6+ " | " +daduC1);
			}
			else if ( inputan == 14 ) {
				System.out.println(daduA6+ " | " +daduB4+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB6+ " | " +daduC4);
				System.out.println(daduA4+ " | " +daduB4+ " | " +daduC6);
				System.out.println(daduA4+ " | " +daduB5+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB4+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB5+ " | " +daduC4);
				System.out.println(daduA2+ " | " +daduB6+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB2+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB6+ " | " +daduC2);
			}
			else if ( inputan == 15 ) {
				System.out.println(daduA5+ " | " +daduB5+ " | " +daduC5);
				System.out.println(daduA3+ " | " +daduB6+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB3+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB6+ " | " +daduC3);
			}
			else if ( inputan == 16 ) {
				System.out.println(daduA6+ " | " +daduB5+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB6+ " | " +daduC5);
				System.out.println(daduA5+ " | " +daduB5+ " | " +daduC6);
				System.out.println(daduA4+ " | " +daduB6+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB4+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB6+ " | " +daduC4);
			}
			else if ( inputan == 17 ) {
				System.out.println(daduA5+ " | " +daduB6+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB5+ " | " +daduC6);
				System.out.println(daduA6+ " | " +daduB6+ " | " +daduC5);
			}
			else if ( inputan == 18 ) {
				System.out.println(daduA6+ " | " +daduB6+ " | " +daduC6);
			}
		}
		
		
	}
}

/*
1. >> 
Inputan merupakan jumlah angka dadu dari 3 dadu. Tampilkan kombinasi angka dadu setiap masing-masing yang berbeda angka dan berbeda urutan.

Inputan  : 4

Peluang angka dadu ==============
Angka dadu yang mungkin terjadi :
1 / 1 / 2
1 / 2 / 1
2 / 1 / 1

*/