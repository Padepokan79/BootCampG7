/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 5.52 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class FengShui {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	int  urutan, nomorLen;
	String nol, satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, nomorHP;

	nol = "0 khusus, special, langka,";
	satu = "1 satu, satu-satunya, diri sendiri,";
	dua = "2 mudah, gampang, tidak sulit";
	tiga = "3 menemukan, mendapatkan, hidup,";
	empat = "4 mati, miskin, susah,";
	lima = "5 Tidak akan, tidak pernah, tidak bisa";
	enam = "6 Menuju, akan";
	tujuh= " 7 Tepat, hoki, atau bisa disebut juga ketuhanan";
	delapan = "8 Makmur";
	sembilan = "9 Sukses";

	System.out.println("Maksukan No HP anda:");
	nomorHP = keyboard.next ();
	nomorLen = nomorHP.length ();

	System.out.println();

	for (urutan = 0; urutan <= nomorLen-1; urutan++){
		if (nomorHP.charAt(urutan) == '0') {
			System.out.println(nol);
		}
		else if (nomorHP.charAt(urutan) =='1'){
			System.out.println(satu);
		}
		else if (nomorHP.charAt(urutan) == '2'){
			System.out.println(dua);
		}
		else if (nomorHP.charAt(urutan) == '3'){
			System.out.println(tiga);
		}
		else if (nomorHP.charAt(urutan) == '4'){
			System.out.println(empat);
		}
		else if (nomorHP.charAt(urutan) == '5'){
			System.out.println(lima);
		}
		else if (nomorHP.charAt(urutan) == '6'){
			System.out.println(enam);
		}
		else if (nomorHP.charAt(urutan) == '7'){
			System.out.println(tujuh);
		}
		else if (nomorHP.charAt(urutan) == '8'){
			System.out.println(delapan);
		}
		else if (nomorHP.charAt(urutan) == '9'){
			System.out.println(sembilan);
		}

	}
}
}



/*
No HP Berdasarkan FengShui

0 khusus, special, langka,
1 satu, satu-satunya, diri sendiri,
2 mudah, gampang, tidak sulit
3 menemukan, mendapatkan, hidup,
4 mati, miskin, susah,
5 Tidak akan, tidak pernah, tidak bisa
6 Menuju, akan
7 Tepat, hoki, atau bisa disebut juga ketuhanan
8 Makmur
9 Sukses

Maksukan No HP anda:
089686446002

0 khusus, special, langka,
8 Makmur
9 Sukses
6 Menuju, akan
8 Makmur
6 Menuju, akan
4 mati, miskin, susah,
4 mati, miskin, susah,
6 Menuju, akan
0 khusus, special, langka,
0 khusus, special, langka,
2 mudah, gampang, tidak sulit
*/