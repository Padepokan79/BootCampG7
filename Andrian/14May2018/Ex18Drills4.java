/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex18Drills4 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int bis1=0, bis2=12, bis3=18, bis4=32, bis5=45, bis6=60, kursi;

			System.out.println("SELAMAT DATANG DI TRAVEL IKAN");
			System.out.println("Silahkan masukan jumlah penumpnag: ");
			kursi = key.nextInt();

			if ( kursi > bis1 ){
				System.out.println("Bis dengan jumlah kursi 6 Executive");
			}
			if ( kursi >= bis2 ){
				System.out.println("Bis dengan jumlah kursi 12");
			}
			if ( kursi >= bis3 ){
				System.out.println("Bis dengan jumlah kursi 18");
			}
			if ( kursi >= bis4 ){
				System.out.println("Bis dengan jumlah kursi 32");
			}
			if ( kursi >= bis5 ){
				System.out.println("Bis dengan jumlah kursi 45");
			}
			if ( kursi >= bis6 ){
				System.out.println("Bis dengan jumlah kursi 60");
			}

		}
	}