/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasTravel {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int bis1=0, bis2=12, bis3=18, bis4=32, bis5=45, bis6=60, kursi;
			int hargaBis1, hargaBis2, hargaBis3, hargaBis4, hargaBis5, hargaBis6, uang;
			int jumlahBis1, jumlahBis2, jumlahBis3, jumlahBis4, jumlahBis5, jumlahBis6, jumlahbis;

			hargaBis1 = 2000000;
			hargaBis2 = 1300000;
			hargaBis3 = 1500000;
			hargaBis4 = 1800000;
			hargaBis5 = 2000000;
			hargaBis6 = 2300000;


			System.out.println("=================================================");
			System.out.println("SELAMAT DATANG DI TRAVEL IKAN");
			System.out.println("Silahkan masukan jumlah penumpnag: ");
			kursi = key.nextInt();
			System.out.println("\nBus yang tersedia untuk anda : ");

			if ( kursi > bis1 ){
				System.out.println("Bis dengan jumlah kursi 6 Executive \t"+hargaBis1);
			}
			if ( kursi >= bis2 ){
				System.out.println("Bis dengan jumlah kursi 12 \t\t"+hargaBis2);
			}
			if ( kursi >= bis3 ){
				System.out.println("Bis dengan jumlah kursi 18 \t\t"+hargaBis3);
			}
			if ( kursi >= bis4 ){
				System.out.println("Bis dengan jumlah kursi 32 \t\t"+hargaBis4);
			}
			if ( kursi >= bis5 ){
				System.out.println("Bis dengan jumlah kursi 45 \t\t"+hargaBis5);
			}
			if ( kursi >= bis6 ){
				System.out.println("Bis dengan jumlah kursi 60 \t\t"+hargaBis6);
			}
			if ( kursi > 120 ){
				System.out.println("Maaf sudah melebihi quota yang tersedia");
			}

			System.out.println("=================================================");
			System.out.println("Rekomendasi untuk anda: ");
			if ( kursi <= bis1) {
				System.out.println("1 Bis 6 penumpang Executive "+hargaBis1 );
			}
			else if ( kursi > bis1 && kursi < bis2) {
				System.out.println("2 Bis 6 penumpang Executive "+(hargaBis1+hargaBis1));
			}
			else if ( kursi == bis2) {
				System.out.println("1 Bis 12 penumpang  "+hargaBis2);
			}
			else if ( kursi > bis2 && kursi < bis3) {
				System.out.println("2 Bis 12 penumpang  "+(hargaBis2+hargaBis2));
			}
			else if ( kursi == bis3) {
				System.out.println("1 Bis 18 penumpang "+hargaBis3);
			}
			else if ( kursi > bis3 && kursi <= (bis2+bis2) ) {
				System.out.println("2 Bis 12 penumpang  "+(hargaBis2+hargaBis2));
			}
			else if ( kursi > (bis2+bis2) && kursi <= (bis2+bis2+bis1) ) {
				System.out.println("1 Bis 12 penumpang + 1 Bis 18 penumpang "+(hargaBis2+hargaBis3));
			}
			else if ( kursi < bis4 ) {
				System.out.println("2 Bis 18 penumpang "+(hargaBis3+hargaBis3));
			}
			else if ( kursi == bis4 ) {
				System.out.println("1 Bis 32 penumpang "+hargaBis4);
			}
			else if ( kursi > bis4 && kursi <= (bis2+bis2+bis2)) {
				System.out.println("2 Bis 18 penumpang "+(hargaBis3+hargaBis3));
			}
			else if ( kursi > (bis2+bis2+bis2) && kursi <= (bis4+bis2) ) {
				System.out.println("1 Bis 12 penumpang + 1 Bis 32 penumpang "+(hargaBis2+hargaBis4));
			}
			else if ( kursi == bis5) {
				System.out.println("1 Bis 45 penumpang "+hargaBis5);
			}
			else if ( kursi > bis5 && kursi <= (bis3+bis4)) {
				System.out.println("1 Bis 18 penumpang + 1 Bis 32 penumpang "+(hargaBis3+hargaBis4));
				System.out.println("1 Bis 12 penumpang + 1 Bis 45 penumpang "+(hargaBis2+hargaBis5));
			}
			else if ( kursi > (bis3+bis4) && kursi < bis6) {
				System.out.println("2 Bis 32 penumpang "+(hargaBis4+hargaBis4));
			}
			else if ( kursi == bis6) {
				System.out.println("1 Bis 60 penumpang "+hargaBis5);
			}
			else if ( kursi > bis6 && kursi < (bis4+bis4)) {
				System.out.println("1 Bis 18 penumpang + 1 Bis 45 penumpang "+(hargaBis3+hargaBis5));
			}
			else if ( kursi == (bis4+bis4) ) {
				System.out.println("2 Bis 32 penumpang "+(hargaBis4+hargaBis4));
				System.out.println("1 Bis 12 penumpang + 1 Bis 60 penumpang "+(hargaBis2+hargaBis6));
			}
			else if ( kursi > (bis4+bis4) && kursi <= (bis2+bis6)) {
				System.out.println("1 Bis 60 penumpang + 1 Bis 12 penumpang "+(hargaBis6+hargaBis2));
			}
			else if ( kursi > (bis2+bis6) && kursi < (bis6+bis3)) {
				System.out.println("1 Bis 18 penumpang + 1 Bis 60 penumpang "+(hargaBis3+hargaBis6));
				System.out.println("1 Bis 32 penumpang + 1 Bis 45 penumpang "+(hargaBis4+hargaBis5));
			}
			else if ( kursi == (bis6+bis3)) {
				System.out.println("1 Bis 18 penumpang + 1 Bis 60 penumpang "+(hargaBis3+hargaBis6));
			}
			else if ( kursi > (bis6+bis3) && kursi <= (bis5+bis5)) {
				System.out.println("2 Bis 45 penumpang "+(hargaBis5+hargaBis5));
			}
			else if ( kursi > (bis5+bis5) && kursi <= (bis5+bis4) ) {
				System.out.println("1 Bis 32 penumpang + 1 Bis 60 penumpang "+(hargaBis4+hargaBis6));
			}
			else if ( kursi > (bis5+bis4) && kursi <= (bis5+bis6)) {
				System.out.println("1 Bis 60 penumpang + 1 Bis 45 penumpang "+(hargaBis6+hargaBis5));
			}
			else if ( kursi > (bis5+bis5) && kursi <= (bis6+bis6)) {
				System.out.println("2 Bis 60 penumpang "+(hargaBis6+hargaBis6));
			}
			else if ( kursi >= (bis6+bis6) ){
				System.out.println("Maaf sudah melebihi quota yang tersedia");
			}
			System.out.println("=================================================");

			System.out.println();

		}
	}