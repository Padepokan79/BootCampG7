/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 7.39 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class BelahKetupat {
	public static void main( String[] args ) {

	int i,j,k, l,baris, tinggi, setengahTinggi;

	tinggi = 9; //jumlah baris
	l = 1; //kondisi ada bintang atau tidak
	
	if (tinggi%2 == 0) {
		setengahTinggi = tinggi/2;
			for (i = 0; i < setengahTinggi; i++) {
				for (j = setengahTinggi; j > i; j--) {
					System.out.print(" ");
				}
			for (k = 1; k <= l; k++) {
				if (k == 1 || k == l) {
					System.out.print("*");
				} else {
					System.out.print(" ");
						}
			}
		l += 2;
	System.out.println();
	}


	l -= 2;
	
	for (i = 0; i < setengahTinggi; i++) {
		for (j = 0; j <= i; j++) {
			System.out.print(" ");
		}
		for (j = l; j > 0; j--) {
			if (j == 1 || j == l) {
				System.out.print("*");
			} else {
				System.out.print(" ");
				}
		}
		l -= 2;
	System.out.println();
		}
	} else {
	setengahTinggi = (tinggi / 2);
		for (i = 0; i < setengahTinggi; i++) {
			for (j = setengahTinggi; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= l; k++) {
				if (k == 1 || k == l) {
					System.out.print("*");
				} else {
					System.out.print(" ");
					}
			}
	l += 2;
	System.out.println();
	}

	for (i = 0; i < tinggi-setengahTinggi; i++) {
		for (j = 0; j <= i; j++) {
			System.out.print(" ");
		}
		for (j = l; j > 0; j--) {
			if (j == l || j == 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
					}
		}
	l -= 2;
	System.out.println();
	}
	}
	}
	}

/*

-buatlah gambar seperti di bawah ini menggunakan looping dan if statement
     *
    * *
   *   * 
  *     *
 *       *
  *     * 
   *   *
    * *
     *
*/