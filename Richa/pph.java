/* 
Created by  		: Richa Fitria
Date/hour			: 23 Mei 2018/ 11.11 AM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;
import java.util.Random;

public class pph {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);

		int penghasilanBersih = 50000000, jmlAnak = 2, ptkp=0;
		double pkp, pph, pph1=0.05, pph2=0.15, pph3=0.25, pph4 =0.3, pphSetaun, pphSetaun1=0, pphSetaun2=0, pphSetaun3=0, pphSetaun4=0;
		String nikah="tidak";

		if (nikah.equals("tidak")) {
			if (jmlAnak>=0 && jmlAnak <= 3) {
				ptkp = 36000000 + (3000000*jmlAnak);
			}
			else if (jmlAnak>3) {
				ptkp = 36000000 + (3000000*3);
			}
		}
		else if (nikah.equals("ya") && jmlAnak <= 3 && jmlAnak >=0) {
			if (jmlAnak>=0 && jmlAnak <= 3) {
				ptkp = 39000000 + (3000000*jmlAnak);
			}
			else if (jmlAnak>3) {
				ptkp = 39000000 + (3000000*3);
			}
		}

		System.out.println("PTKP: " + ptkp);

		//pkp = (penghasilanBersih*12) - ptkp
		System.out.println("PKP: " );
		pkp = keyboard.nextDouble ();

		if (pkp > 500000000) {
			pphSetaun4 = (pkp - 500000000)*pph4;
			pphSetaun4 = pphSetaun4 + (250000000*pph3) + (200000000*pph2) + (50000000*pph1);
		}
		else if (pkp> 250000000 && pkp <= 500000000) {
			pphSetaun3 = (pkp - 250000000)*pph3;
			pphSetaun3 = pphSetaun3 + (200000000*pph2) + (50000000*pph1);
		}
		else if (pkp> 50000000 && pkp <= 250000000 ) {
			pphSetaun2 = (pkp - 50000000)*pph2;
			pphSetaun2 = pphSetaun2 + (50000000*pph1);
		}
		else if (pkp > 0 && pkp <= 50000000) {
			pphSetaun1 = pkp*pph1;
		}

		System.out.println(pphSetaun1);	
		System.out.println(pphSetaun2);	
		System.out.println(pphSetaun3);	
		System.out.println(pphSetaun4);	

		pphSetaun = pphSetaun1 + pphSetaun2 + pphSetaun3 + pphSetaun4;
		pph = pphSetaun;

		System.out.println("Pph = " + pph);

	}
}