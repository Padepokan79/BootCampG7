/*
	 Program     : Tugas 2 - Ikan Travel
     Creator     : Khairil
     Created At  : 14 Mei 2018 14:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class IkanTravel {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String bis60, bis45, bis32, bis18, bis12, bis6;
		int jumlahPenumpang, bisH60, bisH45, bisH32, bisH18, bisH12, bisH6, kap60, kap45, kap32, kap18, kap12, kap6, maxKap, recommend, recommend1, satu, dua, ;

		System.out.print("==========================");
		System.out.print("Selamat Datang di ikan Travel");
		System.out.println();
		System.out.print( "Masukkan Jumlah Penumpang  : (max 120)  " );
		jumlahPenumpang = keyboard.nextInt();

		bis60 = "Bis Dengan Kursi 60";
		bis45 = "Bis Dengan Kursi 45";
		bis32 = "Bis Dengan Kursi 32";
		bis18 = "Bis Dengan Kursi 18";
		bis12 = "Bis Dengan Kursi 12";
		bis6  = "Bis Dengan Kursi 6";

		bisH60 = 2300000;
		bisH45 = 2000000;
		bisH32 = 1800000;
		bisH18 = 1500000;
		bisH12 = 1300000;
		bisH6  = 2000000;

		maxKap = 120;
		kap60 = 60;
		kap45 = 45;
		kap32 = 32;
		kap18 = 18;
		kap12 = 12;
		kap6  = 6;		

		num7  = 7;
		num25 = 25;
		num30 = 30;
		num31 = 31;
		num37 = 37;
		num51 = 51;
		num58 = 58; 
		num64 = 64; 
		num72 = 72; 
		num78 = 78; 
		num91 = 91; 
		num106 = 106;
		num120 = 120;

		if(jumlahPenumpang <= maxKap) {
			System.out.print("Bus yang tersedia untuk anda");
			System.out.println();

			if( jumlahPenumpang >= kap60 ) {
				System.out.println( bis60 + "\t dengan harga : " + bisH60 );
			}
			if( jumlahPenumpang >= kap45 ) {
				System.out.println( bis45 + "\t dengan harga : " + bisH45 );
			}
			if( jumlahPenumpang >= kap32 ) {
				System.out.println( bis32 + "\t dengan harga : " + bisH32 );
			}
			if( jumlahPenumpang >= kap18 ) {
				System.out.println( bis18 + "\t dengan harga : " + bisH18 );
			}
			if( jumlahPenumpang >= kap12 ) {
				System.out.println( bis12 + "\t dengan harga : " + bisH12 );
			}						
			if( jumlahPenumpang >= kap6 || jumlahPenumpang >= 1) {
				System.out.println( bis6 + "\t dengan harga : " + bisH6 );
			}

			System.out.println();
			System.out.println(" * Rekomendasi Bis untuk anda : ");
			if(jumlahPenumpang <= kap6 ) {
				recommend = 1 * bisH6;
				System.out.println("1 " + bis6 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > num7 && jumlahPenumpang < kap12) {
				recommend = 2 * bisH6;
				System.out.println("2 " + bis6 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang == kap12) {
				recommend = 1 * bisH12;
				System.out.println("1 " + bis12 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > kap12 && jumlahPenumpang < kap18) {
				recommend = 2 * bisH6;
				System.out.println("2 " + bis12 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang == kap18) {
				recommend = 1 * bisH18;
				System.out.println("1 " + bis18 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > kap18 && jumlahPenumpang < num25) {
				recommend = 2 * bisH6;
				System.out.println("2 " + bis12 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang >= num25 && jumlahPenumpang <= num30) {
				recommend = 1 * bisH12 + 1 * bisH18;
				System.out.println("1 " + bis12 + " dan 1 " + bis18 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang == num31) {
				recommend = 2 * bisH18;
				System.out.println("2 " + bis18 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang == kap32) {
				recommend = 1 * bisH32;
				System.out.println("1 " + bis32 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > kap32 && jumlahPenumpang < num37) {
				recommend = 2 * bisH18;
				System.out.println("2 " + bis18 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang >= num37 && jumlahPenumpang < kap45) {
				recommend = 1 * bisH32 + 1 * bisH12;
				System.out.println("1 " + bis32 + " dan 1 " + bis12 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang == kap45) {
				recommend = 1 * bisH6;
				System.out.println("1 " + bis45 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > kap45 && jumlahPenumpang < num51) {
				recommend = 1 * bisH32 + 1 * bisH18;
				System.out.println("1 " + bis32 + " dan 1 " + bis18 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang >= num51 && jumlahPenumpang < num58) {
				recommend = 1 * bisH45 + 1 * bisH18;
				System.out.println("1 " + bis45 + " dan 1 " + bis18 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang >= num58 && jumlahPenumpang < kap60) {
				recommend = 1 * bisH45 + 1 * bisH18;
				System.out.println("1 " + bis45 + " dan 1 " + bis18 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang == kap60) {
				recommend = 2 * bisH60;
				System.out.println("1 " + bis60 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > kap60 && jumlahPenumpang <= num64) {
				recommend = 2 * bisH32;
				System.out.println("2 " + bis32 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > num64 && jumlahPenumpang <= num72) {
				recommend = 1 * bisH60 + 1 * bisH12;
				System.out.println("1 " + bis60 + " dan 1 " + bis12 + " dengan harga Rp " + recommend);
			}
			else if(jumlahPenumpang > num72 && jumlahPenumpang < num78) {
				recommend = 1 * bisH60 + 1 * bisH18;
				System.out.println("1 " + bis60 + " dan 1 " + bis18 + " dengan harga Rp " + recommend);
				recommend1 = 1 * bisH45 + 1 * bisH32;
				System.out.println("1 " + bis45 + " dan 1 " + bis32 + " dengan harga Rp " + recommend);				
			}
			else if(jumlahPenumpang == num78 ) {
				recommend1 = 1 * bisH60 + 1 * bisH18;
				System.out.println("1 " + bis60 + " dan 1 " + bis18 + " dengan harga Rp " + recommend1);				
			}
			else if(jumlahPenumpang > num78 && jumlahPenumpang < num91 ) {
				recommend1 = 1 * bisH45 + 1 * bisH45;
				System.out.println("1 " + bis45 + " dan 1 " + bis45 + " dengan harga Rp " + recommend1);			
			}
			else if(jumlahPenumpang >= num91 && jumlahPenumpang < num106) {
				recommend1 = 1 * bisH60 + 1 * bisH45;
				System.out.println("1 " + bis60 + " dan 1 " + bis45 + " dengan harga Rp " + recommend1);			
			}
			else if(jumlahPenumpang >= num106 && jumlahPenumpang <= num120) {
				recommend = 2 * bisH60;
				System.out.println("2 " + bis60 + " dengan harga Rp " + recommend);
			}
		}
		else {
			System.out.println("Permintaan anda tidak dapat melebihi 120 orang");
		}
	}
}