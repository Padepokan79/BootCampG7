/*
	 Program     : Soal 1 - Andrian
     Creator     : Khairil
     Created At  : 15 Mei 2018 10:25 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class AndrianIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String memberYT;
		int jumlahHelai, harga, memberHarga, nonMemberHarga1, nonMemberHarga2, nonMemberHarga3, pembayaran, seratus, duaRatus;
		boolean memberY, memberT;

		memberHarga = 75;
		nonMemberHarga1 = 150;
		nonMemberHarga2 = 100;
		nonMemberHarga3 = 80;
		seratus = 100;
		duaRatus = 200;
	
		System.out.println("==============================================");
		System.out.print("Apakah anda member (Y/N)			:.... ");
		memberYT = keyboard.next();
		System.out.print("Banyak lembar yang akan di fotocopy	:.... ");
		jumlahHelai = keyboard.nextInt();

		memberY = memberYT.equals("Y");
		memberT = memberYT.equals("T");

		if( memberY == true ) {
			harga = memberHarga;
			pembayaran = harga * jumlahHelai;
			System.out.println("==============================================");
			System.out.println();
			System.out.println("Harga 					=			" + harga);
			System.out.println("Bayar					=			" + pembayaran); 
			System.out.println("==============================================");				
		}
		else {
			if(jumlahHelai < seratus ) {
				harga = nonMemberHarga1;
				pembayaran = harga * jumlahHelai;
				System.out.println("==============================================");
				System.out.println();
				System.out.println("Harga 					=			" + harga);
				System.out.println("Bayar					=			" + pembayaran); 
				System.out.println("==============================================");						
			}
			else if(jumlahHelai >= seratus && jumlahHelai <= duaRatus) {
				harga = nonMemberHarga2;
				pembayaran = harga * jumlahHelai;
				System.out.println("==============================================");
				System.out.println();
				System.out.println("Harga 					=			" + harga);
				System.out.println("Bayar					=			" + pembayaran); 
				System.out.println("==============================================");							
			}
			else if(jumlahHelai > duaRatus){
				harga = nonMemberHarga3;
				pembayaran = harga * jumlahHelai;
				System.out.println("==============================================");
				System.out.println();
				System.out.println("Harga 					=			" + harga);
				System.out.println("Bayar					=			" + pembayaran); 
				System.out.println("==============================================");						
			}
		}
	}
}