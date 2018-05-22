/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 10:35AM

Soal :

Micheal sedang memainkan sebuah permainan classik tebak huruf. Dimana Pemain dinyatakan menang jika salah satu pemain 
memiliki nyawa mencapai 16.
 - nyawa awal yang tersedia : - Player 1 nyawa
			      - Komputer 1 nyawa 
 - ada 2 kesempatan bermain dalam 1 ronde
 - max 20 ronde, dan pemain dinyatakan menang.
 - jika tebakan player sama dengan tebakan komputer, maka player mendapatkan 2 nyawa
 - jika tebakan player salah, maka nyawa player berkurang 1 dan komputer bertambah 2 nyawa
 
 - jika pemain palyer menang pada ronde <= 8 --> "CHEATER"
   jika pemain palyer menang pada ronde > 8 && <= 11  --> "NICE"
   jika pemain palyer menang pada ronde > 11 --> "NOOB"
 - jika selisih nyawa player dengan nyawa komputer = 6, maka permainan dimenangkan oleh pemain yang memiliki nyawa 
   lebih unggul

*/
import java.util.Scanner;
import java.util.Random;
 public class SoalWhileChaudry{
 	public static void main(String[] args){
 		Scanner scan = new Scanner(System.in);
 		Random random = new Random();

 		int nyawaPemain, nyawaKomp, maxRonde, ronde, kesempatan, maxNyawa, nol, satu, dua, enam, minEnam, delapan, sebelas, duaEnam;

 		char tebakanKomp = 'A';
 		char tebakanPemain = '1';

 		nyawaPemain	= 1;     nol 	= 0; 	delapan		= 8;
 		nyawaKomp	= 1; 	 satu 	= 1;	sebelas		= 11;
 		maxRonde	= 20;	 dua 	= 2;	duaEnam 	= 26;
 		maxNyawa	= 16; 	 enam 	= 6;
 		ronde 		= 1; 	 minEnam= -6;

 		boolean selisih = ( (nyawaPemain-nyawaKomp == enam) || (nyawaPemain-nyawaKomp == minEnam) );
			while(nyawaPemain >= nol && nyawaKomp < maxNyawa && nyawaPemain < maxNyawa && ronde <= maxRonde && !(selisih)){
 					System.out.println();
		 			tebakanKomp = (char)(random.nextInt(duaEnam)+'A');
		 			System.out.println("================================");
		 			System.out.println("Tebakan komputer : "+tebakanKomp);

		 			kesempatan	= satu;
		 			System.out.println("Ronde ke : "+ronde);
		 			System.out.print("--------------------------------");
		 			while( kesempatan <= dua ){
		 				System.out.println();
		 				System.out.println("Kesempatan: "+kesempatan);
		 				System.out.println("nyawa pemain: "+nyawaPemain);
		 				System.out.println("nyawa komputer: "+nyawaKomp);
		 				System.out.println();
		 				System.out.print("Tebakan anda (A-Z): ");
			 			tebakanPemain = scan.next().charAt(nol);
			 			if ( tebakanPemain == tebakanKomp ) {
			 				nyawaPemain += dua;
			 				kesempatan += dua;
		 					System.out.println();
		 					System.out.print("-----BENAR-----");
		 					System.out.println();
			 			}else{
		 					System.out.println();
		 					System.out.print("-----SALAH-----");
		 					System.out.println();
			 				kesempatan++;
			 			}

		 			}
		 			if ( !(tebakanPemain == tebakanKomp) ) {
		 				nyawaKomp += dua;
			 			nyawaPemain -= satu;	
		 			}
		 			ronde++;
		 			selisih	= ( (nyawaPemain-nyawaKomp >= enam) || (nyawaPemain-nyawaKomp <= minEnam) );
 			}
 				if ( selisih ) {
 					if ( nyawaKomp > nyawaPemain ) {
 						System.out.println("KOMPUTER PEMENANGNYA");
 					}else{
 						System.out.println("ANDA PEMENANGNYA");
 						if ( ronde <= delapan ) {
		 					System.out.println("CHEATER");
			 			}else if ( ronde > delapan && ronde <= sebelas ) {
			 				System.out.println("NICE");
			 			}else if ( ronde > sebelas ) {
			 				System.out.println("NOOB");
			 			}
 					}
 				}else if ( ronde >= maxRonde ) {
 					if ( nyawaKomp > nyawaPemain ) {
 						System.out.println("KOMPUTER PEMENANGNYA");
 					}else{
 						System.out.println("ANDA PEMENANGNYA");
 						if ( ronde <= delapan ) {
		 					System.out.println("CHEATER");
			 			}else if ( ronde > delapan && ronde <= sebelas ) {
			 				System.out.println("NICE");
			 			}else if ( ronde > sebelas ) {
			 				System.out.println("NOOB");
			 			}
 					}
 				}else if ( nyawaPemain >= maxNyawa) {
		 			System.out.println("ANDA PEMENANGNYA");
		 			if ( ronde <= delapan ) {
		 				System.out.println("CHEATER");
		 			}else if ( ronde > delapan && ronde <= sebelas ) {
		 				System.out.println("NICE");
		 			}else if ( ronde > sebelas ) {
		 				System.out.println("NOOB");
		 			}
		 		}else if ( nyawaKomp >= maxNyawa ) {
		 			System.out.println("KOMPUTER PEMENANGNYA");
		 		}else if( nyawaPemain < nol ) {
		 			System.out.println("KOMPUTER PEMENANGNYA");
		 			
		 		}
 			
 	}
 }