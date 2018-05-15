/*
Created by	: Yana
Time		: 15 Mei 2018 10.15
*/

import java.util.Scanner;

public class AndrianIf1{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String 	statusMember;
		int		jumlahLembar, harga, hargaMember, harga1, harga2, harga3, bayar;

		hargaMember	= 75;
		harga1		= 150;
		harga2		= 100;
		harga3		= 80;

		System.out.println("===========================================");
		System.out.print("Apakah Anda member (Y/N)            : ");
		statusMember = keyboard.next();
		System.out.print("Banyak lembar yang akan difotocopy  : ");
		jumlahLembar = keyboard.nextInt();
		System.out.println("===========================================");
		System.out.println();

		if ( statusMember.equals("Y")) {
			harga = hargaMember;
			bayar = harga * jumlahLembar;

			System.out.println("Harga                              : " +harga);
			System.out.println("Bayar                              : " +bayar);
				
		} else if ( statusMember.equals("N")) {
			if ( jumlahLembar > 200 ) {
				harga = harga3;
				bayar = harga * jumlahLembar;

				System.out.println("Harga                              : " +harga);
				System.out.println("Bayar                              : " +bayar);
			} 
			else if ( jumlahLembar >= 100 && jumlahLembar <= 200) {
				harga = harga2;
				bayar = harga * jumlahLembar;

				System.out.println("Harga                              : " +harga);
				System.out.println("Bayar                              : " +bayar);
			} 
			else if ( jumlahLembar < 100 ) {
				harga = harga1;
				bayar = harga * jumlahLembar;	

				System.out.println("Harga                              : " +harga);
				System.out.println("Bayar                              : " +bayar);
			} 
			
		}

		System.out.println("===========================================");
	}
}

/*
1.	Ada tempat fotokopi "Unity Fotocopy" apabila dia pelanggan pada tempat
	itu maka berapa lembar pun banyaknya dia fotokopi di dapat harga
	Rp.75,-.

	tapi jika dia bukan pelanggan maka :
	a. jika dia fotokopi kurang dari 100 lembar maka dapet harga Rp.150,-
	b. jika fotokopi sebanyak 100-200 lembar dapet harga Rp.100,-
	c. tapi jika fotokopi lebih dari 200 lembar dia dapet harga Rp.80,-

output:
==============================================
Apakah anda member (Y/N)		:....
Banyak lembar yang akan di fotocopy	:....
==============================================

Harga 					=
Bayar					= 
============================================== 
*/